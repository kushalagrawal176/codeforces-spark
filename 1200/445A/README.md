# Problem Number - 445A DZY Loves Chessboard  
**Problem Link:** [https://codeforces.com/problemset/problem/445/A](https://codeforces.com/problemset/problem/445/A)  

---

## Topics
- Implementation  
- Greedy  
- Strings  

## Constraints
- 1 ≤ `n`, `m` ≤ 100 (dimensions of the chessboard)  
- Each cell contains either `'.'` (empty) or `'-'` (blocked).  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to fill the chessboard such that:  
  - Every empty cell `.` is replaced with either `'B'` (black) or `'W'` (white).  
  - Adjacent cells must have different colors.  
  - Blocked cells `'-'` remain unchanged.  

- A simple constructive approach works:  
  1. Traverse the board row by row.  
  2. For each empty cell at position `(i, j)`:  
     - If `(i + j)` is even → assign `'B'`.  
     - If `(i + j)` is odd → assign `'W'`.  
  3. This ensures alternating colors across rows and columns.  
  4. Blocked cells are left unchanged.  

- This greedy coloring guarantees a valid chessboard pattern without conflicts.

## Time and Space Complexity
- **Time Complexity:** `O(n × m)`, since each cell is processed once.  
- **Space Complexity:** `O(1)`, aside from storing the board string temporarily.  
