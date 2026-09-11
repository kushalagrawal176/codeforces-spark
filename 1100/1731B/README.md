# Problem Number - 1731B Kill Demodogs

**Problem Link:** [https://codeforces.com/problemset/problem/1731/B](https://codeforces.com/problemset/problem/1731/B)

---

## Topics
- Math
- Number Theory
- Combinatorics
- Greedy

## Constraints
- $1 \le t \le 10^4$
- $2 \le n \le 10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find a path from $(1, 1)$ to $(n, n)$ in an $n \times n$ grid where each cell $(i, j)$ contains $i \times j$ Demodogs, such that the sum of Demodogs killed along the path is maximized, and then multiply the result by 2022 modulo $10^9 + 7$.
- Moving only right and down means to maximize the sum, we should greedily touch cells along the main diagonal as much as possible, specifically moving diagonally by stepping right then down (or down then right) to capture terms like $i^2$ along the diagonal.
- By analyzing the optimal path, the sum of values collected consists of squares along the diagonal ($\sum_{i=1}^{n} i^2$) plus specific off-diagonal elements ($\sum_{i=1}^{n-1} i \cdot (i+1)$).
- Using summation formulas:
  - $\sum_{i=1}^{n} i^2 = \frac{n(n+1)(2n+1)}{6}$
  - $\sum_{i=1}^{n-1} i(i+1) = \frac{n(n-1)(n+1)}{3}$
- Combining and simplifying the expression algebraically gives the total sum multiplied by 2022 as:
  $$\text{Total Sum} = \frac{337 \cdot n \cdot (n + 1) \cdot (4n - 1)}{3}$$
- Thus, the problem reduces to calculating this formula modulo $10^9 + 7$ in $O(1)$ time using modular arithmetic.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, since it uses a direct mathematical formula.
- **Space Complexity:** $O(1)$, as only a few variables are used for computation.