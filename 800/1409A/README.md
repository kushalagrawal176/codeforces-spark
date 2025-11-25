# Problem Number - 1409A Yet Another Two Integers Problem  
**Problem Link:** [https://codeforces.com/problemset/problem/1409/A](https://codeforces.com/problemset/problem/1409/A)  

---

## Topics
- Implementation  
- Math  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 2*10^4 (number of test cases)  
- 1 ≤ `a`, `b` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine the minimum number of moves required to make two integers `a` and `b` equal.  
- In one move, we can add or subtract any integer between 1 and 10 to one of the numbers.  
- Therefore, the number of moves depends on the **absolute difference** between `a` and `b`.  
- Steps:  
  1. Compute `diff = |a - b|`.  
  2. Divide `diff` by 10 to get the number of full moves.  
  3. If there is a remainder (`diff % 10 != 0`), add 1 extra move to cover the leftover difference.  
- Example:  
  - If `a = 25` and `b = 8`, then `diff = 17`.  
  - `17 / 10 = 1` full move, remainder = 7 → total moves = 2.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
