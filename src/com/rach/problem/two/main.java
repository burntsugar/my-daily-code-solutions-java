package com.rach.problem.two;

import java.util.List;

public class main {

    public static void main(String[] args){
        problemTwo();
    }

    public static void problemTwo(){
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = ProblemTwo.solve(arr);
        System.out.print(list.toString());
    }
}
