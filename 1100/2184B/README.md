# Problem Number - 2184B Hourglass

**Problem Link:** [https://codeforces.com/problemset/problem/2184/B](https://codeforces.com/problemset/problem/2184/B)

---

## Topics
- Math
- Implementation
- Modular Arithmetic

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `s`, `k`, `m` ≤ 10⁹
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem involves simulating the behavior of an hourglass with parameters `s`, `k`, and `m`.
- The key observation is:
  - If `(m / k)` is odd, then the effective sand `s` is limited to at most `k`.
  - Otherwise, `s` remains unchanged.
- After this adjustment, the answer is computed as:
  - `max(0, s - (m % k))`
- This formula ensures:
  - We subtract the remainder of `m` divided by `k` from `s`.
  - Clamp the result to be non-negative.
- The solution is straightforward once the condition `(m / k) & 1` (odd/even check) is identified.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a few arithmetic operations are performed.
- **Space Complexity:** `O(1)`, no extra memory used beyond variables.
