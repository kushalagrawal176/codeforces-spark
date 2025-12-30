# Problem Number - 1613C Poisoned Dagger  
**Problem Link:** [https://codeforces.com/problemset/problem/1613/C](https://codeforces.com/problemset/problem/1613/C)  

---

## Topics
- Binary Search  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `h` ≤ 10^18  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The poisoned dagger deals damage over time. Each strike lasts `k` seconds, but if the next strike happens before `k` seconds, the overlap reduces the effective damage.  
- For each consecutive pair of strikes at times `a[i]` and `a[i+1]`, the damage contribution is `min(k, a[i+1] - a[i])`.  
- The last strike always contributes exactly `k` damage.  
- The goal is to find the minimum `k` such that the total damage is at least `h`.  
- Since damage increases monotonically with `k`, we can use **binary search** on `k` in the range `[1, h]`.  
- At each step, compute the total damage for a candidate `k`. If it meets or exceeds `h`, try smaller `k`; otherwise, increase `k`.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` for computing damage for a given `k`.  
  - `O(log h)` iterations for binary search.  
  - Overall: `O(n log h)`.  

- **Space Complexity:**  
  - `O(n)` for storing the attack times.  
