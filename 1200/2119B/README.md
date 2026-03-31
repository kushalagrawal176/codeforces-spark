# Problem Number - 2119B Line Segments  
**Problem Link:** [https://codeforces.com/problemset/problem/2119/B](https://codeforces.com/problemset/problem/2119/B)  

---

## Topics
- Geometry  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 1000  
- 1 ≤ `px`, `py`, `qx`, `qy` ≤ 10⁷  
- 1 ≤ `a[i]` ≤ 10⁴  
- Time limit per test: 1.5 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether a set of line segments can form a polygon.  
- A necessary and sufficient condition for forming a polygon is that the longest segment length must be **less than or equal to the sum of the other segments**.  
- Initially, we compute the Euclidean distance between two given points `(px, py)` and `(qx, qy)` — this is treated as one segment.  
- Then we read `n` additional segment lengths.  
- We track:
  - `mx`: the maximum segment length encountered.  
  - `sum`: the total sum of all segment lengths.  
- Finally, we check the condition:  
  - If `mx <= sum - mx`, output `"Yes"` (polygon possible).  
  - Otherwise, output `"No"`.  

This leverages the polygon inequality theorem, which generalizes the triangle inequality to multiple sides.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through all segments once.  
- **Space Complexity:** `O(1)`, only constant extra space is used for variables.  
