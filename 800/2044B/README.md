# Problem Number - 2044B Normal Problem  
**Problem Link:** [https://codeforces.com/problemset/problem/2044/B](https://codeforces.com/problemset/problem/2044/B)  

---

## Topics  
- Strings  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 100  
- 1 ≤ `|s|` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem provides a string consisting of characters `'p'`, `'q'` and `'w'`.  
- The task is to transform the string by:  
  1. Reversing the entire string.  
  2. Swapping each `'p'` with `'q'` and each `'q'` with `'p'`.  
- This effectively means that after reversing, every character is flipped to its opposite counterpart.  
- Example:  
  - Input: `"pqp"`  
  - Reverse: `"pqp"` → `"pqp"` (same in this case)  
  - Swap: `"pqp"` → `"qpq"`  
- The operations are straightforward and can be implemented with simple string manipulation.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we reverse and iterate through the string once.  
- **Space Complexity:** `O(1)`, aside from storing the string itself.  
