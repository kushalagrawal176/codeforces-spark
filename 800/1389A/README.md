# Problem Number - 1389A LCM Problem  
**Problem Link:** [https://codeforces.com/problemset/problem/1389/A](https://codeforces.com/problemset/problem/1389/A)  

---

## Topics  
- Number Theory  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 10000  
- 1 ≤ `a` < `b` ≤ 10^9  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to find two integers `x` and `y` such that:  
  - `a ≤ x < y ≤ b`  
  - `y` is divisible by `x`.  
- The simplest choice is to take `x = a` and `y = 2a`.  
- This works if `2a ≤ b`, because then both numbers lie within the given range and `y` is divisible by `x`.  
- If `2a > b`, it is impossible to find such a pair, so the answer is `-1 -1`.  
- Steps:  
  1. Read integers `a` and `b`.  
  2. Check if `2a ≤ b`.  
     - If true, output `a` and `2a`.  
     - Otherwise, output `-1 -1`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only a constant number of operations are performed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
