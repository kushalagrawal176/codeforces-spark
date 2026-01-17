# Problem Number - 2004C Splitting Items  
**Problem Link:** [https://codeforces.com/problemset/problem/2004/C](https://codeforces.com/problemset/problem/2004/C)  
---
## Topics
- Greedy  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 5000  
- 2 ≤ `n` ≤ 2 × 10⁵  
- 0 ≤ `k` ≤ 10⁹  
- 1 ≤ `a[i]` ≤ 10⁹  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are asked to split items between Alice and Bob with a special adjustment rule.  
- Steps:
  1. Sort the array of items.  
  2. Alice and Bob take items alternately starting from the largest.  
  3. For Bob’s items, he can increase their value by up to `k`, but not more than the difference to the next larger item.  
  4. Alice simply takes her items as they are.  
- Maintain two sums:
  - `al` = Alice’s total.  
  - `bo` = Bob’s total (including adjustments).  
- The answer is `al - bo`.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case due to sorting.  
- **Space Complexity:** `O(n)`, for storing the array.  
