# Problem Number - 1765M Minimum LCM

**Problem Link:** [https://codeforces.com/problemset/problem/1765/M](https://codeforces.com/problemset/problem/1765/M)

---

## Topics
- Math
- Number Theory
- Greedy

## Constraints
- 1 ≤ `t` ≤ 100 (Number of test cases)
- 2 ≤ `n` ≤ $10^9$
- Time limit per test: 2 seconds
- Memory limit per test: 512 megabytes

## Intuition / Approach
- We need to split $n$ into two positive integers $a$ and $b$ such that $a + b = n$ and $\text{LCM}(a, b)$ is minimized.
- To minimize the $\text{LCM}(a, b)$, we should maximize the Greatest Common Divisor ($\text{GCD}$) of $a$ and $b$, since $\text{LCM}(a, b) = \frac{a \times b}{\text{GCD}(a, b)}$.
- If $a$ is a divisor of $n$, then $b = n - a$ will also be a multiple of $a$. In this case, $\text{GCD}(a, b) = a$, and $\text{LCM}(a, b) = b = n - a$.
- To minimize $n - a$, we need to maximize $a$.
- The largest proper divisor $a$ of $n$ corresponds to $\frac{n}{p}$, where $p$ is the smallest prime factor of $n$.
- Therefore, we can find the smallest prime factor $p \ge 2$ that divides $n$:
  - If such a factor $p$ exists (up to $\sqrt{n}$), then $a = \frac{n}{p}$ and $b = n - a$.
  - If $n$ is prime (no factor found up to $\sqrt{n}$), the largest proper divisor is $a = 1$, making $b = n - 1$.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(\sqrt{n})$ per test case to check for the smallest prime factor up to $\sqrt{n}$.
- **Space Complexity:** $\mathcal{O}(1)$, as only a few scalar variables are used.