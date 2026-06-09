# Problem Number - 1294A Collecting Coins

**Problem Link:** [https://codeforces.com/problemset/problem/1294/A](https://codeforces.com/problemset/problem/1294/A)

---

## Topics
- Implementation
- Math
- Greedy

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `a`, `b`, `c`, `n` ≤ 10⁸  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to distribute `n` extra coins among three people so that all of them end up with the same number of coins.  
- First, find the maximum number of coins among the three (`max(a, b, c)`).  
- To equalize, each of the other two must be raised to this maximum. The minimum required coins for equalization is:  
  `required = (max - a) + (max - b) + (max - c)`  
- If `n` is at least `required`, then the remaining coins after equalization must be divisible by 3 (so they can be evenly distributed).  
- Hence, the condition is:  
  - `n >= required`  
  - `(n - required) % 3 == 0`  
- If both conditions hold, answer is **YES**, otherwise **NO**.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a few arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, no extra memory used apart from variables.