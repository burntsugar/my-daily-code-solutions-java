# Daily Coding Problem: Problem #4 [Hard]

````
From https://www.dailycodingproblem.com/

Good morning! Here's your coding interview problem for today.

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
````

# Assumption

nup.

# Solution

Studied other solutions to achieve my own; including https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/

## Pseudocode

nup

# Tests

See *com.rach.problem.four*

# Extra

Wrote a cheat solution in order to study 0(n) time and 0(n) space.

Algorithm achieves 0(n) space but not time, due to sorting.

See *ProblemFourCheat.java*

# Other

Note the requirement *"in linear time and constant space."*

**linear time:** Straight line - no multiple traversals of the same elements.

**constant space:** Amount of memory usage is the same for each operation.