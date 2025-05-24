Problem 1
Implement an algorithm to calculate (X^N) % 1,000,000,007. N is an integer and can be as big as 10^9.

Problem 2
Implement Quick Select.

Problem 3
Without using the built-in square root function, calculate the square root of a positive number with a precision of up to six digits after the decimal point.

Problem 4
There are a set of courses that you have to take. Some courses are prerequisites for other courses. The courses and the prerequisite relationships are represented in a 2D array. Below is an example

courses = [

  [0, 0, 0, 0],

  [1, 0, 1, 0],

  [0, 0, 0, 1],

  [1, 0, 0, 0]

]
Explanation: each course is represented as a row. A cell [i, j] = 0 if there is no prerequisite between course i and course j. A cell [i, j] = 1 if course j is a prerequisite for course i (that means you have to take course j before course i).

With the above example: course 0 (row 0) requires no other courses; course 1 requires courses 0 and 2; course 2 requires course 3; course 3 requires course 0. So, you have to take course 0 first, then course 3, then course 2, and finally course 1.

Implement a program that accepts a String array of course names, and a 2D array denoting the prerequisite relationship between courses, return a valid learning order.

Note: there may be more than one correct order. In this case, any order is OK.

Note 2: there is no mutual dependence between 2 or more courses. Otherwise, it's not possible for you to complete your study.