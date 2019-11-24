# Problem 2

````
From https://www.dailycodingproblem.com/

Daily Coding Problem: Problem #2 [Hard]

Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
````

# Assumption


# Solution

## Pseudocode

````
get array
Initialise result array
Initialise current element index to 0
Loop through each element in the array (outer)
    initialise product to 1
    Loop through each element in the array (inner)
        if the current element index (outer) is not the same as the current element index (inner)
            accumulate the multiplied product of the current element value
        end if
    end loop (inner)
    push to result array
    increment current element index
end loop (outer)

````

## Java Solution
````java
public static List<Integer> solve(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for(int o = 0; o < arr.length; o++){
            int product = 1;
            for(int i = 0; i < arr.length; i++) {
                if(i != o) {
                    product *= arr[i];
                }
            }
            list.add(product);
        }
        return list;
    }
````

# Tests

nup

# Extra

nup

# Other

I don't understand the requirement that states...

> Follow-up: what if you can't use division?