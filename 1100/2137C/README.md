# Problem Number - 2137C Maximum Even Sum

**Problem Link:** [https://codeforces.com/problemset/problem/2137/C](https://codeforces.com/problemset/problem/2137/C)

---

## Topics
- Brute Force
- Greedy
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `a`, `b` ≤ `a` × `b` ≤ 10¹⁸
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- You are given two integers `a` and `b`.  
- You must choose an integer `k` such that `b` is divisible by `k`. Then:
  - Multiply `a` by `k`
  - Divide `b` by `k`
- After this transformation, compute `a + b`. The goal is to maximize the **even value** of `a + b`.  
- If it is impossible to make `a + b` even, output `-1`.

### Key Observations:
1. **Parity Check:**  
   - If `b` is odd:
     - To make `a + b` even, `a` must also be odd. In this case, choosing `k = b` gives `a × b + 1`.
     - If `a` is even, it’s impossible → output `-1`.
   - If `b` is even:
     - If `b % 4 == 0` or `a` is even, we can achieve an even sum by choosing `k = 2`.  
       Result: `a × (b / 2) + 2`.
     - Otherwise, it’s impossible → output `-1`.

2. **Greedy Choice of k:**  
   - The optimal `k` is either `b` (when `b` is odd and `a` is odd) or `2` (when `b` is divisible by 2).  
   - Larger values of `k` don’t help beyond these cases because the parity condition dominates.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only parity checks and simple arithmetic are performed.
- **Space Complexity:** `O(1)`, no extra storage required.