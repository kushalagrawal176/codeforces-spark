# Problem Number - 2185B Prefix Max

**Problem Link:** [https://codeforces.com/problemset/problem/2185/B](https://codeforces.com/problemset/problem/2185/B)

---

## Topics
- Arrays
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 2 ≤ `n` ≤ 50 (size of the array per test case)  
- 1 ≤ `a[i]` ≤ 10⁴  
- Time limit per test: 1.5 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to compute the **maximum prefix sum value** after considering all elements.  
- Since the prefix maximum is determined by the largest element in the array, the optimal solution is straightforward:
  1. Find the maximum element in the array (`maxi`).
  2. Multiply this maximum by `n` (the size of the array).
- This works because the maximum prefix sum achievable is simply the maximum element repeated across all positions.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once to find the maximum.  
- **Space Complexity:** `O(1)`, only constant extra space used.  
