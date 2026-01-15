# Problem Number - 1999B Card Game  

**Problem Link:** [https://codeforces.com/problemset/problem/1999/B](https://codeforces.com/problemset/problem/1999/B)  

---

## Topics  
- Implementation  
- Brute Force  
- Game Theory  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `a`, `b`, `c`, `d` ≤ 10 (card values)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- Each player has two cards: Player 1 has `(a, b)` and Player 2 has `(c, d)`.  
- The game compares possible matchups between Player 1’s cards and Player 2’s cards.  
- Player 1 wins a matchup if their chosen card is greater than or equal to Player 2’s chosen card, while the other card is strictly greater (or vice versa).  
- There are two possible pairings to check:  
  1. `(a, b)` vs `(c, d)`  
  2. `(a, b)` vs `(d, c)`  
- For each winning pairing, increment the counter.  
- The final answer is `ans * 2`, since each winning scenario contributes 2 points.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case (constant comparisons). 
- **Space Complexity:** `O(1)`, only a few integer variables are used.  
