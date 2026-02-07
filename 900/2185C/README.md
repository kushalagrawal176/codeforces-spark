# Problem Number - 2185C Shifted MEX

**Problem Link:** [https://codeforces.com/problemset/problem/2185/C](https://codeforces.com/problemset/problem/2185/C)

---

## Topics
- Arrays
- Sorting
- Implementation
- Consecutive subsequences

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 3000 (length of the array per test case)  
- -10⁹ ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem revolves around finding the **longest consecutive subsequence** in the array after sorting.  
- Steps:
  1. **Sort the array** to bring duplicates together and arrange numbers in ascending order.
  2. Traverse the sorted array:
     - Skip duplicates since they don’t extend the consecutive sequence.
     - If the current element is exactly one greater than the previous, extend the current consecutive count.
     - Otherwise, reset the count and update the maximum length found so far.
  3. At the end, the maximum length of consecutive increasing subsequence is the answer.
- This works because the "Shifted MEX" condition essentially reduces to finding the longest chain of consecutive integers in the array.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case due to sorting, plus `O(n)` for traversal.  
- **Space Complexity:** `O(1)` extra space (apart from the input array).  
