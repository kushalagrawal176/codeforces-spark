# Problem Number - 1921A Square

**Problem Link:** [https://codeforces.com/problemset/problem/1921/A](https://codeforces.com/problemset/problem/1921/A)

---

## Topics
- Geometry  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 100
- -1000 ≤ `x[i]`, `y[i]` ≤ 1000
- Coordinates are integers within the range of standard 32-bit signed integers  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem provides four points that form the vertices of a square aligned with the coordinate axes.  
- To find the area of the square, we need the length of one side.  
- Since the square is axis-aligned, at least two points will share the same `x` coordinate, and two points will share the same `y` coordinate.  
- By checking which points share the same `x` coordinate with the first point, we can compute the vertical side length using the difference in their `y` coordinates.  
- The area of the square is simply the square of its side length:  `Area = (side length)^2`

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we only perform a few comparisons and arithmetic operations.  
- **Space Complexity:** `O(1)`, as we use only a constant amount of extra space.  
