# Problem Number - 1426B Symmetric Matrix

**Problem Link:** [https://codeforces.com/problemset/problem/1426/B](https://codeforces.com/problemset/problem/1426/B)

---

## Topics
- Implementation
- Brute Force
- Matrices

## Constraints
- $1 ≤ t ≤ 100$ (number of test cases)
- $1 ≤ n ≤ 100$ (number of types of tiles)
- $1 ≤ m ≤ 100$ (size of square)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether we can construct an $m \times m$ symmetric matrix using a given set of $n$ types of $2 \times 2$ tiles. A matrix is symmetric if it is equal to its transpose ($A = A^T$), meaning elements across the main diagonal are equal ($a_{ij} = a_{ji}$).
- Since each tile is $2 \times 2$ (with elements `a` (top-left), `b` (top-right), `c` (bottom-left), `d` (bottom-right)), a tile itself can have symmetry across its main diagonal if and only if `b == c`.
- To form a larger $m \times m$ symmetric matrix out of these tiles:
  1. The size $m$ must be an **even number** ($m \% 2 == 0$), because each tile has dimensions $2 \times 2$ and we tile the grid symmetrically. If $m$ is odd, it's impossible to tile it symmetrically.
  2. We must have at least one tile type that is internally symmetric (`b == c`). If we have a symmetric tile, we can place it along the main diagonal of the $m \times m$ matrix and fill the rest appropriately using pairs of tiles and their transposed counterparts (or mirror positions).
- Therefore, the answer is `"YES"` if $m$ is even and at least one given tile satisfies `b == c`; otherwise, it is `"NO"`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, as we iterate through all $n$ given tiles to check for symmetry.
- **Space Complexity:** $O(1)$, since we process each tile on the fly without storing all of them in a heavy data structure.