# Problem Number - 2119A Add or XOR  

**Problem Link:** [https://codeforces.com/problemset/problem/2119/A](https://codeforces.com/problemset/problem/2119/A)  

---

## Topics
- Bit Manipulation
- Greedy
- Math

---

## Constraints
- 1 ≤ `t` ≤ 10⁴
- 1 ≤ `a`, `b` ≤ 100 
- 1 ≤ `x`, `y` ≤ 10⁷  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem revolves around transforming integer `a` into integer `b` using two possible operations:  
  1. **Add operation**: increment by 1 at cost `x`.  
  2. **XOR operation**: apply `a ^ 1` at cost `y`.  

- **Case 1: a > b**  
  - The only way to reach `b` is by applying XOR once.  
  - If `(a ^ 1) == b`, the cost is `y`. Otherwise, it’s impossible (`-1`).  

- **Case 2: a ≤ b**  
  - We can reach `b` by repeatedly adding 1.  
  - Let `c0 = b - a` → number of increments needed.  
  - Let `c1 = ((b + 1) / 2) - ((a + 1) / 2)` → number of times XOR can be beneficial.  
  - If `y > x`, XOR is too expensive, so just use additions: `c0 * x`.  
  - Otherwise, mix additions and XOR: `(c0 - c1) * x + c1 * y`.  

- This greedy approach ensures minimal cost by balancing between cheaper additions and XOR operations.  

---

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since calculations are direct.  
- **Space Complexity:** `O(1)`, only constant variables are used.  