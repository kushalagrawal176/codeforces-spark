# Problem Number - 1283B Candies Division

**Problem Link:** [https://codeforces.com/problemset/problem/1283/B](https://codeforces.com/problemset/problem/1283/B)

---

## Topics
- Math
- Number Theory
- Greedy

## Constraints
- $1 \le t \le 5 \cdot 10^4$ (number of test cases)
- $1 \le n, k \le 10^9$ (number of candies and the number of kids)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We have $n$ candies to distribute as evenly as possible among $k$ children, such that no child gets more than one candy more than any other child, and we want to maximize the total number of candies distributed.
- First, each child can receive an equal base amount of $\lfloor n / k \rfloor$ candies. This accounts for $(n / k) \times k$ candies in total.
- The remaining candies, given by $n \pmod k$, need to be distributed among the children. 
- According to the problem statement, a child can receive at most $\lfloor k / 2 \rfloor$ extra candies over the base amount. Therefore, we can distribute at most $\min(n \pmod k, \lfloor k / 2 \rfloor)$ of the leftover candies.
- Adding this to our base total gives the formula: 
  $$\text{ans} = (n / k) \times k + \min(n \pmod k, k / 2)$$

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(1)$ per test case, as it uses direct mathematical calculation.
- **Space Complexity:** $\mathcal{O}(1)$, only constant extra space used.