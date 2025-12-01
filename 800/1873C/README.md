# Problem Number - 1873C Target Practice

**Problem Link:** [https://codeforces.com/problemset/problem/1873/C](https://codeforces.com/problemset/problem/1873/C)

---

## Topics
- Implementation  
- Math  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- Board size is fixed: 10 × 10  
- Each cell contains either `'.'` or `'X'`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives a 10×10 board where each `'X'` represents a hit.  
- The score of a hit depends on its distance from the nearest border.  
- For each cell `(i, j)` containing `'X'`:  
  - Compute vertical distance: `x = min(i, 10 - i + 1)`  
  - Compute horizontal distance: `y = min(j, 10 - j + 1)`  
  - The score for that hit is `min(x, y)`.  
- Sum up the scores for all `'X'` cells to get the total score for the board.  
- Repeat this process for each test case.  

## Time and Space Complexity
- **Time Complexity:** `O(100)` per test case, since we scan all 100 cells of the board.  
- **Space Complexity:** `O(1)`, only constant space used for counters and variables.  
