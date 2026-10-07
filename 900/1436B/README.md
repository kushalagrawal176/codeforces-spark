# Problem Number - 1436B Prime Square

**Problem Link:** [https://codeforces.com/problemset/problem/1436/B](https://codeforces.com/problemset/problem/1436/B)

---

## Topics
- Constructive Algorithms
- Number Theory
- Math

## Constraints
- $1 \le t \le 10$ (number of test cases)
- $2 ≤ n ≤ 100$ (size of square)
- Time limit per test: 1.5 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires us to construct an $n \times n$ matrix consisting of zeroes and composite numbers such that every row sum and every column sum is a **prime number**, but all individual elements in the matrix are **composite numbers** (neither 1 nor prime).
- A simple and effective construction is to place `1`s on the main diagonal and the secondary diagonal shift:
  - `i == j` (main diagonal)
  - `(i + 1) % n == j` (shifted diagonal offset to ensure each row/column has at least two `1`s, making the sum 2 which is a prime number).
- For all other positions, we place `0`. Since each row/column will contain exactly two `1`s, their sums will be equal to `2` (which is prime), while all elements inside the matrix are either `1` or `0`, which are not prime (since `1` is neither prime nor composite, and any added values can be tailored, but here values 1 and 0 fulfill the condition or a composite sum configuration is directly met).

## Time and Space Complexity
- **Time Complexity:** $O(n^2)$ per test case, to fill and print the $n \times n$ matrix.
- **Space Complexity:** $O(1)$, since no extra data structures are required beyond direct printing.