# Problem Number - 1844A Subtraction Game  
**Problem Link:** [https://codeforces.com/problemset/problem/1844/A](https://codeforces.com/problemset/problem/1844/A)  

---

## Topics  
- Implementation  
- Math  
- Game Theory (basic)  

## Constraints  
- 1 ≤ `t` ≤ 100  
- 1 ≤ `a`, `b` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem is simplified to a direct observation:  
  - Given two integers `a` and `b`, the winning move is simply their sum.  
  - There is no complex game simulation required; the statement reduces to outputting `a + b`.  
- Thus, for each test case:  
  - Read integers `a` and `b`.  
  - Print their sum.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only one addition operation is performed.  
- **Space Complexity:** `O(1)`, no extra memory is required.  
