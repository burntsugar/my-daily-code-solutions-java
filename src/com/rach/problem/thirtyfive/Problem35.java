package com.rach.problem.thirtyfive;

public class Problem35 {

    public static char[] solve(char[] arr) {

        int low = 0;
        int high = arr.length - 1;
        int middle = 0;
        char temp = 0;
        while (middle <= high) {
            print(low, middle, high, arr);
            // Get the middle
            switch (arr[middle]) {
                case 'R': {
                    // Move R to the left/low/beginning index.
                    temp = arr[low];
                    arr[low] = arr[middle];
                    arr[middle] = temp;
                    // Increment low and middle.
                    low++;
                    middle++;
                    break;
                }
                case 'G':
                    // Don't move G, just move middle past it.
                    middle++;
                    break;
                case 'B': {
                    // Move B to the right/high/end index.
                    temp = arr[middle];
                    arr[middle] = arr[high];
                    arr[high] = temp;
                    // Decrement high.
                    // Middle index remains unchanged.
                    high--;
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Illegal character!");
                }
            }
        }
        print(low, middle, high, arr);

        return arr;
    }

    public static void print(int low, int middle, int high, char[] arr){

        StringBuilder sblow = new StringBuilder();
        StringBuilder sbMiddle = new StringBuilder();
        StringBuilder sbHigh = new StringBuilder();
        StringBuilder arrString = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
                if (i == low) {
                    sblow.append(" L");
                } else {
                    sblow.append("  ");
                }
                if (i == middle) {
                    sbMiddle.append(" M");
                } else {
                    sbMiddle.append("  ");
                }
                if (i == high) {
                    sbHigh.append(" H");
                } else {
                    sbHigh.append("  ");
                }
            arrString.append(" " + arr[i]);
        }

        System.out.println(arrString.toString());
        System.out.println(sblow.toString());
        System.out.println(sbMiddle.toString());
        System.out.println(sbHigh.toString());
        System.out.println();

    }

}
