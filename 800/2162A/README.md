# Problem Number - 2162A Beautiful Average

**Problem Link:** [https://codeforces.com/problemset/problem/2162/A](https://codeforces.com/problemset/problem/2162/A)

---

## Topics
- Arrays
- Math
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 10 (length of array)
- 1 ≤ `aᵢ` ≤ 10 (array elements)
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem requires finding the maximum average of any subarray.
- A subarray is defined as a contiguous segment of the array.
- The average of a subarray is the sum of its elements divided by its length.
- To maximize the average, we should consider the largest element in the array:
  - Any subarray containing that element will have an average ≤ that element.
  - A subarray consisting of only that element will have an average exactly equal to it.
- Therefore, the maximum average is simply the **maximum element** of the array.

### Steps:
1. Read the number of test cases `t`.
2. For each test case:
   - Read `n` (size of array).
   - Read the array elements.
   - Find the maximum element in the array.
   - Print that maximum element (this is the maximum average).

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once to find the maximum.
- **Space Complexity:** `O(1)`, as we only store a few variables.