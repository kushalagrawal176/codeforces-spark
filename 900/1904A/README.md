# Problem Number - 1904A Forked!  
**Problem Link:** [https://codeforces.com/problemset/problem/1904/A](https://codeforces.com/problemset/problem/1904/A)  
---

## Topics
- Implementation  
- Geometry  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `a`, `b` ≤ 10⁸  
- 0 ≤ `c`, `d`, `e`, `f` ≤ 10⁸  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem generalizes the knight’s move in chess: instead of fixed `(2,1)` moves, the knight can move `(a,b)` in any direction.  
- From a starting position `(c, d)`, we want to know how many distinct ways two moves can land exactly at `(e, f)`.  
- First, generate all 8 possible moves of the generalized knight: `(±a, ±b)` and `(±b, ±a)`.  
- Then, simulate two consecutive moves by combining every pair of moves.  
- If the resulting position equals `(e, f)`, increment the count.  
- Special case: when `a == b`, the move set has duplicates due to symmetry, so the answer must be divided by 4 to avoid overcounting.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we only check `8 × 8 = 64` possible move pairs.  
- **Space Complexity:** `O(1)`, only constant space used for storing moves.  
