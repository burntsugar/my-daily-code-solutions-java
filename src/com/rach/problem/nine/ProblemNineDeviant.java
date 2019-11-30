package com.rach.problem.nine;

public class ProblemNineDeviant {

    public static int solve(int[] arr) {

        int sum = 0;
        int index = 0;
        while (index <= arr.length - 1) {
            int i = getUniqueNumber(arr, index);

            if (index == 0) {
                sum += arr[0];
                System.out.println("added " + arr[0]);
                System.out.println("sum: " + sum);
                index = i + 1;
                continue;
            }

            // If this is the last item...
            if (i == arr.length - 1) {
                // If i is not adjacent...
                if (i > ((index-1) + 1)) {
                    sum += arr[i - 1];
                    System.out.println("added " + arr[i-1] + " sum: " + sum);
                } else {
                    sum += arr[i];
                    System.out.println("added " + arr[i] + " sum: " + sum);
                }
                break;
            }

            sum += arr[i - 1];
            System.out.println("added: " + arr[i - 1] + " sum: " + sum);
            index = i + 1;
        }

        System.out.println("SUM: " + sum);
        return sum;

    }

    public static int getUniqueNumber(int[] arr, int start) {
        int index = start;
        while ((index + 1 < arr.length) && (arr[++index] == arr[start])) {
        }
        return index;
    }


}