# Problem Number - 1335A Candies and Two Sisters

**Problem Link:** [https://codeforces.com/problemset/problem/1335/A](https://codeforces.com/problemset/problem/1335/A)

---

## Topics
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)
- 1 ≤ `n` ≤ 2*10^9 (number of candies)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks how many ways two sisters can share `n` candies such that both receive a positive number of candies and the amounts are different.
- If one sister gets `x` candies, the other gets `n - x`. For the amounts to be different, `x ≠ n - x`.
- This means we cannot split evenly when `n` is even.
- The number of valid ways is essentially the count of integers `x` such that `1 ≤ x < n/2`.
- Therefore:
  - If `n` is even → answer = (n / 2) - 1
  - If `n` is odd → answer = n / 2 (integer division)
- This matches the formula used in the sample solution.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since the formula is direct.
- **Space Complexity:** `O(1)`, only constant space is used.
