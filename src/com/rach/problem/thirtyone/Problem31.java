package com.rach.problem.thirtyone;

public class Problem31 {

//    public static int solve(String oldString, String newString){
//
//        int countChanges = 0;
//        for (int i = 0; i < oldString.length(); i++){
//            if(i == oldString.length() -1)break;
//            if (oldString.charAt(i) != newString.charAt(i)){
//                countChanges +=1;
//            }
//        }
//        countChanges += Math.abs(oldString.length() - newString.length());
//        return countChanges;
//    }

    public static int solve(String str1, String str2){

        int editDistance = 0;
        int i = -1;
        while(++i < str1.length() - 1){
            if (str1.charAt(i) != str2.charAt(i)){
                editDistance += 1;
            }
        }
        editDistance += Math.abs(str1.length() - str2.length());
        return editDistance;
    }
}
