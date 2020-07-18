package com.johngmarshall;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FSM {
    public static String traverseStates(String[] events) {
        System.out.println(Arrays.asList(events).toString());
        String state = "ERROR";

        Map<String, Map<String, String>> map = new HashMap<>();
        map.put("APP_PASSIVE_OPEN", new HashMap<>());
        map.get("APP_PASSIVE_OPEN").put("LISTEN", "LISTEN");


        map.put("LISTEN", new HashMap<>());
        map.get("LISTEN").put("RCV_SYN", "SYN_RCVD");
        map.get("LISTEN").put("APP_SEND", "SYN_SENT");
        map.get("LISTEN").put("APP_CLOSE", "CLOSED");

        map.put("APP_ACTIVE_OPEN", new HashMap<>());
        map.get("APP_ACTIVE_OPEN").put("SYN_SENT", "SYN_SENT");


        map.put("SYN_RCVD", new HashMap<>());
        map.get("SYN_RCVD").put("APP_CLOSE", "FIN_WAIT_1");
        map.get("SYN_RCVD").put("RCV_ACK", "ESTABLISHED");

        map.put("SYN_SENT", new HashMap<>());
        map.get("SYN_SENT").put("RCV_SYN", "SYN_RCVD");
        map.get("SYN_SENT").put("RCV_SYN_ACK", "ESTABLISHED");
        map.get("SYN_SENT").put("APP_CLOSE", "CLOSED");

        map.put("ESTABLISHED", new HashMap<>());
        map.get("ESTABLISHED").put("APP_CLOSE", "FIN_WAIT_1");
        map.get("ESTABLISHED").put("RCV_FIN", "CLOSE_WAIT");

        map.put("FIN_WAIT_1", new HashMap<>());
        map.get("FIN_WAIT_1").put("RCV_FIN", "CLOSING");
        map.get("FIN_WAIT_1").put("RCV_FIN_ACK", "TIME_WAIT");
        map.get("FIN_WAIT_1").put("RCV_ACK", "FIN_WAIT_2");

        map.put("CLOSING", new HashMap<>());
        map.get("CLOSING").put("RCV_ACK", "TIME_WAIT");

        map.put("FIN_WAIT_2", new HashMap<>());
        map.get("FIN_WAIT_2").put("RCV_FIN", "TIME_WAIT");

        map.put("TIME_WAIT", new HashMap<>());
        map.get("TIME_WAIT").put("APP_TIMEOUT", "CLOSED");

        map.put("CLOSE_WAIT", new HashMap<>());
        map.get("CLOSE_WAIT").put("APP_CLOSE", "LAST_ACK");

        map.put("LAST_ACK", new HashMap<>());
        map.get("LAST_ACK").put("RCV_ACK", "CLOSED");


        for (int i = 0; i < events.length; i++) {
            if(state.equals("CLOSED") && events[i].equals("APP_PASSIVE_OPEN") || state.equals("CLOSED") && events[i].equals("APP_ACTIVE_OPEN")) {
                state = events[i];
            }

            try {
                if (i == 0 || state.equals("APP_PASSIVE_OPEN") || state.equals("APP_ACTIVE_OPEN")) {
                    if (events[i].equals("APP_ACTIVE_OPEN")) {
                        state = "SYN_SENT";
                    } else {
                        state = map.get(events[i]).get("LISTEN");
                    }

                } else {
                    state = map.get(state).get(events[i]);
                }
            } catch (Exception e) {
                return "ERROR";
            }

        }
        return (state == null) ? "ERROR" : state;
    }

    public static void main(String[] args) {
        System.out.println(traverseStates(new String[]{"APP_PASSIVE_OPEN", "APP_CLOSE", "APP_PASSIVE_OPEN", "RCV_SYN"}));
    }
}
