# Problem Number - 2121C Those Who Are With Us  
**Problem Link:** [https://codeforces.com/problemset/problem/2121/C](https://codeforces.com/problemset/problem/2121/C)  

---

## Topics
- Implementation  
- Matrices  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n ⋅ m` ≤ 10⁵ 
- 1 ≤ `a[i][j]` ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to determine the minimum maximum value in the matrix after performing following operation:
  1. choose a row `r` and choose a column `c` 
  2. decrease each element of the matrix by one where `i = r` or `j = c`
  3. This operation is done only once
  
- Steps:
  1. Find the global maximum element `maxi` in the matrix.  
  2. Count how many times `maxi` appears in total (`cnt`).  
  3. For each row, store how many times `maxi` appears.  
  4. For each column, store how many times `maxi` appears.  
  5. For each cell `(i, j)`, compute `rows[i] + columns[j]`.
     - This finds total count of `maxi` that appears in that row and column.
     - If the cell itself is `maxi`, subtract 1 to avoid double counting.  
     - If this sum equals `cnt`, then all occurrences of `maxi` are covered by row `i` and column `j`.  
- If such a cell exists, the answer is `maxi - 1`. Otherwise, the answer is `maxi`.  

This logic ensures we check whether the maximum can be "reduced" by a single row-column pair.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n × m)` to read the matrix and find the maximum.  
  - `O(n × m) ` to compute row and column counts.  
  - `O(n × m)` to check each cell.  
  - Overall: **O(n × m)** per test case.  
- **Space Complexity:**  
  - `O(n + m)` for row and column counts.  
  - `O(n × m)` for storing the matrix.  
  - Overall: **O(n × m)**.  