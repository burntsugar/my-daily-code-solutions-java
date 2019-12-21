package com.rach.problem;

import javax.swing.*;

public class IgnoreSomething {

    public static void main(String[] args){
        System.out.println(something(89,1));
        System.out.println(something(92,1));
        System.out.println(something(46288, 3));
        System.out.println(something(695,2));


    }

        public static long something(int n, int p){
            //695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
//            Integer n = 695;
//            int p = 2;


            char[] chars = Integer.toString(n).toCharArray();
            long[] nums = new long[chars.length];
            int i = 0;
            for (char c : chars){
                nums[i++] = c-'0';
            }
            int pow = p;
            long sum = 0;
            for (int j = 0; j < nums.length; j++ ){
                sum += Math.pow(nums[j], pow++);
            }
            System.out.println("s"+sum);

            double result = sum / n;
            System.out.println("r"+result);
            if (sum%n==0){
                return (long)result;
            } else {
                return -1;
            }

        }


}
