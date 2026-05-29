# Problem Number - 1362A Johnny and Ancient Computer

**Problem Link:** [https://codeforces.com/problemset/problem/1362/A](https://codeforces.com/problemset/problem/1362/A)

---

## Topics
- Implementation
- Math
- Greedy

---

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `a`, `b` ≤ 10¹⁸  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks how many operations are needed to make two numbers equal, where each operation allows multiplying the smaller number by 2, 4, or 8.
- First, ensure `a ≤ b` by swapping if necessary.
- If `b` is not divisible by `a`, then it’s impossible to make them equal → output `-1`.
- Otherwise, compute the ratio `b / a`.  
  - This ratio must be a power of 2 (since only multiplying by 2, 4, or 8 is allowed).  
  - If not a power of 2, output `-1`.
- Count how many times we need to multiply by 2 to reach `b`.  
  - Example: if ratio = 16, then 4 doublings are needed.  
- Since one operation can cover up to 3 doublings (multiplying by 8), the minimum number of operations is `(cnt + 2) / 3`.

---

## Time and Space Complexity
- **Time Complexity:** `O(log(b/a))`, since we repeatedly double until reaching `b`.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  