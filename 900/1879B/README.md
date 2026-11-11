# Problem Number - 1879B Chips on the Board

**Problem Link:** [https://codeforces.com/problemset/problem/1879/B](https://codeforces.com/problemset/problem/1879/B)

---

## Topics
- Greedy
- Math

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n \le 3 \cdot 10^5$ (sum of $n$ over all test cases does not exceed $3 \cdot 10^5$)
- $1 \le a_i, b_i \le 10^9$
- Time limit per test: 2 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We have an $n \times n$ grid where the cost of cell $(i, j)$ is $a_i + b_j$. We need to place a chip on every row and every column such that the total cost is minimized.
- Since we must cover all rows and all columns, we can either:
  1. Fix the minimum element from array $b$ (`minB`) for all cells in every column, and add the entire sum of array $a$ (`sumA`). This gives a total cost of `sumA + n * minB`.
  2. Fix the minimum element from array $a$ (`minA`) for all cells in every row, and add the entire sum of array $b$ (`sumB`). This gives a total cost of `n * minA + sumB`.
- The optimal answer will be the minimum of these two possible strategies: `min(sumA + n * minB, n * minA + sumB)`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for computing the sums and minimums of both arrays in linear passes.
- **Space Complexity:** $O(1)$ auxiliary space, as inputs can be processed on the fly without needing to store them in arrays.