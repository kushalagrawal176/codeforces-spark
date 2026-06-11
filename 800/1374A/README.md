# Problem Number - 1374A Required Remainder

**Problem Link:** [https://codeforces.com/problemset/problem/1374/A](https://codeforces.com/problemset/problem/1374/A)

---

## Topics
- Number Theory
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 5 ⋅ 10⁴ 
- 2 ≤ `x` ≤ 10⁹ 
- 0 ≤ `y` < `x`  
- `y` ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to find the largest integer `k` such that:
  - `k ≤ n`
  - `k % x = y`
- To achieve this, we observe that numbers of the form `m * x + y` always leave remainder `y` when divided by `x`.
- We need the largest such number not exceeding `n`.  
- The formula is:  `k = floor((n - y) / x) * x + y`
- This ensures:
  - `k` is divisible by `x` with remainder `y`.
  - `k` is the maximum possible value ≤ `n`.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since the formula directly computes the answer.  
- **Space Complexity:** `O(1)`, only constant space is used.
