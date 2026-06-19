# Problem Number - 1238A Prime Subtraction

**Problem Link:** [https://codeforces.com/problemset/problem/1238/A](https://codeforces.com/problemset/problem/1238/A)

---

## Topics
- Number Theory
- Mathematics
- Implementation

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `b` < `a` ≤ 10¹⁸  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether the difference between two integers `a` and `b` can be expressed as a prime number greater than 1.  
- However, the key observation is simpler:  
  - If `a - b > 1`, then the difference is at least 2, which means it can potentially be prime.  
  - If `a - b = 1`, then the difference is exactly 1, which is **not prime**.  
- Therefore, the condition reduces to checking if `a - b > 1`.  
- If true, output `"YES"`. Otherwise, output `"NO"`.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only subtraction and comparison are performed.  
- **Space Complexity:** `O(1)`, no extra memory used.  
