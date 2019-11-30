# Problem 9

````
From https://www.dailycodingproblem.com/

Daily Coding Problem: Problem #9 [Hard]

Good morning! Here's your coding interview problem for today.

This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?
````

# Assumption

I made the initial assumption that the sum was calculated as such...

````$xslt
get the next unique number
add that to index + 2
add to sum
````

# 🤬 

But no. See *ProblemNineDeviant.java* and *ProblemNineDeviantTest.java*.

![](https://media.giphy.com/media/KGdmgSWTCqimQ/source.gif)

# Solution

Eventually realised that the problem's question was *the description of the required solution*. That sounds logical. Yes. 


## Pseudocode

````$xslt
temp = last sum
next sum = max(last sum or last sum + next index)
last sum = temp
````

# Tests

See *ProblemNineTest.java*.

# Extra

Sauce.

# Other

nup