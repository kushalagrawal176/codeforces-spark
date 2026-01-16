# Problem Number - 2004B Game with Doors  
**Problem Link:** [https://codeforces.com/problemset/problem/2004/B](https://codeforces.com/problemset/problem/2004/B)  

---

## Topics  
- Implementation  
- Math  
- Intervals  
- Simulation  

---

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `a` ≤ `b` ≤ 100 (first door interval)  
- 1 ≤ `c` ≤ `d` ≤ 100 (second door interval)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- You are given two doors represented by intervals `[a, b]` and `[c, d]`.  
- The task is to determine the minimum number of moves required to open both doors.  
- **Key observation:**  
  - If the intervals overlap, the number of moves is equal to the size of the overlap plus possible adjustments at the boundaries.  
  - If the intervals do not overlap, at least one move is required to connect them.  
- Steps:  
  1. Compute the overlap length: `overlap = min(b, d) - max(a, c)`.  
  2. If `overlap < 0`, the intervals are disjoint → answer is `1`.  
  3. Otherwise, start with `overlap`.  
     - If `a != c`, add `1` (adjust left boundary).  
     - If `b != d`, add `1` (adjust right boundary).  
  4. Print the result.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only simple arithmetic and comparisons are performed.  
- **Space Complexity:** `O(1)`, no extra space used.  
