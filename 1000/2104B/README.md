# Problem Number - 2104B Move to the End  
**Problem Link:** [https://codeforces.com/problemset/problem/2104/B](https://codeforces.com/problemset/problem/2104/B)  

---

## Topics
- Arrays  
- Prefix/Suffix Computations  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (array size per test case)  
- 1 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Sum of `n` across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit: 512 megabytes  

## Intuition / Approach
- The problem requires computing a special value for each element when moving to the end of the array.  
- For each index `i`, the value is derived from:  
  - The suffix sum starting at `i` (sum of all elements from `i` to `n-1`).  
  - The maximum value encountered up to index `i` (prefix maximum).  
- Formula:  
  `result[i] = suffix_sum[i] - a[i] + max(a[i], prefix_max[i])`  
- Steps:  
  1. Precompute suffix sums from right to left.  
  2. Precompute prefix maximums from left to right.  
  3. For each index, apply the formula and print the result.  

This ensures each query is answered in **O(n)** per test case, which is efficient given the constraints.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we compute suffix sums and prefix maximums in linear time.  
- **Space Complexity:** `O(n)`, for storing suffix sums and prefix maximums.  
