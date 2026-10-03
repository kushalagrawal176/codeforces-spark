# Problem Number - 1733B Rule of League

**Problem Link:** [https://codeforces.com/problemset/problem/1733/B](https://codeforces.com/problemset/problem/1733/B)

---

## Topics
- Math
- Constructive Algorithms
- Number Theory

## Constraints
- $1 \le t \le 10^5$ (number of test cases)
- $2 \le n \le 10^5$ 
- $0 \le x, y < n$
- Time limit per test: 2 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find a sequence of winners for $n-1$ matches in a tournament such that every winner wins exactly either $x$ or $y$ matches, and no one wins both $x$ and $y$ (meaning either $x = 0$ or $y = 0$, but not both, and they cannot both be $0$).
- If both $x$ and $y$ are $0$, or if both are non-zero, it is impossible to have a valid tournament layout, so we output `-1`.
- Let `lim` be the non-zero value between $x$ and $y$. For a valid configuration to exist, the total number of matches played ($n-1$) must be completely divisible by `lim` (i.e., $(n-1) \pmod{\text{lim}} == 0$). If it's not divisible, output `-1`.
- If valid, the tournament can be structured such that players win sequentially in blocks of size `lim`. Specifically, player 1 wins the first `lim` matches, then player $(\text{lim} + 1)$ wins the next `lim` matches, and so on.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$, for iterating through the matches and printing the winner for each of the $n-1$ games.
- **Space Complexity:** $\mathcal{O}(1)$, as only a few variables are used to keep track of the current winner and block counts.