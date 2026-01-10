# Problem Number - 1726A Mainak and Array  
**Problem Link:** [https://codeforces.com/problemset/problem/1726/A](https://codeforces.com/problemset/problem/1726/A)  
---

## Topics
- Greedy  
- Arrays  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 50  
- 1 ≤ `n` ≤ 2000  
- 1 ≤ `a[i]` ≤ 999  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are asked to maximize the difference between two elements after performing a specific operation.  
- The operation allows us to choose any subarray and cyclically shift it.  
- Key observations:  
  1. The maximum difference can be achieved by comparing each element with the **first** element `a[0]`.  
  2. Similarly, compare each element with the **last** element `a[n-1]`.  
  3. Additionally, consider the difference between consecutive elements `(a[i] - a[i+1])` in a cyclic manner.  
- By checking these three cases for all indices, we can compute the maximum possible difference.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once.  
- **Space Complexity:** `O(n)`, for storing the array.  
