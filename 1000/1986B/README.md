# Problem Number - 1986B Matrix Stabilization

**Problem Link:** [https://codeforces.com/problemset/problem/1986/B](https://codeforces.com/problemset/problem/1986/B)

---

## Topics
- Implementation
- Greedy
- Matrices

## Constraints
- 1 ≤ `t` ≤ 10⁴ 
- 1 ≤ `n`, `m` ≤ 100  
- 1 ≤ `a[i][j]` ≤ 10⁹ 
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to "stabilize" a matrix by ensuring that no cell value is strictly greater than all of its adjacent neighbors (up, down, left, right).  
- If a cell is larger than all its neighbors, it must be reduced to the **maximum of its adjacent values**.  
- This ensures that every cell is **bounded** by its surroundings and no element dominates its neighbors.  
- The approach is straightforward:
  1. Traverse each cell in the matrix.
  2. For each cell, compute the maximum among its valid neighbors.
  3. Replace the cell value with the minimum of its current value and that maximum neighbor value.
- This guarantees stabilization in one pass because each cell is adjusted relative to its neighbors.

## Time and Space Complexity
- **Time Complexity:** `O(n × m)`, since we check each cell and its neighbors once.  
- **Space Complexity:** `O(1)` additional space (apart from the matrix itself).  
