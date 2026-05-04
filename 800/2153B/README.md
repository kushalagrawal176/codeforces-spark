# Problem Number - 2153B Bitwise Reversion

**Problem Link:** [https://codeforces.com/problemset/problem/2153/B](https://codeforces.com/problemset/problem/2153/B)

---

## Topics
- Bit Manipulation
- Implementation
- Logic

## Constraints
- 1 ≤ `t` ≤ 10⁴ 
- 0 ≤ `x`, `y`, `z` ≤ 10⁹  
- Time limit per test: 1.5 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- You are given three integers `x`, `y`, and `z` which represent the results of bitwise AND operations:
  - `a & b = x`
  - `b & c = y`
  - `a & c = z`
- The task is to determine if there exist non-negative integers `a`, `b`, and `c` that satisfy all three conditions simultaneously.
- **Key Insight:**  
  For the conditions to hold, the pairwise AND results must be consistent. This means:
  - `(x & y) == (y & z)`  
  - `(x & z) == (x & y)`  
- If both conditions are true, then such integers `a`, `b`, and `c` exist, and the answer is `"YES"`. Otherwise, the answer is `"NO"`.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a few bitwise operations and comparisons are performed.  
- **Space Complexity:** `O(1)`, no extra space is required beyond input storage.  