# Problem Number - 2000A Primary Task

**Problem Link:** [https://codeforces.com/problemset/problem/2000/A](https://codeforces.com/problemset/problem/2000/A)

---

## Topics
- Implementation  
- Math  
- Conditions  

## Constraints
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `a` ≤ 10^4  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether the given integer `a` can be considered valid according to specific rules.  
- A number is valid if it lies strictly between:
  - 101 and 110, or  
  - 1009 and 1100.  
- These ranges represent numbers that are close to "round" values (like 100, 110, 1000, 1100) but not equal to them.  
- Steps:
  1. Read the integer `a`.  
  2. Check if `(a > 101 && a < 110)` or `(a > 1009 && a < 1100)`.  
  3. If true, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only simple comparisons are performed.  
- **Space Complexity:** `O(1)`, no extra space is required.  
