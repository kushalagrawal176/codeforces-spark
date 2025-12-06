# Problem Number - 1814A Coins

**Problem Link:** [https://codeforces.com/problemset/problem/1814/A](https://codeforces.com/problemset/problem/1814/A)

---

## Topics
- Implementation  
- Math  
- Number Theory  

## Constraints
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `k` ≤ `n` ≤ 10^9  
- `k` ≠ 2
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to represent `n` as a sum of coins of denomination `2` and `k`.  
- Since we always have coins of denomination `2`, any number can be formed. However, the parity of `n` and `k` matters when considering combinations.  
- Key observations:
  - If `n` is odd and `k` is even, then using only `k`-coins cannot help in changing the parity, and we cannot form `n` exactly.  
  - In all other cases, it is possible to form `n`.  
- Thus, the solution is:
  - Print `"NO"` if `n` is odd and `k` is even.  
  - Print `"YES"` otherwise.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since the answer is computed directly using parity checks.  
- **Space Complexity:** `O(1)`, only constant space is used.  
