# Problem Number - 509A Maximum in Table

**Problem Link:** [https://codeforces.com/problemset/problem/509/A](https://codeforces.com/problemset/problem/509/A)

---

## Topics
- Dynamic Programming
- Combinatorics
- Pascal Triangle
- Brute force

## Constraints
- 1 ≤ `n` ≤ 10
- Time limit per test: 2 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem defines an `n × n` table where:
  - The first row and first column are filled with `1`.
  - Each other cell is the sum of the cell directly above and the cell directly to the left.
- This recurrence relation is identical to building a **Pascal-like triangle** in 2D.
- The maximum value in the table will always be in the bottom-right corner (`a[n-1][n-1]`).
- Mathematically, this value corresponds to the **binomial coefficient**: `a[n-1][n-1] = C(2n-2, n-1)`
- Since `n` is small (≤ 10), we can either:
  - Build the table using dynamic programming, or
  - Directly compute the binomial coefficient for an optimized solution.

## Time and Space Complexity
- **Dynamic Programming Approach:**
  - **Time Complexity:** `O(n²)`, filling the table.
  - **Space Complexity:** `O(n²)`, storing the table.
- **Optimized Binomial Coefficient Approach:**
  - **Time Complexity:** `O(n)`, computing the coefficient.
  - **Space Complexity:** `O(1)`, only constant space used.
