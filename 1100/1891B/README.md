# Problem Number - 1891B Deja Vu  

**Problem Link:** [https://codeforces.com/problemset/problem/1891/B](https://codeforces.com/problemset/problem/1891/B)  

---

## Topics  
- Implementation  
- Arrays  
- Bit Manipulation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `m` ≤ 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- 1 ≤ `x` ≤ 30  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given an array `a` of size `n` and `m` operations. Each operation provides an integer `x`.  
- For each operation, if `x` is smaller than the previously applied `x` (tracked by variable `k`), we update the array.  
- The update rule: For every element `a[i]`, if it is divisible by `2^x`, then add `2^(x-1)` to it.  
- The key observation is that once a smaller `x` is applied, larger values of `x` are ignored because they no longer affect the array.  
- Thus, we only need to process operations in decreasing order of `x`.  
- Efficient implementation uses bit manipulation (`1 << x`) instead of `Math.pow(2, x)` for speed and precision.  

## Time and Space Complexity  
- **Time Complexity:**  
  - For each test case, we may process up to `m` operations, and each operation can scan all `n` elements.  
  - Worst case: `O(n × m)`.  
  - Given constraints (n, m ≤ 2000), this is acceptable within 2 second.  
- **Space Complexity:** `O(n)`, for storing the array.  
