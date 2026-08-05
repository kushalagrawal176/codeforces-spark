# Problem Number - 199A Hexadecimal's theorem

**Problem Link:** [https://codeforces.com/problemset/problem/199/A](https://codeforces.com/problemset/problem/199/A)

---

## Topics
- Math
- Number Theory
- Implementation

## Constraints
- $0 \le n \le 10^9$
- $n$ is a Fibonacci number
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to represent a given Fibonacci number $n$ as the sum of three Fibonacci numbers: $n = F_a + F_b + F_c$.
- Every Fibonacci number can be represented as the sum of three Fibonacci numbers (some of which may be 0, since $F_0 = 0$ and $F_1 = 1$).
- Specifically, according to the properties of Fibonacci numbers, any Fibonacci number $F_k$ can be broken down using earlier terms in the Fibonacci sequence. 
- A remarkably simple and valid solution for any valid Fibonacci input $n$ is to output `0 0 n`. Since $F_0 = 0$, $0 + 0 + n = n$, and $0, 0, n$ are all valid Fibonacci numbers in the sequence.

## Time and Space Complexity
- **Time Complexity:** $O(1)$, since the solution directly prints the result without any complex loops or computations.
- **Space Complexity:** $O(1)$, using only constant extra space.