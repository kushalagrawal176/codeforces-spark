# Problem Number - 1676D X-Sum  
**Problem Link:** [https://codeforces.com/problemset/problem/1676/D](https://codeforces.com/problemset/problem/1676/D)  

---

## Topics
- Implementation
- Matrices
- Brute Force

---

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n`, `m` ≤ 200  
- 0 ≤ `a[i][j]` ≤ 10⁶  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to find the maximum "X-Sum" in a given matrix.  
- For each cell `(i, j)`, the X-Sum is defined as the sum of all elements lying on the diagonals that pass through `(i, j)`.  
- This includes:
  - Top-left to bottom-right diagonal.  
  - Top-right to bottom-left diagonal.  
- The brute force approach is to iterate over each cell and compute the sum of its diagonals.  
- For every cell `(i, j)`:
  - Traverse diagonally in all four directions (top-left, bottom-right, top-right, bottom-left).  
  - Accumulate the sum of values.  
- Keep track of the maximum sum encountered.  

This approach works because the constraints are small (`n, m ≤ 100`), allowing us to check each cell without exceeding time limits.

---

## Time and Space Complexity
- **Time Complexity:**  
  - For each cell `(i, j)`, we traverse diagonals → `O(n + m)`.  
  - For all cells → `O(n × m × (n + m))`.  
  - With `n, m ≤ 100`, this is efficient enough.  

- **Space Complexity:**  
  - `O(n × m)` for storing the matrix.  
  - No extra space beyond the input grid.  