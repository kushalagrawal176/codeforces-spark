# Problem Number - 1797B Li Hua and Pattern

**Problem Link:** [https://codeforces.com/problemset/problem/1797/B](https://codeforces.com/problemset/problem/1797/B)

---

## Topics
- Greedy
- Implementation
- Graphs / Matrices

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $1 \le n \le 1000$ (grid size)
- $0 \le k \le 10^9$ (allowed operations)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether we can make an $n \times n$ grid centrally symmetric (point symmetry around the center) using at most $k$ operations (changing an element's value).
- We can iterate through the corresponding symmetric pairs of cells in the grid: element $(i, j)$ corresponds to $(n - 1 - i, n - 1 - j)$.
- For each mismatch found between these symmetric pairs, we must spend $1$ operation ($k$ decreases by $1$) to fix it.
- If $k$ drops below $0$ at any point, it's impossible, so we output `NO`.
- If we finish checking and have leftover operations ($k \ge 0$):
  - If $n$ is odd, any leftover operations can be wasted back and forth on the center element or a single pair without changing the central symmetry.
  - If $n$ is even, leftover operations must be even ($k \pmod 2 == 0$) because changes must be made in pairs to preserve symmetry if no mismatches are left.

## Time and Space Complexity
- **Time Complexity:** $O(n^2)$ per test case, since we iterate through the grid elements to check for symmetry.
- **Space Complexity:** $O(n^2)$ to store the 2D grid of size $n \times n$.