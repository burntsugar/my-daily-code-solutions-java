package com.rach.problem.four;


public class ProblemFour {

    /**
     * Shift all negative integers to the left of the array.
     * @param arr Array containing negative and positive integers.
     * @param size Number of positions in the array (space)
     * @return An integer which represents the number of negative integers in the array.
     */
        private static int separateNegatives(int arr[], int size)
        {
            int negCount = 0, i;
            for (i = 0; i < size; i++) {
                /* If the current value is 0 or negative
                then move it to next negative slot on the left.
                 */
                if (arr[i] <= 0) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[negCount];
                    arr[negCount] = temp;
                    negCount++;
                }
            }

            return negCount;
        }

        private static int findMissingPositive(int arr[], int size)
        {
//            System.out.println("findMissingPositive in ...");
//            Arrays.stream(arr).forEach(str -> System.out.print(str + ", "));
//            System.out.println('\n');

            int i;

            for (i = 0; i < size; i++) {
                int x = Math.abs(arr[i]);
                if (x - 1 < size && arr[x - 1] > 0)
                    arr[x - 1] = -arr[x - 1];
            }

            for (i = 0; i < size; i++)
                if (arr[i] > 0)
                    return i + 1;

            return size + 1;
        }

        private static int findMissing(int arr[], int size)
        {
            int shift = separateNegatives(arr, size);
            int arr2[] = new int[size - shift];
            int j = 0;
            for (int i = shift; i < size; i++) {
                arr2[j] = arr[i];
                j++;
            }

            return findMissingPositive(arr2, j);
        }

        public static int start(int[] arr,int arr_size)
        {
            int missing = findMissing(arr, arr_size);
            System.out.println("Smallest positive missing number: " + missing);
            return missing;
        }

}
