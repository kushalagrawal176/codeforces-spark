# Problem Number - 1840B Binary Cafe

**Problem Link:** [https://codeforces.com/problemset/problem/1840/B](https://codeforces.com/problemset/problem/1840/B)

---

## Topics
- Math
- Bitwise Operations
- Combinatorics

## Constraints
- $1 ≤ t ≤ 1000$ (Number of test cases)
- $1 ≤ n ≤ 10^9$
- $1 ≤ k ≤ 10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find how many distinct non-negative integers $x$ can be formed such that $0 \le x \le n$, where $x$ is represented as a binary number using at most $k$ bits.
- Using $k$ bits, we can represent numbers from $0$ to $2^k - 1$. This gives us a total of $2^k$ possible values.
- However, we are constrained by $n$. We can only choose values in the range $[0, n]$.
- If $2^k$ is greater than $n+1$ (the total count of numbers from $0$ to $n$), then the number of possible values is limited by $n+1$.
- If $2^k$ is less than or equal to $n+1$, then all $2^k$ values are valid.
- Therefore, the result is $\min(n + 1, 2^k)$.
- **Note on implementation:** Since $k$ can be up to $10^9$, we must be careful. $2^k$ will exceed the range of standard integer types very quickly. However, since $n \le 10^9$, we only care about $2^k$ if $k < 30$ (because $2^{30} > 10^9$). If $k \ge 30$, $2^k$ will certainly be larger than $n+1$, so we can simply cap the value.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, as the calculation involves simple comparison and a limited bit shift.
- **Space Complexity:** $O(1)$, as only a few variables are used for calculation.