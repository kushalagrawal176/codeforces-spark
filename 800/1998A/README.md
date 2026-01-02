# Problem Number - 1998A Find K Distinct Points with Fixed Center  
**Problem Link:** [https://codeforces.com/problemset/problem/1998/A](https://codeforces.com/problemset/problem/1998/A)  
---
## Topics
- Implementation  
- Geometry  
- Constructive Algorithms  

## Constraints
- 1 ≤ `t` ≤ 100 
- -100 ≤ `xc`, `yc` ≤ 100  
- 1 ≤ `k` ≤ 1000  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are asked to find `k` distinct integer-coordinate points such that the center `(xc, yc)` is fixed.  
- If `k = 1`, the only valid point is the center itself.  
- For `k > 1`, we can construct points symmetrically around the center along the diagonal line:  
  - Print `(xc - i, yc - i)` for `i = 1` to `k/2`.  
  - Print `(xc + i, yc + i)` for `i = 1` to `k/2`.  
  - If `k` is odd, also include the center `(xc, yc)`.  
- This guarantees exactly `k` distinct points, all symmetric around the center.  

## Time and Space Complexity
- **Time Complexity:** `O(k)`, since we generate exactly `k` points.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
