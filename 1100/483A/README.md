# Problem Number - 483A Counterexample

**Problem Link:** [https://codeforces.com/problemset/problem/483/A](https://codeforces.com/problemset/problem/483/A)

---

## Topics
- Math
- Number Theory
- Brute Force

## Constraints
- $1 ≤ l ≤ r ≤ 10^{18}$
- $r-l ≤ 50$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks to find three integers $a, b, c$ such that $l \le a < b < c \le r$, where $\gcd(a, b) = 1$, $\gcd(b, c) = 1$, but $\gcd(a, c) \neq 1$.
- Consider the properties of consecutive integers:
    - If $a$ is even, then $\gcd(a, a+1) = 1$ and $\gcd(a+1, a+2) = 1$.
    - Furthermore, if $a$ is even, $a$ and $a+2$ are both even, so $\gcd(a, a+2) = 2 \neq 1$.
- Thus, the simplest solution is to find an even $a$ such that $a+2 \le r$.
- **Case 1:** If $l$ is odd, $l+1$ is even. We can check if $(l+1) + 2 \le r$. If it is, the answer is $(l+1, l+2, l+3)$.
- **Case 2:** If $l$ is even, we can check if $l+2 \le r$. If it is, the answer is $(l, l+1, l+2)$.
- If the range is too small (i.e., less than 3 integers, or specifically if $r-l < 2$ or ($r-l=2$ and $l$ is odd)), it is impossible to find such a triplet, so we output -1.

## Time and Space Complexity
- **Time Complexity:** $O(1)$, as the solution involves basic arithmetic checks regardless of the magnitude of $l$ and $r$.
- **Space Complexity:** $O(1)$, as only a few variables are used.