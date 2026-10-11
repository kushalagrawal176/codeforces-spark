# Problem Number - 2102A Dinner Time

**Problem Link:** [https://codeforces.com/problemset/problem/2102/A](https://codeforces.com/problemset/problem/2102/A)

---

## Topics
- Implementation
- Math
- Number Theory

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le p \le n \le 100$
- $1 \le q,m \le 100$
- $n$ - length of array
- $m$ - sum of elements
- $p$ - length of segment
- $q$ - sum of segment
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem involves checking a divisibility or ratio condition based on the given parameters `n`, `m`, `p`, and `q`.
- Specifically, we check if `n` is divisible by `p` (`n % p == 0`) and whether the expected proportional value `(n / p) * q` matches `m`.
- If `n` is a multiple of `p`, but the scaled quantity doesn't match `m`, the condition fails and we output `"NO"`. Otherwise, we output `"YES"`.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, as it involves simple arithmetic operations and conditional checks.
- **Space Complexity:** $O(1)$, only constant space used for variables.