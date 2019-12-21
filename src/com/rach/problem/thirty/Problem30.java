package com.rach.problem.thirty;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Problem30 {

//    public static int solve(int[] nums){
//        int acc = 0;
//        int next = 0;
//        while (next < nums.length){
//            System.out.println("next: " + next);
//            int cwh = nums[next];
//            if (nums[++next] <= cwh){
//                acc += Math.abs((cwh - nums[next]));
//            }
//            if (next == nums.length - 1){
//                break;
//            }
//        }
//        return acc;
//    }

//    public static int solve(int[] nums){
//        int acc = 0;
//        int sum = Arrays.stream(nums).sum();
//        OptionalDouble avg = Arrays.stream(nums).average();
//        OptionalInt max = Arrays.stream(nums).max();
//
//        System.out.println( sum + " " + avg + " " + max);
//
//        int maxHeight = max.getAsInt() - (int)avg.getAsDouble();
//        System.out.println(maxHeight);
//        int totalGrid = nums.length * maxHeight;
//        System.out.println(totalGrid);
//        System.out.println(sum - totalGrid);
//
//        return acc;
//    }


//        public static int solve(int[] nums){
//
//            int max = 0;
//            int acc = 0;
//            for (int i = 0; i < nums.length; i++){
//                int cwh = nums[i];
//                acc += cwh;
//                int nextIndex = i;
//                while (nums[++nextIndex] <= cwh){
//                    acc += nums[nextIndex];
//                }
//                if (nextIndex == nums.length){
//                    nextIndex -= 1;
//                }
//                System.out.println(nextIndex);
//                int numOfColsInIt = nextIndex - i;
//                int gridSize = nums[i] * numOfColsInIt;
//                System.out.println(gridSize);
//                System.out.println(acc);
//                System.out.println(gridSize - acc);
//                System.out.println();
//            }
//
//        return acc;
//    }

//    public static int solve(int[] nums){
//
//        int max = 0;
//        int acc = 0;
//            int i = 0;
//        while (i < nums.length){
//            int cwh = nums[i];
//            acc += cwh;
//            int nextIndex = i;
////            while (nums[++nextIndex] <= cwh){
//            while (++nextIndex < nums.length && nums[nextIndex] <= cwh){
//                acc += nums[nextIndex];
//            }
//            if (nextIndex == nums.length){
//                nextIndex -= 1;
//            }
//            System.out.println(nextIndex);
//            int numOfColsInIt = nextIndex - i;
//            int gridSize = nums[i] * numOfColsInIt;
//            System.out.println(gridSize);
//            System.out.println(acc);
//            System.out.println(gridSize - acc);
//            i += nextIndex;
//            System.out.println("index: " + i);
//            System.out.println();
//            if (i == nums.length -1){
//                break;
//            }
//
//        }
//
//        return acc;
//    }

//    public static int solve(int[] nums){
//
//        int acc = 0;
//        int spaces = 0;
//        int i = 0;
//        while (i < nums.length-1){
//            int cwh = nums[i];
//            acc += cwh;
//
//            System.out.println("add cwh: " + cwh);
//            ++i;
//            while (i < nums.length && nums[i] <= cwh){
//                acc += nums[i];
//                System.out.println("add nums[i]: " + nums[i]);
//                ++i;
//            }
//
//            System.out.println("i: " + i);
//
//            int numOfColsInIt = (nums.length - (nums.length - i));
//
//            System.out.println("numOfColsInIt= " + numOfColsInIt);
//            int gridSize = cwh * numOfColsInIt;
//            System.out.println("gridSize= " + gridSize);
//            System.out.println("acc= " +acc);
//            System.out.println("gridSize - acc= " + (gridSize - acc));
//            spaces += gridSize - acc;
//            System.out.println("index= " + i);
//            System.out.println();
//
//        }
//
//        return spaces;
//    }

//    public static int solve(int[] nums){
//        int wallSegments = 0;
//        int wallSpaces = 0;
//        int i = 0;
//        while (i < nums.length-1){
//            int currentWallHeight = nums[i];
//            wallSegments += currentWallHeight;
//            ++i;
//            while (i < nums.length && nums[i] <= currentWallHeight){
//                wallSegments += nums[i];
//                ++i;
//            }
//            int numOfWalls = (nums.length - (nums.length - i));
//            int gridSize = currentWallHeight * numOfWalls;
//            wallSpaces += gridSize - wallSegments;
//
//            System.out.println("numOfWalls: " + numOfWalls);
//            System.out.println("gridSize= " + gridSize);
//            System.out.println("wallSpaces= " + wallSpaces);
//        }
//        return wallSpaces;
//    }

//    public static int solve(int[] nums){
//        int wallSpaces = 0;
//        int wallSegments = 0;
//        int max_height = 0;
//
//        for (int i = 0 ; i <nums.length;i++) {
//            System.out.println("nums[i]= " + nums[i]);
//            max_height = nums[i] > max_height ? nums[i] : max_height;
//            if ((i + 1) == nums.length) {
//                wallSegments += nums[i];
//            } else {
//
//                wallSegments += Math.abs(nums[i + 1] - max_height);
//            }
//            System.out.println("wallSegments= " + wallSegments);
//            System.out.println("max_height= " + max_height);
//            System.out.println();
//        }
//
//        int gridSize = nums.length * max_height;
//        System.out.println("gridSize= " + gridSize);
//        wallSpaces = gridSize - wallSegments;
//
//        return wallSpaces;
//    }

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
        System.out.print("nums = ");
        Arrays.stream(nums).forEach((n)-> System.out.print(n + ","));
        System.out.println();
        // min of left and right minus num
        for (int i = 0; i < nums.length; i++) {
            trappedWater += Math.min(left[i], right[i]) - nums[i];
            System.out.println("index: " + i + ", highest left: " + left[i] + ", highest right: " + right[i] + ", water unit: " + (Math.min(left[i], right[i])) + " - num " + (nums[i]) + " = " + (Math.min(left[i], right[i]) - nums[i]));
        }
        System.out.println("water units = " + trappedWater);

        return trappedWater;
    }
}
