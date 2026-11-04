# 913A - Modular Exponentiation

**Problem Link:** [https://codeforces.com/problemset/problem/913/A](https://codeforces.com/problemset/problem/913/A)

---

## Topics
- Implementation
- Math

## Constraints
- $1 \le n, m \le 10^8$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to calculate $m \pmod{2^n}$.
- Since $m \le 10^8$ and $2^{27} > 10^8$, if $n$ is large (specifically $n \ge 30$), $2^n$ is guaranteed to be strictly greater than $m$. In this case, $m \pmod{2^n}$ is simply equal to $m$.
- For smaller values of $n$ ($n < 30$), we can safely compute $2^n$ using a bitwise shift (`1LL << n`) without risking integer overflow.
- Finally, we output the result of $m \pmod{2^n}$.

## Time and Space Complexity
- **Time Complexity:** $O(1)$, since it involves a direct conditional check and a bitwise operation.
- **Space Complexity:** $O(1)$, using a constant amount of memory for variables.