# Problem Number - 1311A Add Odd or Subtract Even  
**Problem Link:** [https://codeforces.com/problemset/problem/1311/A](https://codeforces.com/problemset/problem/1311/A)  

---

## Topics
- Implementation
- Math
- Parity

---

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `a`, `b` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks for the minimum number of operations to make integer `a` equal to integer `b`.  
- Allowed operations:  
  - Add an **odd** number to `a`.  
  - Subtract an **even** number from `a`.  
- Key observation:  
  - If `a == b`, no operations are needed.  
  - If `a < b`, we need to increase `a`. Adding an odd number changes parity, so:  
    - If `a` and `b` have different parity → 1 operation.  
    - If they have the same parity → 2 operations.  
  - If `a > b`, we need to decrease `a`. Subtracting an even number keeps parity, so:  
    - If `a` and `b` have the same parity → 1 operation.  
    - If they have different parity → 2 operations.  

Thus, the solution boils down to comparing parity and relative size of `a` and `b`.

---

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only parity and comparison checks are performed.  
- **Space Complexity:** `O(1)`, no extra space required.  
