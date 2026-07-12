# Problem 1411B - Fair Numbers

**Problem Link:** [https://codeforces.com/problemset/problem/1411/B](https://codeforces.com/problemset/problem/1411/B)

---

## Topics
- Math
- Brute Force

## Constraints
- $1 \le t \le 10^3$ (Number of test cases)
- $1 \le n \le 10^{18}$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A number is considered "fair" if it is divisible by all of its non-zero digits.
- The problem asks for the smallest fair number greater than or equal to $n$.
- An important mathematical insight is that the **Least Common Multiple (LCM) of all single digits from 1 to 9 is 2520**. This implies that among **any 2520 consecutive integers**, there is **at least one number** divisible by all numbers from 1 to 9. Since a fair number only needs to be divisible by its *own* digits (a subset of 1–9), a fair number is guaranteed to be found within a very short distance from $n$ (at most 2520 steps).
- Given this small upper bound on the number of steps, a straightforward **Brute Force** simulation works perfectly:
  1. Start from the given number $n$.
  2. Check if $n$ is fair by isolating each of its digits using modulo 10 arithmetic (`n % 10`) and division (`n / 10`).
  3. If any non-zero digit does not divide $n$, increment $n$ by 1 and repeat the check.
  4. The loop will terminate quickly, yielding the correct answer.

## Time and Space Complexity
- **Time Complexity:** $O(t \times K \times \log_{10}(n))$, where $t$ is the number of test cases, $\log_{10}(n)$ is the number of digits in $n$ (at most 19 digits), and $K$ is the number of increments needed to find the next fair number ($K \le 2520$). In the worst case, this requires only a few thousand operations per test case, easily fitting within the 2-second time limit.
- **Space Complexity:** $O(1)$, as the algorithm only uses a few variables to extract digits and store the current state, requiring constant memory.