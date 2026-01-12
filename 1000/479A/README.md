# Problem Number - 479A Expression  
**Problem Link:** [https://codeforces.com/problemset/problem/479/A](https://codeforces.com/problemset/problem/479/A)  

---

## Topics  
- Math  
- Implementation  
- Brute Force  

## Constraints  
- 1 ≤ `a`, `b`, `c` ≤ 10  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks for the maximum value obtainable by inserting parentheses and operators between three integers `a`, `b`, and `c`.  
- Since the range of values is small, we can brute force all possible valid expressions.  
- Possible expressions include:  
  - `a + b + c`  
  - `a * b * c`  
  - `(a + b) * c`  
  - `a * (b + c)`  
  - `a + b * c`  
  - `a * b + c`  
- Evaluate each expression and take the maximum.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since only a fixed number of expressions are evaluated.  
- **Space Complexity:** `O(1)`, no extra space required.  
