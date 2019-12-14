# Problem 22

````
Good morning! Here's your coding interview problem for today.

Daily Coding Problem: Problem #22 [Medium]

This problem was asked by Microsoft.

Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.

For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

````

## Pseudocode

For each word:
- if the word exists at the beginning of the string
- store the word 
- remove the beginning of the string

## Sorting logic output

````dtd
word: quick
	quick = thequ = false
word: brown
	brown = thequ = false
word: the
	the = the = true
		>>>Store: the
word: fox
	fox = qui = false
word: quick
	quick = quick = true
		>>>Store: quick
word: brown
	brown = brown = true
		>>>Store: brown
word: the
	the = fox = false
word: fox
	fox = fox = true
		>>>Store: fox
````

# Tests

see *Problem22Test.java*

# 🏏 Other

re `return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond']` I had to go back to living a normal life so I didn't implement this but took a look around and found some mind-boggling, unreadable (and mostly untested) examples - as well as some where libraries had been used to get the permuations. Hmmm...that's not cricket 🏏

NEXT!