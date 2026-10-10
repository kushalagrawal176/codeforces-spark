# Problem Number - 1699B Almost Ternary Matrix

**Problem Link:** [https://codeforces.com/problemset/problem/1699/B](https://codeforces.com/problemset/problem/1699/B)

---

## Topics
- Constructive Algorithms
- Implementation
- Matrices

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $2 \le n, m \le 50$, where $n$ and $m$ are even numbers. (height and width of binary matrix)
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to construct a binary matrix of size $n \times m$ (where $n$ and $m$ are multiples of 2) such that every $2 \times 2$ submatrix contains exactly two `1`s and two `0`s.
- By breaking the matrix down into $2 \times 2$ blocks, we can see a repeating pattern of `0` and `1` blocks.
- Using a simple mathematical formula based on the coordinates $(i, j)$, we can determine the value for each cell. Specifically, utilizing `((i + 1) / 2 + (j + 1) / 2) % 2` creates the desired checkerboard pattern of alternating $2 \times 2$ blocks of zeros and ones.
- We iterate through each row from `0` to `n-1` and each column from `0` to `m-1`, printing the computed value directly.

## Time and Space Complexity
- **Time Complexity:** $O(n \times m)$, since we iterate through every cell of the $n \times m$ matrix.
- **Space Complexity:** $O(1)$, as the matrix is printed directly on-the-fly without requiring extra storage.