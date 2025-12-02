# Problem Number - 749A Bachgold Problem
**Problem Link:** [https://codeforces.com/problemset/problem/749/A](https://codeforces.com/problemset/problem/749/A)

---

## Topics
- Implementation
- Number Theory
- Math
- Greedy

## Constraints
- 2 ≤ `n` ≤ 100000  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to represent the integer `n` as the sum of prime numbers, using the **maximum number of terms**.
- The smallest prime is `2`, so to maximize the number of terms, we use as many `2`s as possible.
- If `n` is even:
  - Simply output `n/2` terms, all equal to `2`.
- If `n` is odd:
  - Use `(n/2 - 1)` terms of `2` and one `3` (since `3` is prime and ensures the sum equals `n`).
- This guarantees the maximum number of primes in the representation.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for printing up to `n/2` primes.  
- **Space Complexity:** `O(1)`, only a few variables are used.
