# Problem Number - 500A New Year Transportation  
**Problem Link:** [https://codeforces.com/problemset/problem/500/A](https://codeforces.com/problemset/problem/500/A)  

---

## Topics  
- Graph Traversal  
- Simulation  
- Implementation  
- DFS / BFS

## Constraints  
- 3 ≤ `n` ≤ 3 × 10⁴ (number of cells)  
- 2 ≤ `t` ≤ `n` (target cell)  
- 1 ≤ `aᵢ` ≤ `n - i` (jump length from cell i)  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem describes a one-dimensional board with `n` cells.  
- Starting from cell 1, each cell `i` contains a number `a[i]` which tells how far you can jump forward.  
- The task is to determine if it’s possible to reach exactly cell `t` by following these jumps.  
- Simulation approach:  
  - Start at cell 1.  
  - Repeatedly jump forward by the value in the current cell.  
  - Stop once you either reach or surpass cell `t`.  
- If the final position equals `t`, print `"YES"`. Otherwise, print `"NO"`.  

This works because the path is deterministic — there’s only one possible sequence of jumps, so simulation suffices.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since each cell is visited at most once.  
- **Space Complexity:** `O(n)`, for storing the jump values.  
