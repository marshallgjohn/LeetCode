package com.johngmarshall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectFour {
    public static String whoIsWinner(List<String> piecesPositionList) {
        String[][] board = new String[6][7];
        int a = 5,b = 5,c = 5,d = 5,e = 5,f = 5,g = 5;


        for(String piece : piecesPositionList) {
            String[] chip = piece.split("_");
            switch(chip[0]) {
                case "A":
                    board[a][0] = chip[1];
                    a--;
                    break;
                case "B":
                    board[b][1] = chip[1];
                    b--;
                    break;
                case "C":
                    board[c][2] = chip[1];
                    c--;
                    break;
                case "D":
                    board[d][3] = chip[1];
                    d--;
                    break;
                case "E":
                    board[e][4] = chip[1];
                    e--;
                    break;
                case "F":
                    board[f][5] = chip[1];
                    f--;
                    break;
                case "G":
                    board[g][6] = chip[1];
                    g--;
                    break;
            }
        }

        for(int x =0; x < board.length;x++) {
            for(int y=0; y < board[x].length;y++) {
                System.out.print(board[x][y]+",");
            }
            System.out.println();
        }

        // retrun "Red" or "Yellow" or "Draw"
        return "Draw";
    }

    public static void main(String[] args) {
        whoIsWinner(new ArrayList<String>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        )));
    }
}
