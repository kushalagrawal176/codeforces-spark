# Problem Number - 1373B 01 Game  
**Problem Link:** [https://codeforces.com/problemset/problem/1373/B](https://codeforces.com/problemset/problem/1373/B)  

---

## Topics
- Strings  
- Game Theory  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `|s|` ≤ 100 (length of the string)  
- Each string consists only of characters `'0'` and `'1'`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The game is played by two players who alternately remove one `'0'` and one `'1'` from the string.  
- The game ends when no such pair can be removed.  
- The winner is determined by the parity of the number of moves:  
  - If the number of moves is **odd**, the first player (Alice) wins → output `"DA"`.  
  - If the number of moves is **even**, the second player (Bob) wins → output `"NET"`.  
- Since each move removes one `'0'` and one `'1'`, the total number of moves is simply `min(count0, count1)`.  
- Therefore:  
  - If `min(count0, count1)` is odd → `"DA"`  
  - If `min(count0, count1)` is even → `"NET"`  

## Time and Space Complexity
- **Time Complexity:** `O(|s|)` per test case, since we count the number of `'0'` and `'1'`.  
- **Space Complexity:** `O(1)`, only counters are used.  
