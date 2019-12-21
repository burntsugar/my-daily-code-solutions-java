package com.rach.problem.thirty;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Problem30 {

    public static int solve(int[] nums){
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int trappedWater = 0;

        // highest num to the left of each num...
        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = Math.max(left[i - 1], nums[i]);
        }

        // highest num to the right of each num...
        right[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], nums[i]);

        }

        // min of left and right minus num
        for (int i = 0; i < nums.length; i++) {
            trappedWater += Math.min(left[i], right[i]) - nums[i];
        }

        return trappedWater;
    }
}
