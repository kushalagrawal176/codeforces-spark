# Problem Number - 1828B Permutation Swap  
**Problem Link:** [https://codeforces.com/problemset/problem/1828/B](https://codeforces.com/problemset/problem/1828/B)  
---

## Topics
- Number Theory  
- Greatest Common Divisor (GCD)  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴
- 2 ≤ `n` ≤ 10⁵  
- The permutation consists of integers from `1` to `n`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given a permutation of numbers from 1 to `n`.  
- The task is to find the largest integer `k` such that by repeatedly swapping elements at positions differing by `k`, the permutation can be sorted into the identity permutation `[1, 2, 3, ..., n]`.  
- Key observation:  
  - For each element at position `i`, the difference between its value and its index (`|a[i] - i|`) must be divisible by `k`.  
  - Therefore, `k` must divide all such differences across the permutation.  
- The solution is to compute the **GCD** of all differences `|a[i] - i|`.  
- This GCD gives the largest possible step size `k` that allows the permutation to be sorted using swaps.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we compute differences and their GCD in one pass.  
- **Space Complexity:** `O(1)`, only constant space used for GCD calculation.  
