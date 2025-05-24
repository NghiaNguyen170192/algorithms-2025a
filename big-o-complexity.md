# Common Data Structure Operations

| Data Structure     | Avg Access | Avg Search | Avg Insertion | Avg Deletion | Worst Access | Worst Search | Worst Insertion | Worst Deletion | Space Complexity |
|--------------------|------------|------------|---------------|--------------|--------------|--------------|-----------------|----------------|------------------|
| Array              | O(1)       | O(n)       | O(n)          | O(n)         | O(1)         | O(n)         | O(n)            | O(n)           | O(n)             |
| Stack              | O(n)       | O(n)       | O(1)          | O(1)         | O(n)         | O(n)         | O(1)            | O(1)           | O(n)             |
| Queue              | O(n)       | O(n)       | O(1)          | O(1)         | O(n)         | O(n)         | O(1)            | O(1)           | O(n)             |
| Singly-Linked List | O(n)       | O(n)       | O(1)          | O(1)         | O(n)         | O(n)         | O(1)            | O(1)           | O(n)             |
| Doubly-Linked List | O(n)       | O(n)       | O(1)          | O(1)         | O(n)         | O(n)         | O(1)            | O(1)           | O(n)             |
| Skip List          | O(log(n))  | O(log(n))  | O(log(n))     | O(log(n))    | O(n)         | O(n)         | O(n)            | O(n)           | O(n log(n))      |
| Hash Table         | N/A        | O(1)       | O(1)          | O(1)         | N/A          | O(n)         | O(n)            | O(n)           | O(n)             |
| Binary Search Tree | O(log(n))  | O(log(n))  | O(log(n))     | O(log(n))    | O(n)         | O(n)         | O(n)            | O(n)           | O(n)             |
| Cartesian Tree     | N/A        | O(log(n))  | O(log(n))     | O(log(n))    | N/A          | O(n)         | O(n)            | O(n)           | O(n)             |
| B-Tree             | O(log(n))  | O(log(n))  | O(log(n))     | O(log(n))    | O(log(n))    | O(log(n))    | O(log(n))       | O(log(n))      | O(n)             |
| Red-Black Tree     | O(log(n))  | O(log(n))  | O(log(n))     | O(log(n))    | O(log(n))    | O(log(n))    | O(log(n))       | O(log(n))      | O(n)             |
| Splay Tree         | N/A        | O(log(n))  | O(log(n))     | O(log(n))    | O(n)         | O(n)         | O(n)            | O(n)           | O(n)             |
| AVL Tree           | O(log(n))  | O(log(n))  | O(log(n))     | O(log(n))    | O(log(n))    | O(log(n))    | O(log(n))       | O(log(n))      | O(n)             |
| KD Tree            | O(log(n))  | O(log(n))  | O(log(n))     | O(log(n))    | O(n)         | O(n)         | O(n)            | O(n)           | O(n)             |

# Sorting Algorithms – Time and Space Complexity

| Algorithm      | Best Time   | Avg Time        | Worst Time      | Space (Worst) |
|----------------|-------------|-----------------|-----------------|---------------|
| Quicksort      | O(n log(n)) | O(n log(n))     | O(n^2)          | O(log(n))     |
| Mergesort      | O(n log(n)) | O(n log(n))     | O(n log(n))     | O(n)          |
| Timsort        | O(n)        | O(n log(n))     | O(n log(n))     | O(n)          |
| Heapsort       | O(n log(n)) | O(n log(n))     | O(n log(n))     | O(1)          |
| Bubble Sort    | O(n)        | O(n^2)          | O(n^2)          | O(1)          |
| Insertion Sort | O(n)        | O(n^2)          | O(n^2)          | O(1)          |
| Selection Sort | O(n^2)      | O(n^2)          | O(n^2)          | O(1)          |
| Tree Sort      | O(n log(n)) | O(n log(n))     | O(n^2)          | O(n)          |
| Shell Sort     | O(n log(n)) | O((n log(n))^2) | O((n log(n))^2) | O(1)          |
| Bucket Sort    | O(n+k)      | O(n+k)          | O(n^2)          | O(n)          |
| Radix Sort     | O(nk)       | O(nk)           | O(nk)           | O(n+k)        |
| Counting Sort  | O(n+k)      | O(n+k)          | O(n+k)          | O(k)          |
