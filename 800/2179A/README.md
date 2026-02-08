# Problem Number - 2179A Blackslex and Password

**Problem Link:** [https://codeforces.com/problemset/problem/2179/A](https://codeforces.com/problemset/problem/2179/A)

---

## Topics
- Math
- Implementation
- Combinatorics

## Constraints
- 1 ≤ `t` ≤ 500 (number of test cases)
- 1 ≤ `k` ≤ 26
- 1 ≤ `x` ≤ 15
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to determine the number of possible passwords or configurations based on two integers `k` and `x`.
- The formula derived is straightforward:  
  - Result = `k * x + 1`
- This comes from the fact that for each of the `k` positions, there are `x` choices, and we add one extra configuration to account for a special case defined in the problem.
- Thus, for each test case, simply compute `k * x + 1` and output it.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a single arithmetic operation is performed.
- **Space Complexity:** `O(1)`, only a few variables are used.
