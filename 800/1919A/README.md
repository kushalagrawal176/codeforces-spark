# Problem Number - 1919A Wallet Exchange  
**Problem Link:** [https://codeforces.com/problemset/problem/1919/A](https://codeforces.com/problemset/problem/1919/A)  
---

## Topics
- Implementation  
- Math  
- Parity / Even-Odd  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `a`, `b` ≤ 10^9 (wallet values)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks who will win the wallet exchange game between Alice and Bob.  
- The rule is based on the parity of the difference between the two wallet values.  
- Compute `abs(a - b) + 1`.  
  - If this value is even, Alice wins.  
  - If this value is odd, Bob wins.  
- This works because the game alternates moves, and the parity determines who gets the last move.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic and parity checks are performed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
