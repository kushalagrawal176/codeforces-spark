# Problem Number - 451A Game With Sticks  
**Problem Link:** [https://codeforces.com/problemset/problem/451/A](https://codeforces.com/problemset/problem/451/A)  

---

## Topics  
- Game Theory  
- Implementation  

## Constraints  
- 1 ≤ `n`, `m` ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The game starts with an `n × m` grid of sticks.  
- On each turn, a player removes one stick from both a row and a column simultaneously.  
- The game ends when either all rows or all columns are exhausted.  
- Key observation:  
  - The maximum number of moves possible is `min(n, m)`.  
  - Players alternate turns, starting with Akshat.  
  - If `min(n, m)` is odd, Akshat makes the last move and wins.  
  - If `min(n, m)` is even, Malvika makes the last move and wins.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since the winner is determined directly using `min(n, m)`.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
