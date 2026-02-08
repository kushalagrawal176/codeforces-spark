# Problem Number - 2184A Social Experiment

**Problem Link:** [https://codeforces.com/problemset/problem/2184/A](https://codeforces.com/problemset/problem/2184/A)

---

## Topics
- Math
- Implementation
- Parity (Odd/Even)

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 10⁹
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to determine the result of a "social experiment" based on the integer `n`.
- The rules are simple:
  - If `n ≤ 3`, the output is just `n`.
  - If `n > 3`, the output depends on whether `n` is odd or even:
    - For even `n`, output `0`.
    - For odd `n`, output `1`.
- This is equivalent to printing `n % 2` when `n > 3`.
- The solution is straightforward: check the condition and print accordingly.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a constant number of operations are performed.
- **Space Complexity:** `O(1)`, no extra memory used beyond variables.
