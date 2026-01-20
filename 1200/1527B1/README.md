# Problem Number - 1527B1 Palindrome Game (easy version)  
**Problem Link:** [https://codeforces.com/problemset/problem/1527/B1](https://codeforces.com/problemset/problem/1527/B1)  

---

## Topics
- Game Theory  
- Implementation  
- Strings  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 1000 (length of string)  
- String consists only of characters `'0'` and `'1'`.  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The game is played on a binary string where players can flip '0' to '1'.  
- The winner depends on the **number of zeros** in the string:  
  1. If there is exactly **one zero**, Bob wins (Alice cannot force a win).  
  2. If the number of zeros is **even**, Bob wins (he can mirror Alice’s moves).  
  3. If the number of zeros is **odd and greater than 1**, Alice wins (she can force Bob into losing positions).  
- Thus, the solution reduces to simply counting the zeros and applying these rules.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (counting zeros in the string).  
- **Space Complexity:** `O(1)`, only a counter variable is needed.  
