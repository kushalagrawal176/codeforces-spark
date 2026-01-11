# Problem Number - 1972B Coin Games  
**Problem Link:** [https://codeforces.com/problemset/problem/1972/B](https://codeforces.com/problemset/problem/1972/B)  

---

## Topics
- Strings  
- Implementation  
- Game Theory (parity observation)  

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n` ≤ 100  
- String consists of characters 'U' and 'D'  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The game string consists of coins represented by characters.  
- The character `'D'` is irrelevant for determining the winner, so we can remove all `'D'` characters.  
- After removing `'D'`, the outcome depends on the **parity of the remaining string length**:  
  - If the length is **odd**, the first player wins → `"YES"`.  
  - If the length is **even**, the second player wins → `"NO"`.  
- This is because the game reduces to alternating moves on the remaining coins, and parity decides the winner. 

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for scanning and removing characters.  
- **Space Complexity:** `O(1)`, only counters used.  