package com.rach.problem.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemOne {

    public static List<int[]> solve(int k, int[] arr){
        List<int[]> pairs = new ArrayList<>();
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length -1;
        while (l < r){
            if(arr[l] + arr[r] == k) {
                int[] a = {arr[l],arr[r]};
                pairs.add(a);
            }
            if (arr[l] + arr[r] < k) {
                l++;
            } else {
                r--;
            }
        }
        return pairs;
    }
}
