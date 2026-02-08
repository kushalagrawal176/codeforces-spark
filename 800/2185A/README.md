# Problem Number - 2185A Perfect Root

**Problem Link:** [https://codeforces.com/problemset/problem/2185/A](https://codeforces.com/problemset/problem/2185/A)

---

## Topics
- Math
- Implementation
- Number Theory

## Constraints
- 1 ≤ `t` ≤ 20 (number of test cases)
- 1 ≤ `n` ≤ 20 (number of perfect roots to output per test case)
- Each perfect root `x` must satisfy: 1 ≤ `x` ≤ 10^9
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A positive integer `x` is called a **perfect root** if there exists an integer `y` such that √y = x.  
  Equivalently, `x` is a perfect root if `x^2` is a perfect square.
- Examples:
  - 1 is a perfect root because √1 = 1.
  - 2 is a perfect root because √4 = 2.
  - 5 is a perfect root because √25 = 5.
- The task is simply to output `n` distinct perfect roots for each test case.
- Since every positive integer is a perfect root (because for any integer `x`, √(x^2) = x), we can just output the first `n` integers: `1, 2, 3, ..., n`.
- This satisfies the distinctness requirement within each test case and is well within the constraint (since n ≤ 20).

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, as we print `n` numbers.
- **Space Complexity:** `O(1)`, only constant space used.
