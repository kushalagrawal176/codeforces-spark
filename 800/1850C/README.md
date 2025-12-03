# Problem Number - 1850C Word on the Paper  
**Problem Link:** https://codeforces.com/problemset/problem/1850/C  

---

## Topics  
- Implementation  
- Strings  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- Each test case consists of an 8 × 8 grid of characters  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem provides an 8×8 grid filled with lowercase Latin letters and dots (`.`).  
- The task is to reconstruct the word written on the paper by reading all non-dot characters in the grid.  
- Since the word is guaranteed to be written vertically (in a single column), we can simply scan the grid row by row and collect all characters that are not dots.  
- Steps:  
  1. For each test case, read the 8×8 grid.  
  2. Traverse all 64 cells.  
  3. Append every character that is not `.` to the result string.  
  4. Print the reconstructed word.  

This is straightforward simulation: just filter out the dots and concatenate the remaining characters.  

## Time and Space Complexity  
- **Time Complexity:** `O(64) = O(1)` per test case (since we always scan an 8×8 grid). 
- **Space Complexity:** `O(1)`, aside from storing the result string for each test case.  
