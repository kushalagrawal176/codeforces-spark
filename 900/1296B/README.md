# 1296B - Food Buying

**Problem Link:** [https://codeforces.com/problemset/problem/1296/B](https://codeforces.com/problemset/problem/1296/B)

---

## Topics
- Greedy
- Math
- Implementation

## Constraints
- 1 ≤ `t` ≤ $10^4$
- 1 ≤ `n` ≤ $10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the maximum total amount of burles Polycarp can spend given that he receives $10\%$ of his spent burles back as cashback (i.e., for every $x$ burles spent, he gets $\lfloor x / 10 \rfloor$ back).
- To maximize the benefit, Polycarp should greedily spend the largest possible multiple of 10 at each step, which equals $10 \times \lfloor n / 10 \rfloor$.
- He then updates his remaining burles by adding back the cashback ($\lfloor n / 10 \rfloor$) and the remainder of the division ($n \bmod 10$), updating $n = (n \bmod 10) + (n / 10)$.
- This loop runs as long as $n \ge 10$, after which any final remaining burles ($n < 10$) are spent entirely.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(\log_{10} n)$ per test case, since the value of $n$ reduces logarithmically base 10 at each iteration, making it extremely efficient.
- **Space Complexity:** $\mathcal{O}(1)$, as only a constant amount of extra memory is used for tracking variables.