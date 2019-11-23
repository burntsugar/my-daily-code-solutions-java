# Problem 1

````
From https://www.dailycodingproblem.com/

Daily Coding Problem: Problem #1 [Easy]

Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
````

# Assumption

The list is actually a set.

# Solution

## Psuedocode

````
1. Sort array ascending
2. Set comparison starting points to beginning/left and end/right array values...
    ...left = 0
    ...right = array length - 1

3. repeat while left is less than right...
    1. if left + right is equal to k
        match has been found
    2. if left + right is less than k
        increment left
       or else
        decrement right
end loop
````

## Java Solution
````java
public static List<int[]> solve(int k, int[] arr){
        List<int[]> pairs = new ArrayList<>();
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length -1;
        while (l < r){
            if(arr[l] + arr[r] == k) {
                int[] a = {arr[l],arr[r]};
                pairs.add(a);
            }
            if (arr[l] + arr[r] < k) {
                l++;
            } else {
                r--;
            }
        }
        return pairs;
    }
````

# Tests

nup

# Extra

Counts pairs.

# Other

nup