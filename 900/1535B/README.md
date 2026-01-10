# Problem Number - 1535B Array Reodering  
**Problem Link:** [https://codeforces.com/problemset/problem/1535/B](https://codeforces.com/problemset/problem/1535/B)  
---

## Topics
- Number Theory  
- Sorting  
- Implementation  
- Greedy

## Constraints
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `n` ≤ 2000  
- 1 ≤ `a[i]` ≤ 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to reorder the array such that the number of "good pairs" `(i, j)` is maximized.  
- A pair `(i, j)` is considered good if `gcd(a[i], 2 * a[j]) > 1`.  
- Key observation:  
  - If `a[i]` is even, then `gcd(a[i], 2 * a[j])` will always be greater than 1 for any `j`.  
  - Therefore, placing all even numbers at the beginning maximizes the number of good pairs.  
- Algorithm:  
  1. Sort the array so that all even numbers come first.  
  2. Iterate over all pairs `(i, j)` with `i < j`.  
  3. Count the pairs where `gcd(a[i], 2 * a[j]) > 1`.  
- This greedy ordering ensures the maximum possible count of good pairs.  

## Time and Space Complexity
- **Time Complexity:** `O(n²)` per test case, since we check all pairs after sorting.  
- **Space Complexity:** `O(1)` or `O(n)`, depending on implementation (temporary storage for sorting).  
