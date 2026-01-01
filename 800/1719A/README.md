# Problem Number - 1719A Chip Game  
**Problem Link:** [https://codeforces.com/problemset/problem/1719/A](https://codeforces.com/problemset/problem/1719/A)  

---

## Topics  
- Implementation  
- Math (Parity Check)  
- Game Theory  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n`, `m` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The game is played on an `n × m` grid.  
- The winner depends only on the **parity** of `(n + m)`:  
  - If `(n + m)` is **even**, Tonya wins.  
  - If `(n + m)` is **odd**, Burenka wins.  
- This is because the moves alternate, and the parity of the sum determines who gets the last move.  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case, read integers `n` and `m`.  
3. Compute `(n + m)`.  
   - If even, print `"Tonya"`.  
   - If odd, print `"Burenka"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only addition and parity check are performed.  
- **Space Complexity:** `O(1)`, no extra memory used.  
