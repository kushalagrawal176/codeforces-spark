# Problem Number - 1324D Pair of Topics  
**Problem Link:** [https://codeforces.com/problemset/problem/1324/D](https://codeforces.com/problemset/problem/1324/D)  

---

## Topics  
- Sorting  
- Binary Search  
- Two Pointers  
- Implementation  

## Constraints  
- 2 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]`, `b[i]` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given two arrays `a` and `b`. The goal is to count the number of pairs `(i, j)` with `i < j` such that:  `a[i] + a[j] > b[i] + b[j]` 
- Rearranging terms, this condition becomes:  `(a[i] - b[i]) + (a[j] - b[j]) > 0`  
- Define a new array `c[i] = a[i] - b[i]`. The problem reduces to counting pairs `(i, j)` where `c[i] + c[j] > 0`.  
- Approach:  
  1. Compute array `c`.  
  2. Sort `c`.  
  3. For each index `i`, we need to find the smallest index `j > i` such that `c[j] > -c[i]`.  
  4. This can be done using **binary search**.  
  5. The number of valid pairs contributed by `i` is `(n - idx)`, where `idx` is the first index satisfying the condition.  
- Summing over all `i` gives the total count of valid pairs.  

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(n log n)` due to sorting and binary search for each element.  
- **Space Complexity:**  
  - `O(n)` for storing the transformed array `c`.  
