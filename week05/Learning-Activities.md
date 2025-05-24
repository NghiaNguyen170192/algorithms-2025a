Problem 1
Generate and store 1,000,000 random integers whose values are from 1 to 1,000 in an array.

Sort that array using counting sort.

Use the built-in sorting method provided by Java, Arrays's sort methodLinks to an external site., to sort that array. Compare the running time between the two sorting algorithms.

Subproblem 1B: sort an array of 100,000 integers. The values of the integers are in the range [1, 10^9];

Problem 2
Create a hash function from the String domain to the integer domain:

h('A') -> 0

h('B') -> 1

h('C') -> 2

...

h('Y') -> 24

h('Z') -> 25

h('0') => 26

h('1') => 27

...

h('8') => 34

h('9') => 35

For a string S = s1s2...sn (each si is an upper-case character or a digit), then

h(S) = (h(s1) + h(s2) + ... + h(sn)) % N

N is the hash table size, and it is determined based on the number of elements you want to store. The value h(S) is the location of the String object in the hash table.

In this problem, N = 13.

You want to manage RMIT student information using a hash table with the hash function described above. More specifically, an RMIT student's object is defined as:

class RMITStudent {

  String studentId;
  String fullName;
  String major;  
  double GPA;
}
The key for the hash table is studentId.

The hash table is defined as:

class RMITStudentCollection {

  boolean put(RMITStudent s);
  RMITStudent get(String studentId);

}
The put method adds an RMIT student object to the hash table, and the get method accepts a studentId String and returns the appropriate student object matching the given studentId. If the put method is not successful (i.e., the student id is not unique OR the hash table is full), return false. If the get method is not successful (i.e., there is no student with the provided id), return null.

To handle collisions, use Separate Chaining (sub-problem 2A) and Linear Probing (sub-problem 2B).

Problem 3
Extend the sub-problems 2A and 2B to support the remove operation. This operation accepts a String studentId and removes that student object from the hash table and returns true. If there is no such student in the hash table, return false.