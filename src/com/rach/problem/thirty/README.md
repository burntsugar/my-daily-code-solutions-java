# Daily Coding Problem: Problem #30 [Medium]

````
From https://www.dailycodingproblem.com/

Good morning! Here's your coding interview problem for today.

This problem was asked by Facebook.

You are given an array of non-negative integers that represents a two-dimensional elevation map where each element is unit-width wall and the integer is the height. Suppose it will rain and all spots between two walls get filled up.

Compute how many units of water remain trapped on the map in O(N) time and O(1) space.

For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.

Given the input [3, 0, 1, 3, 0, 5], we can hold 3 units in the first index, 2 in the second, and 3 in the fourth index (we cannot hold 5 since it would run off to the left), so we can trap 8 units of water.
````

## Pseudocode

1. Create array[nums.length] where all elements are the max num to the left.
2. Create array[nums.length] where all elements are the max num to the right.
3. for each num:

    1. accumulate the min of left and right (at the parallel index) and subtract num.



## Output

````dtd
nums = 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
index: 0, highest left: 0, highest right: 3, water unit: 0 - num 0 = 0
index: 1, highest left: 1, highest right: 3, water unit: 1 - num 1 = 0
index: 2, highest left: 1, highest right: 3, water unit: 1 - num 0 = 1
index: 3, highest left: 2, highest right: 3, water unit: 2 - num 2 = 0
index: 4, highest left: 2, highest right: 3, water unit: 2 - num 1 = 1
index: 5, highest left: 2, highest right: 3, water unit: 2 - num 0 = 2
index: 6, highest left: 2, highest right: 3, water unit: 2 - num 1 = 1
index: 7, highest left: 3, highest right: 3, water unit: 3 - num 3 = 0
index: 8, highest left: 3, highest right: 2, water unit: 2 - num 2 = 0
index: 9, highest left: 3, highest right: 2, water unit: 2 - num 1 = 1
index: 10, highest left: 3, highest right: 2, water unit: 2 - num 2 = 0
index: 11, highest left: 3, highest right: 1, water unit: 1 - num 1 = 0
water units = 6
````

# Tests

See *test/com/rach/problem/thirty*

# Other

🍺 🍺 🍺

