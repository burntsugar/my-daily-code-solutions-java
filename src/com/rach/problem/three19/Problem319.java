package com.rach.problem.three19;

import java.util.Arrays;

public class Problem319 {

    public static void main(String args[]) {
        solve();
    }

    public static int[][] solve() {
        int state[][] = new int[3][3];
        Tile t[][] = new Tile[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = new Tile(j, i);
                state[i][j] = t[i][j].getTilePosition(t.length - 1);
                if (i == 2 && j == 1) {
                    t[2][2] = null;
                    break;
                }
            }
        }

        Arrays.stream(state[0]).forEach(j -> System.out.print(j));
        Arrays.stream(state[1]).forEach(j -> System.out.print(j));
        Arrays.stream(state[2]).forEach(j -> System.out.print(j));

        return state;
    }

}
