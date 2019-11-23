package com.rach.problem.one;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        problemOne();
    }

    public static void problemOne(){
        int k = 17;
        int[] arr = {10,15,3,7,2};
        List<int[]> pairs = ProblemOne.solve(k,arr);
        System.out.println("Number of pairs: " + pairs.size());
        System.out.println("Pairs...");
        for(int i = 0; i < pairs.size(); i++){
            System.out.println(pairs.get(i)[0] + ", " + pairs.get(i)[1]);
        }
    }


}
