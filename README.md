# Striver DSA Practice (Java)

This repository contains **97 Java solutions** covering arrays, pattern printing, recursion, sorting, binary search, trees, stacks, queues, and linked lists — following the [Striver's A2Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/).

Each problem includes **brute → better → optimal** approaches where applicable, with commented-out alternatives for learning.

## Folder Overview

- `arrays/easy/` - Easy array problems
- `arrays/medium/` - Medium array problems
- `arrays/hard/` - Hard array problems
- `Patterns/` - Pattern printing problems (`p1` to `p17`)
- `recursion/` - Intro recursion problems
- `sorting/` - Basic sorting algorithms
- `Binary Search/` - Binary search problems
- `Trees/` - Tree data structure problems
- `Stack/` - Stack data structure implementations and problems
- `Queue/` - Queue data structure implementations and problems
- `Linked List/` - Linked list data structure implementations and problems

---

## Arrays — Easy (`arrays/easy/`)

| File                                   | Problem                                 | Approach / Notes                                                                                                       | Complexity                                                                                   |
| -------------------------------------- | --------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `findLargestElementInArray.java`       | Find largest element in array           | Single pass max tracking                                                                                               | Time: O(N), Space: O(1)                                                                      |
| `findSecondLargestElementInArray.java` | Find second largest element             | Implemented single-pass version; also has commented 2-pass version                                                     | Implemented: Time O(N), Space O(1). Commented: O(2N)                                         |
| `moveAllZeroAtTheEnd.java`             | Move all zeroes to end                  | Compaction of non-zero values, then fill rest with zeroes                                                              | Time: O(N), Space: O(1)                                                                      |
| `removeDuplicatesFromSortedArray.java` | Remove duplicates from sorted array     | Two-pointer in-place method; brute-force set method commented                                                          | Brute (commented): O(NlogN) + O(N), Optimal: O(N)                                            |
| `rotateArrayby1elementLeft.java`       | Left rotate array by 1                  | Shift left and move first element to end                                                                               | Time: O(N), Space: O(1)                                                                      |
| `rotateArraybyKthElementLeft.java`     | Left rotate array by K                  | Reversal method implemented; temp-array brute method commented                                                         | Brute (commented): T=O(N+d), S=O(d). Optimal: T=O(2N), S=O(1)                                |
| `UnionOfTwoSortedArray.java`           | Union of two sorted arrays              | Brute: `HashSet` based union (commented). Optimal: Two-pointer union on sorted arrays with duplicate skip              | Brute: T=O(n1logn + n2logn + o(n1+n2)) S=O(n1+n2) + O(n1+n2). Optimal: T=O(n1+n2) S=O(n1+n2) |
| `intersectionOfTwoSortedArray.java`    | Intersection of two sorted arrays       | Brute: Nested loops with visited array (commented). Optimal: Two-pointer intersection                                  | Brute: T=O(N1\*N2) S=O(N2). Optimal: T=O(N1+N2) S=O(1)                                       |
| `maxConsecutiveOnesInArray.java`       | Max consecutive ones in array           | Single pass linear scan tracking current count and max                                                                 | Optimal: T=O(N) S=O(1)                                                                       |
| `findMissingNumberFromArray.java`      | Find missing number from array          | Brute (loops), Better (hash array), Optimal (Sum or XOR)                                                               | Brute: T=O(N\*N) S=O(1), Better: T=O(N+N) S=O(N), Optimal: T=O(N) S=O(1)                     |
| `numberAppearsOneTImeInArray.java`     | Find number appearing only once         | Brute (nested loops), Better (hash array count), Optimal (XOR all elements)                                            | Brute: T=O(N\*N) S=O(1), Better: T=O(N+N+N) S=O(Max+1), Optimal: T=O(N) S=O(1)               |
| `longestSubArrayWithSumK.java`         | Longest subarray with sum K             | Brute (nested loops), Better (prefix-sum HashMap), Optimal (two-pointer sliding window, positives only)                | Brute: T=O(N²) S=O(1), Better: T=O(NlogN) S=O(N), Optimal: T=O(2N) S=O(1)                    |
| `bestTImeToBuyStock.java`              | Best Time to Buy and Sell Stock         | Single pass tracking minimum price and max profit                                                                      | Time: O(N), Space: O(1)                                                                      |
| `replaceElementWithLArgest.java`       | Replace Elements with Greatest on Right | Reverse pass tracking running max, replacing each element with the greatest to its right                               | Time: O(N), Space: O(N)                                                                      |
| `leadersInAnArray.java`                | Leaders in an Array                     | Brute (nested loops, commented), Optimal (reverse pass tracking max, collect elements greater than all to their right) | Brute: T=O(N²) S=O(N), Optimal: T=O(N) S=O(N)                                                |

---

## Arrays — Medium (`arrays/medium/`)

| File                                | Problem                        | Approach / Notes                                                                                               | Complexity                                                                    |
| ----------------------------------- | ------------------------------ | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `twoSum.java`                       | Two Sum                        | Brute (nested loops), Better (single-pass HashMap), Optimal (two-pointer on sorted array, for yes/no variant)  | Brute: T=O(N²) S=O(1), Better: T=O(N) S=O(N), Optimal: T=O(NlogN) S=O(1)      |
| `sortAnArrayWithZeroOneAndTwo.java` | Sort array of 0s, 1s, and 2s   | Brute (merge sort), Better (counting 0s/1s/2s then overwrite), Optimal (Dutch National Flag)                   | Brute: T=O(NlogN) S=O(N), Better: T=O(2N) S=O(1), Optimal: T=O(N) S=O(1)      |
| `majorityElementsNby2TImes.java`    | Majority Element (> N/2 times) | Brute (nested loops), Better (HashMap frequency count), Optimal (Moore's Voting Algorithm + verification pass) | Brute: T=O(N²) S=O(1), Better: T=O(NlogN)+O(N) S=O(N), Optimal: T=O(N) S=O(1) |

| `maximumSubarry.java` | Maximum Subarray Sum (Kadane's Algorithm) | Brute (triple nested loops), Better (double nested loops with running sum), Optimal (Kadane's — single pass tracking max sum, reset on negative) | Brute: T=O(N³) S=O(1), Better: T=O(N²) S=O(1), Optimal: T=O(N) S=O(1) |
| `stocks.java` | Best Time to Buy and Sell Stock | Single pass tracking minimum price and computing max profit | T=O(N) S=O(1) |
| `rearrangeArrayBySign.java` | Rearrange Array Elements by Sign | Brute (separate pos/neg arrays then merge, commented), Optimal (single pass placing positives at even indices, negatives at odd) | Brute: T=O(2N) S=O(N), Optimal: T=O(N) S=O(N) |
| `longestConsecutive.java` | Longest Consecutive Sequence | Better (sort + linear scan, commented), Optimal (HashSet — only start counting from sequence starts) | Better: T=O(NlogN) S=O(1), Optimal: T=O(3N) S=O(N) |
| `countSubArraysSumEqualsK.java` | Count Subarrays with Sum equal to K | Brute (triple nested loops, commented), Better (double nested loops with running sum, commented), Optimal (prefix-sum HashMap — track prefix sums and lookup `prefixSum - K`) | Brute: T=O(N³) S=O(1), Better: T=O(N²) S=O(1), Optimal: T=O(NlogN) S=O(N) |

| `setMatrixZeroes.java` | Set Matrix Zeroes | Brute (mark with -1 then convert, commented), Better (row/col marker arrays, commented), Optimal (use first row/col as markers + col0 variable) | Brute: T=O(N×M×(N+M)) S=O(1), Better: T=O(2×N×M) S=O(N+M), Optimal: T=O(N×M) S=O(1) |
| `rotateImage.java` | Rotate Image (90° clockwise) | Brute (copy to new matrix with index mapping, commented), Optimal (transpose matrix in-place + reverse each row) | Brute: T=O(N×M) S=O(N×M), Optimal: T=O(N×M) S=O(1) |
| `spiralMatrix.java` | Spiral Matrix Traversal | Optimal (layer-by-layer traversal using top/bottom/left/right boundary pointers) | T=O(N×M) S=O(N×M) |

---

## Arrays — Hard (`arrays/hard/`)

| File                                      | Problem                                                  | Approach / Notes                                                                                                                                                                                                    | Complexity                                                                                         |
| ----------------------------------------- | -------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `pascalTriangle.java`                     | Pascal's Triangle (3 variants)                           | **V1 — Element at (N, R):** nCr using iterative multiplication to avoid overflow. **V2 — Nth Row:** generate full row using running nCr formula. **V3 — Full Triangle:** build all rows by calling V2 for each row. | V1: T=O(R) S=O(1), V2: T=O(N) S=O(N), V3: T=O(N²) S=O(N²)                                          |
| `majorityElementsNby3TImes.java`          | Majority Element (> N/3 times)                           | Brute (nested loops), Better (HashMap frequency count), Optimal (Extended Moore's Voting Algorithm with 2 candidates + verification pass)                                                                           | Brute: T=O(N²) S=O(1), Better: T=O(NlogN)+O(N) S=O(N), Optimal: T=O(N) S=O(1)                      |
| `threeSum.java`                           | Three Sum (find all unique triplets summing to 0)        | Brute (triple nested loops + HashSet for dedup), Better (two loops + HashMap lookup), Optimal (sort + two-pointer with duplicate skipping)                                                                          | Brute: T=O(N³) S=O(N²), Better: T=O(N²logM) S=O(N), Optimal: T=O(NlogN)+O(N²) S=O(unique triplets) |
| `fourSum.java`                            | Four Sum (find all unique quadruplets summing to target) | Brute (four nested loops + HashSet dedup, long for overflow), Better (three loops + HashMap lookup), Optimal (sort + two nested loops + two-pointer with duplicate skipping)                                        | Brute: T=O(N⁴) S=O(quads), Better: T=O(N³logM) S=O(N), Optimal: T=O(N³) S=O(quads)                 |
| `countSubArraysWithXorAsK.java`           | Count Subarrays with XOR equal to K                      | Brute (triple nested loops, commented), Better (double nested loops with running XOR)                                                                                                                               | Brute: T=O(N³) S=O(1), Better: T=O(N²) S=O(1)                                                      |
| `MergreOverLApping.java`                  | Merge Overlapping Intervals                              | Brute (sort + nested loop to extend each interval, commented), Optimal (sort + single pass merging into running interval)                                                                                           | Brute: T=O(NlogN)+O(2N) S=O(N), Optimal: T=O(NlogN)+O(N) S=O(N)                                    |
| `Merge2SortedArrayWithoutExtraSpace.java` | Merge Two Sorted Arrays Without Extra Space              | Optimal (two-pointer swap from ends to partition elements, then sort both halves and copy)                                                                                                                          | T=O(min(m,n) + m·log m + n·log n) S=O(1)                                                           |
| `missingAndRepeatingNo.java`              | Missing and Repeating Number                             | Brute (iterate 1–N², count occurrences in grid), Better (hash array frequency count), Optimal (math — sum & sum-of-squares difference to solve for missing & repeating)                                             | Brute: T=O(N³) S=O(1), Better: T=O(N²) S=O(N), Optimal: T=O(N²) S=O(1)                             |
| `countInversion.java`                     | Count Inversions                                         | Brute (nested loops counting pairs where arr[i] > arr[j] for i < j)                                                                                                                                                 | Brute: T=O(N²) S=O(1)                                                                              |
| `maxProductSubArr.java`                   | Maximum Product Subarray                                 | Brute (nested loops trying all subarrays, commented), Optimal (prefix-suffix product scan — reset on zero, track max of prefix & suffix products)                                                                   | Brute: T=O(N²) S=O(1), Optimal: T=O(N) S=O(1)                                                      |

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

## Binary Search (`Binary Search/`)

| File                                   | Problem                                        | Approach / Notes                                                                                                                                                  | Complexity                                                                          |
| -------------------------------------- | ---------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `BS1.java`                             | Binary Search (Iterative + Recursive)          | Iterative (loop with low/high pointers), Recursive (divide search space via recursion)                                                                            | Iterative: T=O(logN) S=O(1), Recursive: T=O(logN) S=O(logN)                         |
| `BS2.java`                             | Lower Bound & Upper Bound                      | Lower Bound (find smallest index where `arr[mid] >= target`), Upper Bound (find smallest index where `arr[mid] > target`)                                         | T=O(logN) S=O(1)                                                                    |
| `firstAndLastOcc.java`                 | First and Last Occurrence of Element           | Brute (linear scan tracking first/last, commented), Optimal (two binary searches — lower bound for first, upper bound−1 for last)                                 | Brute: T=O(N) S=O(1), Optimal: T=O(logN) S=O(1)                                     |
| `RotatedMinElement.java`               | Minimum in Rotated Sorted Array                | Optimal (binary search — identify sorted half, track min from sorted side, eliminate half each step)                                                              | T=O(logN) S=O(1)                                                                    |
| `howManyTimeArrayRotated.java`         | Find out how many times array has been rotated | Optimal (binary search — identify sorted half, handle duplicates by shrinking space, track min index)                                                             | T=O(logN) avg, O(N) worst, S=O(1)                                                   |
| `FindPeakElement.java`                 | Find Peak Element                              | Brute (linear scan checking neighbors, commented), Optimal (binary search — check if mid is peak, move toward ascending side)                                     | Brute: T=O(N) S=O(1), Optimal: T=O(logN) S=O(1)                                     |
| `kokoEatingBananas.java`               | Koko Eating Bananas (Min Eating Speed)         | Brute (linear search from 1 to max(piles), commented), Optimal (binary search on answer space [1, max] — check if eating speed can finish within h hours)         | Brute: T=O(max×N) S=O(1), Optimal: T=O(N×log(max)) S=O(1)                           |
| `findTheSmallestDivisorThreshold.java` | Find the Smallest Divisor Given a Threshold    | Brute (linear search from 1 to max(nums), commented), Optimal (binary search on answer space [1, max] — check if divisor keeps ceiling-sum ≤ threshold)           | Brute: T=O(max×N) S=O(1), Optimal: T=O(N×log(max)) S=O(1)                           |
| `leastCapacityToShip.java`             | Capacity to Ship Packages Within D Days        | Brute (linear search from max(weights) to sum(weights), commented), Optimal (binary search on answer space [max, sum] — check if capacity can ship within D days) | Brute: T=O((sum−max)×N) S=O(1), Optimal: T=O(N×log(sum−max)) S=O(1)                 |
| `kthMissingNumber.java`                | Kth Missing Positive Number                    | Brute (linear scan counting missing up to k, commented), Optimal (binary search on missing count `arr[mid] - (mid + 1)` to find location of k-th missing)         | Brute: T=O(N) S=O(1), Optimal: T=O(logN) S=O(1)                                     |
| `AgressiveCows.java`                   | Aggressive Cows                                | Brute (linear search from 1 to max-min, commented), Optimal (binary search on answer space [1, max] — check if we can place cows with given minimum distance)     | Brute: T=O(NlogN + (max−min)×N) S=O(1), Optimal: T=O(NlogN + N×log(max−min)) S=O(1) |

---

## Trees (`Trees/`)

| File                      | Problem                             | Approach / Notes                | Complexity    |
| ------------------------- | ----------------------------------- | ------------------------------- | ------------- |
| `preOrderTraversal.java`  | Pre-order Traversal of Binary Tree  | Recursive (Root → Left → Right) | T=O(N) S=O(N) |
| `inOrderTraversal.java`   | In-order Traversal of Binary Tree   | Recursive (Left → Root → Right) | T=O(N) S=O(N) |
| `postOrderTraversal.java` | Post-order Traversal of Binary Tree | Recursive (Left → Right → Root) | T=O(N) S=O(N) |

---

## Stack (`Stack/`)

| File                   | Problem                          | Approach / Notes                                     | Complexity                                    |
| ---------------------- | -------------------------------- | ---------------------------------------------------- | --------------------------------------------- |
| `implementtation.java` | Stack Implementation using Array | Array-based implementation with push, pop, and print | Push/Pop: T=O(1) S=O(1), Print: T=O(N) S=O(1) |

---

## Queue (`Queue/`)

| File                  | Problem                          | Approach / Notes                                                                  | Complexity              |
| --------------------- | -------------------------------- | --------------------------------------------------------------------------------- | ----------------------- |
| `Implementation.java` | Queue Implementation using Array | Circular array-based implementation with push, pop; handles full/empty edge cases | Push/Pop: T=O(1) S=O(1) |

---

## Linked List (`Linked List/`)

| File                    | Problem                             | Approach / Notes                                                                                                                            | Complexity                                                                                                                                                    |
| ----------------------- | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `singlyLinkedList.java` | Linked List Implementation (Singly) | Convert array to linked list, compute length, search, print, delete head/tail/k-th/by-value, insert at start/end/k-th position/before value | Convert/Print/Length/Search/DeleteTail/DeleteKth/DeleteByValue/InsertAtEnd/InsertAtKth/InsertBeforeVal: T=O(N), DeleteHead/InsertAtStart: T=O(1), All: S=O(1) |
| `doublyLinkedList.java` | Linked List Implementation (Doubly) | Convert array to doubly linked list, print, delete head/tail/k-th/before element, insert at start/end/k-th position/after value | Convert/Print/DeleteTail/DeleteKth/DeleteBeforeEle/InsertAtEnd/InsertAtKth/InsertAfterVal: T=O(N), DeleteHead/InsertAtStart: T=O(1), All: S=O(1) |
| `reverseADLL.java` | Reverse a Doubly Linked List | Brute: use stack to swap data; Optimal: swap prev/next pointers in-place | Brute: T=O(2N) S=O(N), Optimal: T=O(N) S=O(1) |
| `addTwoNumbers.java` | Add Two Numbers (Linked Lists) | Use dummy node, traverse both lists simultaneously with carry | T=O(max(N1,N2)) S=O(max(N1,N2)) |
| `oddEvenLL.java` | Odd Even Linked List | Brute: create new nodes by index parity; Optimal: rearrange pointers with odd/even chains | Brute: T=O(2N) S=O(N), Optimal: T=O(N) S=O(1) |
| `sortLLOfZeroOneAndTwos.java` | Sort Linked List of 0s, 1s, and 2s | Brute: count 0s/1s/2s then overwrite data; Optimal: separate into 3 chains with dummy nodes then link | Both: T=O(2N) S=O(1) |
| `removeNthNodeFromTheEnd.java` | Remove Nth Node From End of List | Brute: count length then walk to (len-n-1); Optimal: fast/slow pointer with n-gap | Brute: T=O(2*Len) S=O(1), Optimal: T=O(Len) S=O(1) |
| `reverseLL.java` | Reverse a Linked List | Brute: use stack to swap data; Optimal: iterative pointer reversal | Brute: T=O(2N) S=O(N), Optimal: T=O(N) S=O(1) |
| `checkPalindrome.java` | Check if Linked List is Palindrome | Brute: use stack; Optimal: find middle, reverse second half, compare | Brute: T=O(2N) S=O(N), Optimal: T=O(2N) S=O(1) |
| `addOne.java` | Add One to Number Represented as Linked List | Brute: reverse, add, reverse back; Optimal: recursive carry propagation | Brute: T=O(3N) S=O(1), Optimal: T=O(N) S=O(N) |
| `intersectionPointOfTwoLL.java` | Intersection Point of Two Linked Lists | Brute: HashMap; Better: align lengths then walk; Optimal: two-pointer swap | Brute: T=O(M+N) S=O(N), Better: T=O(LenA+2*LenB) S=O(1), Optimal: T=O(LenA+LenB) S=O(1) |
| `middleOfLL.java` | Middle of a Linked List | Brute: count length then walk to len/2; Optimal: slow/fast pointer | Brute: T=O(N+N/2) S=O(1), Optimal: T=O(N) S=O(1) |
| `detectAloopInLL.java` | Detect a Loop in Linked List | Brute: HashMap to track visited nodes; Optimal: Floyd's cycle detection (slow/fast) | Brute: T=O(N) S=O(N), Optimal: T=O(N) S=O(1) |
| `startingPointOfLL.java` | Starting Point of Loop in Linked List | Brute: HashMap to track visited nodes; Optimal: Floyd's cycle detection then reset slow | Brute: T=O(N) S=O(N), Optimal: T=O(N) S=O(1) |
| `deleteAllOccOfAKeyInDll.java` | Delete All Occurrences of a Key in DLL | Optimal: Traverse and update prev/next pointers | Optimal: T=O(N) S=O(1) |
| `findAllPairsWithGivenSumInSortedDLL.java` | Find All Pairs with Given Sum in Sorted DLL | Brute: nested loop; Optimal: two pointers (left & right) | Brute: T=O(N^2) S=O(1), Optimal: T=O(N) S=O(1) |
| `removeDuplicatesFromSortedDLL.java` | Remove Duplicates from Sorted DLL | Optimal: single pass skipping duplicates | Optimal: T=O(N) S=O(1) |
| `reverseNodesInKGroupSize.java` | Reverse Nodes in K-Group | Optimal: find kth node, detach group, reverse, relink | T=O(2N) S=O(1) |
| `rotateALL.java` | Rotate a Linked List | Optimal: find tail, make circular, break at new head | T=O(2N) S=O(1) |
| `mergeTwoSortedLL.java` | Merge Two Sorted Linked Lists | Optimal: dummy node with two pointers | T=O(N1+N2) S=O(1) |

---

## Notes

- All solutions are written in **Java** and can be run individually via `javac FileName.java && java FileName`.
- Brute-force and intermediate approaches are kept as **commented code** in each file for comparison.
- Problem order follows **Striver's A2Z DSA Sheet** progression.
- `.class` files are generated artifacts — only `.java` sources are relevant.
