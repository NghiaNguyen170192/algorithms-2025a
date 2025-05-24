Problem 1
The list of cities and their direct distances are given in a 2D array. For example

distances = [
  [0, 3, 2, 0]
  [3, 0, 0, 5],
  [2, 0, 0, 9]
  [0, 5, 9, 0]
]
Explanation: the value at cell [i, j] represents the distance between city i and city j. The distance between a city and itself is zero (i.e., distances[i, i] = 0 for every i). If there is no direct path between city i and j, then distances[i, j] is also zero.

Implement a program to calculate the shortest path's length from the first city (index 0) to the last city (index n - 1, n is the number of cities).

In the above example, there are 2 paths from city 0 to city 3

0 -> 1 -> 3 (length 3 + length 5 = 8)

0 -> 2 -> 3 (length 2 + length 9 = 11)

So, the shortest path is: 0 -> 1 -> 3

Problem 2
As an excellent Data Structures & Algorithms student, you become the advisor of the king. The king wants to build a road system connecting all the castles. The total length of the roads must be as short as possible.

The list of castles and their direct distances are given in a 2D array. For example

castles = [
  [0, 1, 2, 8]
  [1, 0, 3, 5],
  [2, 3, 0, 4]
  [8, 5, 4, 0]
]
The distance between 2 castle i, j is given in castles[i][j] and castles[j][i]. Return the minimum total length of the road system.

In the above example, there are 4 castles. You can build the following 3 roads to connect all 4:

0 -> 1: distance 1

0 -> 2: distance 2

2 -> 3: distance 4

The total length is 1 + 2 + 4 = 7

If you build the following roads

0 -> 1: distance 1

0 -> 2: distance 2

0 -> 3: distance 8

They also connect all castles, but the total length is 11, which is not the shortest length.

Problem 3
You are given a list of distinct items

[item 1, item 2, ..., item n]
You want to take as many items in increasing order as possible. For example, if you already take item i, then if you want to take item j positioned after i, they must satisfy this condition

value of item i < value of item j
Example: if the list of items is

[5, 2, 3, 9, 6, 7, 8]
Then, you can take [2, 3, 6, 7, 8] to have 5 items.

If you take the first item (value 5), you can only take [5, 6, 7, 8] (4 items in total)

Implement a solution for the above problem.

Problem 4
There is a rectangle field [R, C] (R rows and C columns). A robot is located in the upper-left corner (0, 0) cell. At each step, it can either go RIGHT or DOWN. How many unique paths the robot can take to reach the lower-right corner (R-1, C-1) cell?

robot - unique paths