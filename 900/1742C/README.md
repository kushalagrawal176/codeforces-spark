# Problem Number - 1742C Stripes  
**Problem Link:** [https://codeforces.com/problemset/problem/1742/C](https://codeforces.com/problemset/problem/1742/C)  

---

## Topics
- Implementation  
- Strings  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 4000  
- Each test consists of an `8 × 8` grid of characters (`R` or `B`)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives an 8×8 chessboard-like grid filled with characters `R` and `B`.  
- The task is to determine which color will win based on the rules:  
  - If there exists a row completely filled with `R`, then `R` wins.  
  - Otherwise, `B` wins.  
- Approach:  
  - For each test case, read the 8 rows of the grid.  
  - Check if any row is `"RRRRRRRR"`.  
  - If such a row exists, output `"R"`.  
  - Otherwise, output `"B"`.  
- This works because the problem guarantees that one of the two colors will satisfy the winning condition.  

## Time and Space Complexity
- **Time Complexity:** `O(64) = O(1)` per test case (since we check all 8 rows of length 8).  
- **Space Complexity:** `O(1)`, only constant space used for storing strings temporarily.  
