# Problem Number - 1807A Plus or Minus  
**Problem Link:** [https://codeforces.com/problemset/problem/1807/A](https://codeforces.com/problemset/problem/1807/A)  

---

## Topics
- Implementation  
- Conditional Logic  

## Constraints
- 1 ≤ `t` ≤ 162 (number of test cases)  
- 1 ≤ `a`, `b` ≤ 9  
- -8 ≤ `c` ≤ 18  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives three integers `a`, `b`, and `c`.  
- We need to determine whether `c` is equal to `a + b` or `a - b`.  
- Approach:  
  1. For each test case, read integers `a`, `b`, and `c`.  
  2. If `a + b == c`, output `"+"`.  
  3. Otherwise, output `"-"`.  
- This works because the problem guarantees that `c` will be either the sum or the difference of `a` and `b`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a constant number of operations are performed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
