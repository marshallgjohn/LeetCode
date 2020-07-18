package com.johngmarshall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimpleAssemblerInterpreter {
    public static Map<String, Integer> interpret(String[] program) {
        System.out.println(Arrays.asList(program));
        Map<String, Integer> ret = new HashMap<>();
        ArrayList<Integer> skip = new ArrayList<>();
        for (int i = 0; i < program.length; i++) {
            //System.out.println(i);
            if (!skip.contains(i)) {
                String[] x = program[i].split(" ");
                switch (x[0]) {
                    case "mov":
                        if (!ret.containsKey(x[1]) && x[2].matches("-?\\d+(\\.\\d+)?") ) {
                            ret.put(x[1], Integer.parseInt(x[2]));
                        } else if(ret.containsKey(x[1]) && x[2].matches("-?\\d+(\\.\\d+)?")) {
                            ret.put(x[1], Integer.parseInt(x[2]));
                        } else {
                            ret.put(x[1], ret.get(x[2]));
                        }
                        break;
                    case "inc":
                        ret.put(x[1], ret.get(x[1]) + 1);
                        break;
                    case "dec":
                        ret.put(x[1], ret.get(x[1]) - 1);
                        break;
                    case "jnz":
                        if (!ret.containsKey(x[1]) || x[1].matches("-?\\d+(\\.\\d+)?")) {
                            int value = Integer.parseInt(x[2]);
                            if(x[1].matches("-?\\d+(\\.\\d+)?")) {
                                value--;
                            }
                            i += value;
                        } else {

                            if (ret.get(x[1]) != 0) {
                                if (!ret.containsKey(x[2])) {
                                    i += Integer.parseInt(x[2]) + ((Integer.parseInt(x[2]) < 0) ? -1: 0);
                                } else {
                                    i += ret.get(x[2]) + ((ret.get(x[2]) < 0) ? -1: 0);
                                }
                                skip.clear();
                            } else {
                                skip.add(i);
                            }
                        }
                            break;
                }

            }
        }
        return ret;
    }

    public static void main(String[] args) {
        /*String[] program = new String[]{
                "mov a 1", "mov b 1", "mov c 0", "mov d 26", "jnz c 2", "jnz 1 5", "mov c 7", "inc d", "dec c",
                "jnz c -2", "mov c a", "inc a", "dec b", "jnz b -2", "mov b c", "dec d", "jnz d -6", "mov c 18",
                "mov d 11", "inc a", "dec d", "jnz d -2", "dec c", "jnz c -5"};*/
        String[] program = new String[] {
                "mov a 1", "mov b 1", "mov c 0", "mov d 26", "jnz c 2", "jnz 1 5", "mov c 7", "inc d", "dec c", "jnz c -2", "mov c a",
                "inc a", "dec b", "jnz b -2", "mov b c", "dec d", "jnz d -6", "mov c 18", "mov d 11", "inc a", "dec d", "jnz d -2", "dec c", "jnz c -5"
        };
        System.out.println(Arrays.asList(interpret(program)));

    }
}
