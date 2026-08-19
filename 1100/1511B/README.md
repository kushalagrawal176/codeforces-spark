# Problem Number - 1511B GCD Length

**Problem Link:** [https://codeforces.com/problemset/problem/1511/B](https://codeforces.com/problemset/problem/1511/B)

---

## Topics
- Constructive Algorithms
- Number Theory
- Math

## Constraints
- $1 ≤ t ≤ 285$
- $1 ≤ a, b ≤ 9$
- $1 ≤ c ≤ min(a, b)$
- Time limit per test: 2 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires finding two integers $x$ and $y$ such that $x$ has $a$ digits, $y$ has $b$ digits, and $\gcd(x, y)$ has $c$ digits.
- To easily control the greatest common divisor, we can build both numbers using powers of 10.
- Let the GCD be $10^{c-1}$, which is the smallest number having $c$ digits (a '1' followed by $c-1$ zeros).
- We can set $x = 10^{a-1}$, which ensures $x$ has exactly $a$ digits and is a multiple of our target GCD.
- We can set $y = (11\dots1) \times 10^{c-1}$ by placing $b-c+1$ ones followed by $c-1$ zeros, ensuring $y$ has exactly $b$ digits and shares the same GCD factor.
- Thus, $\gcd(x, y) = 10^{c-1}$, which has exactly $c$ digits as required.

## Time and Space Complexity
- **Time Complexity:** $O(a + b)$, where the work depends directly on the number of digits required. Given constraints up to 9, this runs in $O(1)$ time.
- **Space Complexity:** $O(a + b)$, to store the string representations of the numbers.