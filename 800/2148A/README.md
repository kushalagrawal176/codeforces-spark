# Problem Number - 2148A Sublime Sequence

**Problem Link:** [https://codeforces.com/problemset/problem/2148/A](https://codeforces.com/problemset/problem/2148/A)

---

## Topics
- Implementation  
- Math  
- Hashing  

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `x`, `n` ≤ 10  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine the sum of all integers in the sequence. 
- The sequence is constructed by alternating `x` and `-x`. 
- Rule:
  - If `n` is **even**, the sum is `0`.  
  - If `n` is **odd**, the sum is `x`.  
- Key observation:
  - The parity of `n` (whether it is odd or even) completely determines the output.  
  - This can be checked efficiently using bitwise operation `(n & 1)`.  
- Steps:
  1. Read `t` test cases.  
  2. For each test case, read `x` and `n`.  
  3. If `n` is even, print `0`.  
  4. Otherwise, print `x`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a parity check is performed.  
- **Space Complexity:** `O(1)`, no extra space is required.  
