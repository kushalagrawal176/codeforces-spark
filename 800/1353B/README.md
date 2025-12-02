# Problem Number - 1353B Two Arrays And Swaps
**Problem Link:** [https://codeforces.com/problemset/problem/1353/B](https://codeforces.com/problemset/problem/1353/B)

---

## Topics
- Implementation
- Greedy
- Sorting

## Constraints
- 1 ≤ `t` ≤ 200  
- 1 ≤ `n` ≤ 30  
- 0 ≤ `k` ≤ n  
- 1 ≤ `a[i]`, `b[i]` ≤ 30  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given two arrays `a` and `b` of size `n`. We can perform at most `k` swaps where we replace an element from `a` with an element from `b`.
- The goal is to maximize the sum of array `a` after swaps.
- Strategy:
  - Sort array `a` in ascending order and array `b` in ascending order.
  - Compare the smallest elements of `a` with the largest elements of `b`.
  - If `a[i] < b[n - i - 1]` and swaps are still available, replace `a[i]` with `b[n - i - 1]`.
  - Stop early if no beneficial swap is possible.
- Finally, compute the sum of the modified array `a`.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting both arrays.  
- **Space Complexity:** `O(n)`, for storing the arrays.
