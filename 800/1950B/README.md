# Problem Number - 1950B Upscaling  
**Problem Link:** [https://codeforces.com/problemset/problem/1950/B](https://codeforces.com/problemset/problem/1950/B)  

---

## Topics
- Implementation 
- Constructive algorithms 
- Pattern printing  

---

## Constraints
- 1 ≤ `t` ≤ 20  
- 1 ≤ `n` ≤ 20  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem requires constructing an **upscaled chessboard-like grid**.  
- Each cell in the original `n × n` grid is expanded into a `2 × 2` block:
  - If the cell is "black," it becomes `"##"`.  
  - If the cell is "white," it becomes `".."`.  
- The parity `(i + j) % 2` determines whether a cell is black or white.  
- For each row `i`, we build a string of length `2n` by alternating `"##"` and `".."`.  
- Each row must be printed **twice** to achieve the vertical upscaling.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n²)` per test case, since we generate `n` rows with `n` cells each (expanded to `2n` characters).  
- **Space Complexity:** `O(n)`, for storing each row string before printing.  