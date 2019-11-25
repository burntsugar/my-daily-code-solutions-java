package com.rach.problem.four;

import java.util.Arrays;

public class ProblemFourCheat {

    /**
     * Cheat.
     * Sorting the array first requires extra time (not O(n)).
     * Algorithm achieves 0(n) space.
     * @param arr array of integers.
     * @return first missing positive integer, or 0.
     */
    public static int cheat(int[] arr) {

        Arrays.sort(arr);

        Arrays.stream(arr).forEach(el -> System.out.print(el+", "));
        System.out.println();

        for(int i = 0; i <= arr.length - 1; i++){
            // if negatives, ignore.
            if (arr[i] < 0){
                continue;
            }
            // if current is same as next, ignore.
            if (arr[i]==arr[i+1]) {
                continue;
            }
            // if next val does not equal current val + 1, return.
            if (arr[i+1] != arr[i]+1) {
                return (arr[i] + 1);
            }
        }

        return 0;

    }

}
