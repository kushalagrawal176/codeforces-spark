# Problem Number - 1650B DIV + MOD

**Problem Link:** [https://codeforces.com/problemset/problem/1650/B](https://codeforces.com/problemset/problem/1650/B)

---

## Topics
- Math
- Greedy

## Constraints
- 1 ≤ `t` ≤ $10^4$ (number of test cases)
- 1 ≤ `l` ≤ `r` ≤ $10^9$
- 1 ≤ `a` ≤ $10^9$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to maximize the value of $f(x) = \lfloor x / a \rfloor + (x \bmod a)$ for a given integer $x$ in the range $[l, r]$.
- The function $f(x)$ generally increases as $x$ increases, but it drops sharply right after multiples of $a$ (since $x \bmod a$ resets to 0).
- Therefore, the maximum value in the range $[l, r]$ can occur at:
  1. The right endpoint $r$ itself.
  2. The largest multiple of $a$ minus 1 that is less than or equal to $r$, which is given by $(r / a) \times a - 1$. We only consider this if it falls within the range $[l, r]$.
- By checking these two candidate values, we can efficiently find the maximum possible result in $O(1)$ time per test case.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, as it only involves basic arithmetic operations and comparisons.
- **Space Complexity:** $O(1)$, since only a few variables are used to store the inputs and results.