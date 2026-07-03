# Problem Number - 1401A Distance and Axis  

**Problem Link:** [https://codeforces.com/problemset/problem/1401/A](https://codeforces.com/problemset/problem/1401/A)  

---

## Topics
- Math 
- Parity 
- Implementation  

---

## Constraints
- 1 ≤ `t` ≤ 6000  
- 0 ≤ `n`, `k` ≤ 10⁶ 
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to find the minimum number of moves required to make the distance between a point at coordinate `n` and the axis equal to `k`.  
- **Case 1: n ≥ k**  
  - If `(n + k)` is even, the distance can already be achieved → answer is `0`.  
  - If `(n + k)` is odd, we need one extra move to adjust parity → answer is `1`.  
- **Case 2: n < k**  
  - We must move forward until reaching `k`. The minimum moves required are simply `(k - n)`.  

This logic ensures we always reach the required distance with the least number of moves.  

---

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only simple arithmetic and parity checks are performed.  
- **Space Complexity:** `O(1)`, no extra memory used.  