# Problem Number - 2026A Perpendicular Segments  

**Problem Link:** [https://codeforces.com/problemset/problem/2026/A](https://codeforces.com/problemset/problem/2026/A)  
---

## Topics
- Geometry  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 5000  
- 1 ≤ `x`, `y` ≤ 1000  
- 1 ≤ `k` ≤ 1414
- The values of `x`, `y` and `k` are choosen in such a way that answer exists  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to construct two perpendicular segments inside a rectangle of dimensions `x` by `y`.  
- A simple way to guarantee perpendicularity is to place one segment along the diagonal from `(0,0)` to `(num,num)` and another from `(num,0)` to `(0,num)`.  
- Here, `num = min(x, y)` ensures both segments fit inside the rectangle regardless of its dimensions.  
- This construction always works because:
  - Both segments lie within the rectangle boundaries.  
  - They intersect at a right angle.  
- The value of `k` is irrelevant to the construction, so it can be ignored.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we only compute `min(x, y)` and print two lines.  
- **Space Complexity:** `O(1)`, no extra memory used.  