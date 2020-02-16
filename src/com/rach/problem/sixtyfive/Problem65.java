package com.rach.problem.sixtyfive;

import java.util.Arrays;

public class Problem65 {

    public static int[] solve(int[][] arr){

        int spiralArr[] = new int[arr[0].length * arr.length];
        int element = 0;

        int leftCol = 0;
        int rightCol = arr[0].length-1;
        int topRow = 0;
        int bottomRow = arr.length-1;

        while(leftCol <= rightCol || topRow <= bottomRow) {

            for (int col = leftCol; col <= rightCol; col++) {
                if(element >= spiralArr.length)break;
                spiralArr[element] = arr[topRow][col];
                element++;
            }
            topRow++;
            for (int row = topRow; row <= bottomRow; row++) {
                if(element >= spiralArr.length)break;
                spiralArr[element] = arr[row][rightCol];
                element++;
            }
            rightCol--;
            for (int col = rightCol; col >= leftCol; col--) {
                if(element >= spiralArr.length)break;
                spiralArr[element] = arr[bottomRow][col];
                element++;
            }
            bottomRow--;
            for (int row = bottomRow; row >= topRow; row--) {
                if(element >= spiralArr.length)break;
                spiralArr[element] = arr[row][leftCol];
                element++;
            }
            leftCol++;

        }

        Arrays.stream(spiralArr).forEach((s) -> System.out.print(s + ","));
        return spiralArr;

    }

}
