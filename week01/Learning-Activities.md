Problem 1
1.1/ Using pseudocode or Java, describe an algorithm to find the largest number in an array - without sorting the array

Example:

A = [7, 6, 9, 3, 2, 5] => return 9

1.2/ Using pseudocode or Java, describe an algorithm to find the second largest number in an array - without sorting the array

Example:

A = [7, 6, 9, 3, 2, 5] => return 7

Problem 2
An array A of length N contains unique integers between zero and N. Because there are (N + 1) different values but only N elements, there is one value missing. Implement an algorithm using pseudocode or Java to find the missing value.

Examples (N = 5 in the below examples):

1/ A = [0, 3, 2, 4, 1] => return 5

2/ A = [1, 5, 2, 4, 3] => return 0

3/ A = [4, 0, 1, 5, 2] => return 3

Problem 3
You have two ADTs: Set and Sequence. The Set ADT supports the following operations: add, remove, and size (which returns the number of elements in a set). The Sequence ADT supports the following operations: next (which returns the first, second, etc. elements in a sequence until the last one on each subsequent call; then, if it is called again, it will return false).

You have two sequences, each containing only unique elements. Describe an algorithm to check whether the two sequences are permutations of the same set.

Examples:

1/ Seq1 = [1, 2, 3, 4], Seq2 = [4, 3, 2, 1] => YES

2/ Seq1 = [1, 2, 3, 4], Seq2 = [1, 2, 3, 4] => YES

3/ Seq1 = [1, 2, 3], Seq2 = [1, 2, 4] => NO

Problem 4
There is a matrix of numbers. For example, the matrix below contains 4 rows and 5 columns of numbers.

[
  [1, 2, 3, 4, 5],
  [8, 6, 9, 1, 3],
  [8, 3, 1, 4, 3],
  [4, 8, 2, 9, 6]
]
Given a rectangle defined by its (top, left) and (bottom, right) corners. Calculate the sum of all numbers of the matrix inside that rectangle.

For example, the sum of all numbers inside (1, 2) and (2, 3) is = 9 + 1 + 1 + 4 = 15

Assumption: the matrix is static.