# Problem 2035B - Everyone Loves Tres

**Problem Link:** [https://codeforces.com/problemset/problem/2035/B](https://codeforces.com/problemset/problem/2035/B)

---

## Topics
- Constructive Algorithms
- Number Theory
- Math

## Constraints
- $1 \le t \le 500$ (Number of test cases)
- $1 \le n \le 500$ (Length of the number)
- Sum of $n$ over all test cases does not exceed $2 \cdot 10^5$
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to construct the smallest integer of length $n$ consisting only of digits `3` and `6` (or any valid arrangement) such that the resulting number is divisible by both `2` and `3` (hence divisible by `6`).
- Divisibility by `2` means the number must end with an even digit (`6`).
- Divisibility by `3` means the sum of its digits must be a multiple of `3`.
- By analyzing small values of $n$:
  - For $n = 1$ and $n = 3$, it's impossible to construct such a number, so we output `-1`.
  - For even $n$, we can construct the number using $(n - 2)$ copies of `3` followed by `"66"`. The digit sum will be $3 \times (n - 2) + 6 + 6 = 3n - 6 + 12 = 3n + 6$, which is always a multiple of `3`, and it ends in `6` (divisible by 2).
  - For odd $n$, we can construct the number using $(n - 5)$ copies of `3` followed by `"36366"`. The resulting string has a length of $n$, ends in `6` (even), and satisfies the digit sum constraint for divisibility by 3.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for printing the characters up to length $n$. 
- **Space Complexity:** $O(1)$ auxiliary space, since we generate and print the output on the fly without storing large data structures.