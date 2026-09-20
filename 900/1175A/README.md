# Problem Number - 1175A From Hero to Zero

**Problem Link:** [https://codeforces.com/problemset/problem/1175/A](https://codeforces.com/problemset/problem/1175/A)

---

## Topics
- Greedy
- Math

## Constraints
- $1 \le t \le 100$ (Number of test cases)
- $1 \le n \le 10^{18}$
- $2 \le k \le 10^{18}$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum number of steps to reduce a number $n$ to $0$ using two operations:
  1. Decreases $n$ by $1$ (costs 1 step).
  2. Divides $n$ by $k$ if $n$ is divisible by $k$ (costs 1 step).
- To minimize the total steps (greedily reducing $n$ as fast as possible), we should divide $n$ by $k$ as often as possible.
- If $n$ is not divisible by $k$, the optimal strategy is to subtract $n \pmod k$ to make it a multiple of $k$, adding $n \pmod k$ to the total step count in a single batch.
- Then, if $n > 0$, we divide $n$ by $k$ and increment the step count by $1$.
- We repeat this process until $n$ becomes $0$.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(\log_k n)$ per test case, as $n$ is divided by $k$ at each major step.
- **Space Complexity:** $\mathcal{O}(1)$, since only a few variables (`n`, `k`, `cnt`) are used for computation.