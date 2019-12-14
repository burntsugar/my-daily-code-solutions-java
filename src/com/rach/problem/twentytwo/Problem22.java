package com.rach.problem.twentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem22 {

    public static String[] solve(String[] arr, String str) {
        List<String> words = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (str.startsWith(arr[j])) {
                    words.add(arr[j]);
                    str = str.substring(arr[j].length());
                }
            }
        }
        words.forEach((w) -> System.out.println(w));
        String[] wordsArray = new String[words.size()];
        wordsArray = words.toArray(wordsArray);
        return wordsArray;
    }

}