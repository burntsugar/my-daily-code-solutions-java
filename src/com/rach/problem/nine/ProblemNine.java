package com.rach.problem.nine;

public class ProblemNine {

    public static int solve(int[] arr){

        int inclusive = arr[0];
        int exclusive = 0;
        int temp;

        for (int i = 1; i < arr.length; i++){
            temp = inclusive;
            inclusive = Math.max(inclusive,exclusive+arr[i]);
            exclusive = temp;
        }

        return Math.max(inclusive,exclusive);
    }
}
