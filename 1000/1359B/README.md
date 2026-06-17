# Problem Number - 1359B New Theatre Square  
**Problem Link:** [https://codeforces.com/problemset/problem/1359/B](https://codeforces.com/problemset/problem/1359/B)

---

## Topics
- Greedy
- Implementation
- Dynamic Programming

---

## Constraints
- 1 ≤ `t` ≤ 500  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `m` ≤ 1000  
- 1 ≤ `x`, `y` ≤ 1000  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The theatre square is represented as a grid of `n × m` cells, where each cell is either empty (`.`) or blocked (`*`).  
- We need to cover all empty cells with tiles:
  - A **single tile** costs `x` and covers one cell.  
  - A **double tile** costs `y` and covers two adjacent horizontal cells.  
- The key observation is that a double tile is only useful if it is cheaper than placing two single tiles, i.e., when `y < 2 × x`.  
- Strategy:
  1. Traverse each row of the grid.  
  2. If the current cell is empty:
     - Check if the next cell is also empty and if using a double tile is cheaper.  
     - If yes, place a double tile (`cost += y`) and skip two cells.  
     - Otherwise, place a single tile (`cost += x`) and move one cell forward.  
  3. If the current cell is blocked, simply move forward.  
- This greedy approach ensures minimal cost because at each step we choose the optimal tile placement.

---

## Time and Space Complexity
- **Time Complexity:** `O(n × m)`, since we scan each cell once.  
- **Space Complexity:** `O(n × m)` for storing the grid, though it can be optimized to `O(m)` if processed row by row.  