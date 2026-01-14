# Problem Number - 1521A Nastia and Nearly Good Numbers  
**Problem Link:** [https://codeforces.com/problemset/problem/1521/A](https://codeforces.com/problemset/problem/1521/A)  

---

## Topics
- Math  
- Number Theory
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `a`, `b` ≤ 10⁶  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks to construct three distinct integers `x, y, z` such that:  
  - All are multiples of `a`.  
  - `y` is divisible by `x`.  
  - `z` is not divisible by `y`.  
- Key observation:  
  - If `b = 1`, it is impossible to construct such numbers, so output `"NO"`.  
  - Otherwise, we can always construct:  
    - `x = a`  
    - `y = a × b`  
    - `z = a × (b + 1)`  
  - Here, `y` is divisible by `x`, but `z` is not divisible by `y`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, no extra space required.  
