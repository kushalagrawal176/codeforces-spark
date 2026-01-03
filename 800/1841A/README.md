# Problem Number - 1841A Game with Board  
**Problem Link:** [https://codeforces.com/problemset/problem/1841/A](https://codeforces.com/problemset/problem/1841/A)  

---

## Topics  
- Implementation  
- Game Theory  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 99  
- 2 ≤ `n` ≤ 100  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach  
- The game is defined with two players: Alice and Bob.  
- The rules imply that for small board sizes (`n = 2, 3, 4`), Bob has a winning strategy.  
- For all other values of `n` (i.e., `n ≥ 5`), Alice can always secure a win.  
- Thus, the solution reduces to a simple conditional check:  
  - If `n` is 2, 3, or 4 → Bob wins.  
  - Otherwise → Alice wins.  
- This is a direct application of game theory reasoning, but the implementation is straightforward.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only a constant-time check is performed.  
- **Space Complexity:** `O(1)`, no extra memory is required.  
