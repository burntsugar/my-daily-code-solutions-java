package com.rach.problem.twentynine;

public class Problem29 {

    public static String solve(String str){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()){
            char currentChar = str.charAt(i);
            int count = 1;
            while((i < str.length()) && (str.charAt(i) == str.charAt(i+1))){
                count ++;
                i++;
                if ((i+1)>= str.length()) break;
            }
            i++;
            sb.append(count);
            sb.append(currentChar);
        }
        return sb.toString();
    }
}
