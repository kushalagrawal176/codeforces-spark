# Problem Number - 1543A Exciting Bets  
**Problem Link:** [https://codeforces.com/problemset/problem/1543/A](https://codeforces.com/problemset/problem/1543/A)  

---

## Topics
- Number Theory  
- Implementation  
- Modular Arithmetic  

## Constraints
- 1 ≤ `t` ≤ 5000  
- 0 ≤ `a`, `b` ≤ 10¹⁸  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given two integers `a` and `b`.  
- The "excitement" is defined by the difference `c = |a - b|`.  
- If `a == b`, then the difference is 0 and no moves are needed → output `0 0`.  
- Otherwise:  
  - The first number to output is `c`.  
  - The second number is the minimum number of moves required to make `a` divisible by `c` (or equivalently, to align `a` and `b` modulo `c`).  
  - This is computed as `min(a % c, c - a % c)`.  
- This ensures the smallest adjustment to make the numbers align under the modulo system.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, only constant space used.  
