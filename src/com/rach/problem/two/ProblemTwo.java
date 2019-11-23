package com.rach.problem.two;

import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {

    public static List<Integer> solve(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for(int o = 0; o < arr.length; o++){
            int product = 1;
            for(int i = 0; i < arr.length; i++) {
                if(i != o) {
                    product *= arr[i];
                }
            }
            list.add(product);
        }
        return list;
    }
}
