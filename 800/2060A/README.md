# Problem Number - 2060A Fibonacciness  
**Problem Link:** [https://codeforces.com/problemset/problem/2060/A](https://codeforces.com/problemset/problem/2060/A)  

---

## Topics  
- Implementation  
- Math  
- Conditions  

## Constraints  
- 1 ≤ `t` ≤ 500  
- 1 ≤ `a`, `b`, `c`, `d` ≤ 100  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem provides four integers `a, b, c, d` for each test case.  
- We need to check certain equalities among expressions involving these numbers:  
  - `a + b`  
  - `c - b`  
  - `d - c`  
- If all three expressions are equal, the answer is `3`.  
- If any two of them are equal, the answer is `2`.  
- Otherwise, the answer is `1`.  
- This boils down to simple conditional checks comparing the three values.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only a few comparisons are made.  
- **Space Complexity:** `O(1)`, as only a few variables are used.  