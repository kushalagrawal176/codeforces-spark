# Problem Number - 1474B Different Divisors
**Problem Link:** [https://codeforces.com/problemset/problem/1474/B](https://codeforces.com/problemset/problem/1474/B)

---

## Topics

1. Number Theory
2. Primes
3. Math

## Constraints

1. $1 \leq d \leq 10^4$
2. Up to 1000 test cases

## Intuition / Approach

1. For each test case, given a positive integer $d$.
2. Find the smallest positive integer $a$ that has at least 4 divisors AND the difference between any two divisors of $a$ is at least $d$.
3. Such a number typically has exactly 4 divisors, which occurs when $a = p^3$ (where $p$ is prime), or $a = p \times q$ where $p \neq q$ and both are primes.
4. Efficient approach:
   - Find the smallest prime $p_1 \geq d+1$.
   - Find the next smallest prime $p_2 \geq p_1 + d$.
   - Compute $a = p_1 \times p_2$ (often smaller than $p_1^3$).
5. Output $a$ for each test case as the answer.

## Time and Space Complexity

- **Time Complexity:** $O(t \cdot \sqrt{N})$
- **Space Complexity:** $O(1)$ or $O(N)$ if using a sieve.
