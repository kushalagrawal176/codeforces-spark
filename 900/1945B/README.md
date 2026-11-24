# Problem Number - 1945B Fireworks

**Problem Link:** [https://codeforces.com/problemset/problem/1945/B](https://codeforces.com/problemset/problem/1945/B)

---

## Topics
- Math
- Number Theory

## Constraints
- $1 \le t \le 10^4$
- $1 \le a, b, m \le 10^{18}$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Two fireworks launch periodically at intervals of `a` and `b` minutes, and each firework remains visible in the sky for `m + 1` minutes (from its launch time `t_0` through `t_0 + m` inclusive).
- Consider the first launch of firework A at time `0` and firework B at time `0`. Both are visible at `t = 0`.
- Firework A launches at multiples of `a` (`0, a, 2a, ...`). Any launch at `k * a` is still visible at time `m` if `k * a <= m`, giving `floor(m / a) + 1` launches visible at time `m` (including `k = 0`).
- Similarly, firework B has `floor(m / b) + 1` launches visible at time `m` (including `k = 0`).
- Adding both together gives `(m / a + 1) + (m / b + 1) = (m / a) + (m / b) + 2` maximum simultaneous fireworks visible at some moment.
- Use 64-bit integers (`long long`) because `a`, `b`, and `m` can be up to $10^{18}$.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, using integer division.
- **Space Complexity:** $O(1)$, using only a few scalar variables.