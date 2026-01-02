# Problem Number - 1549B Gregor and the Pawn Game  
**Problem Link:** [https://codeforces.com/problemset/problem/1549/B](https://codeforces.com/problemset/problem/1549/B)  
---
## Topics
- Implementation  
- Strings  
- Greedy  
- DFS 
- DP

## Constraints
- 1 ≤ `t` ≤ 2 ⋅ 10⁴  
- 2 ≤ `n` ≤ 2 ⋅ 10⁵  
- Strings `a` and `b` of length `n`, consisting only of characters '0' and '1'  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Gregor has pawns represented by string `b`, and the opponent has pawns represented by string `a`.  
- Gregor’s pawns (`b[i] == '1'`) can capture in three ways:
  1. If the opponent’s cell `a[i]` is empty (`'0'`), Gregor’s pawn occupies it.  
  2. If the left cell (`a[i-1]`) has an opponent pawn (`'1'`), Gregor captures it.  
  3. If the right cell (`a[i+1]`) has an opponent pawn (`'1'`), Gregor captures it.  
- To avoid double counting, once a pawn in `a` is captured, mark it as used (e.g., `'2'`).  
- Iterate through all positions and apply the rules greedily.  
- The total captures (`cnt`) is the answer for each test case.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(n)`, for storing the mutable copy of string `a`.  
