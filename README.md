# Striver DSA Practice (Java)

This repository contains Java solutions for DSA basics, pattern printing, recursion, and sorting.

## Folder Overview

- `arrays/` - Array problems and operations
- `Patterns/` - Pattern printing problems (`p1` to `p17`)
- `recursion/` - Intro recursion problems
- `sorting/` - Basic sorting algorithms

---

## Arrays (`arrays/`)

| File                                   | Problem                             | Approach / Notes                                                                                          | Complexity                                                                                   |
| -------------------------------------- | ----------------------------------- | --------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `findLargestElementInArray.java`       | Find largest element in array       | Single pass max tracking                                                                                  | Time: O(N), Space: O(1)                                                                      |
| `findSecondLargestElementInArray.java` | Find second largest element         | Implemented single-pass version; also has commented 2-pass version                                        | Implemented: Time O(N), Space O(1). Commented: O(2N)                                         |
| `moveAllZeroAtTheEnd.java`             | Move all zeroes to end              | Compaction of non-zero values, then fill rest with zeroes                                                 | Time: O(N), Space: O(1)                                                                      |
| `removeDuplicatesFromSortedArray.java` | Remove duplicates from sorted array | Two-pointer in-place method; brute-force set method commented                                             | Brute (commented): O(NlogN) + O(N), Optimal: O(N)                                            |
| `rotateArrayby1elementLeft.java`       | Left rotate array by 1              | Shift left and move first element to end                                                                  | Time: O(N), Space: O(1)                                                                      |
| `rotateArraybyKthElementLeft.java`     | Left rotate array by K              | Reversal method implemented; temp-array brute method commented                                            | Brute (commented): T=O(N+d), S=O(d). Optimal: T=O(2N), S=O(1)                                |
| `UnionOfTwoSortedArray.java`           | Union of two sorted arrays          | Brute: `HashSet` based union (commented). Optimal: Two-pointer union on sorted arrays with duplicate skip | Brute: T=O(n1logn + n2logn + o(n1+n2)) S=O(n1+n2) + O(n1+n2). Optimal: T=O(n1+n2) S=O(n1+n2) |
| `intersectionOfTwoSortedArray.java`    | Intersection of two sorted arrays   | Brute: Nested loops with visited array (commented). Optimal: Two-pointer intersection                     | Brute: T=O(N1*N2) S=O(N2). Optimal: T=O(N1+N2) S=O(1)                                        |
| `maxConsecutiveOnesInArray.java`       | Max consecutive ones in array       | Single pass linear scan tracking current count and max                                                    | Optimal: T=O(N) S=O(1)                                                                       |
| `findMissingNumberFromArray.java`      | Find missing number from array      | Brute (loops), Better (hash array), Optimal (Sum or XOR)                                                  | Brute: T=O(N*N) S=O(1), Better: T=O(N+N) S=O(N), Optimal: T=O(N) S=O(1)                      |
| `numberAppearsOneTImeInArray.java`     | Find number appearing only once     | Brute (nested loops), Better (hash array count), Optimal (XOR all elements)                               | Brute: T=O(N*N) S=O(1), Better: T=O(N+N+N) S=O(Max+1), Optimal: T=O(N) S=O(1)                |

---

## Patterns (`Patterns/`)

| File       | Pattern Name / Output Type                                                                              |
| ---------- | ------------------------------------------------------------------------------------------------------- |
| `p1.java`  | Solid square star pattern                                                                               |
| `p2.java`  | Right-angled increasing star triangle                                                                   |
| `p3.java`  | Right-angled number triangle (`1..i`)                                                                   |
| `p4.java`  | Right-angled repeated-number triangle (row number repeated)                                             |
| `p5.java`  | Inverted right-angled star triangle                                                                     |
| `p6.java`  | Inverted number triangle (`1..`) with decreasing row length                                             |
| `p7.java`  | Centered full pyramid (stars)                                                                           |
| `p8.java`  | Centered inverted pyramid (stars)                                                                       |
| `p9.java`  | Diamond star pattern (pyramid + inverted pyramid)                                                       |
| `p10.java` | Symmetric increasing-decreasing star triangle                                                           |
| `p11.java` | Binary triangle (alternating 1/0 by row and column parity)                                              |
| `p12.java` | Number crown / mirrored number pattern with middle spaces                                               |
| `p13.java` | Floyd-like incremental number triangle                                                                  |
| `p14.java` | Alphabet triangle (A, AB, ABC, ...)                                                                     |
| `p15.java` | Inverted alphabet triangle                                                                              |
| `p16.java` | Same-letter per row triangle (A, BB, CCC, ...)                                                          |
| `p17.java` | Palindromic-like centered alphabet growth style (implemented as increasing chars across odd-width rows) |

Note: Most pattern programs use nested loops and are typically O(N^2) time with O(1) extra space (ignoring output buffer/console printing cost).

---

## Recursion (`recursion/`)

| File                | Problem                                  | Approach                                                                      | Complexity                                    |
| ------------------- | ---------------------------------------- | ----------------------------------------------------------------------------- | --------------------------------------------- |
| `prob1.java`        | Print numbers in reverse using recursion | Recursive call first, print during backtracking                               | Time: O(N), Space: O(N) recursion stack       |
| `sum.java`          | Sum of first N numbers                   | Recursive relation `sum(n)=n+sum(n-1)`                                        | Time: O(N), Space: O(N)                       |
| `reverseArray.java` | Reverse array recursively                | Two-pointer recursion with swaps                                              | Time: O(N), Space: O(N) stack                 |
| `palindrome.java`   | Palindrome check (integer via string)    | Compare symmetric characters recursively/iteratively style loop inside method | Time: O(N), Space: O(N) for string conversion |

---

## Sorting (`sorting/`)

| File                      | Algorithm             | Notes                                               | Complexity                                                 |
| ------------------------- | --------------------- | --------------------------------------------------- | ---------------------------------------------------------- |
| `bubbleSort.java`         | Bubble Sort           | Includes early-stop optimization (`didswap`)        | Worst/Avg: O(N^2), Best: O(N), Space: O(1)                 |
| `selctionSort.java`       | Selection Sort        | Finds min index and swaps per pass                  | Time: O(N^2), Space: O(1)                                  |
| `mergerSort.java`         | Merge Sort            | Divide and conquer + merge helper                   | Time: O(NlogN), Space: O(N)                                |
| `quickSort.java`          | Quick Sort            | Partition-based recursive sort (pivot at low index) | Avg: O(NlogN), Worst: O(N^2), Space: O(logN) avg recursion |
| `tempCodeRunnerFile.java` | Temporary runner file | Empty helper file generated by editor               | N/A                                                        |

---

## Notes


