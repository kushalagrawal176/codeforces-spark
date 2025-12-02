# Problem Number - 1360A Minimal Square
**Problem Link:** [https://codeforces.com/problemset/problem/1360/A](https://codeforces.com/problemset/problem/1360/A)

---

## Topics
- Implementation
- Geometry
- Math

## Constraints
- 1 ≤ `t` ≤ 10000  
- 1 ≤ `a`, `b` ≤ 100  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the smallest possible square that can fit a rectangle of sides `a` and `b`.
- To fit the rectangle into a square:
  - The square’s side must be at least as long as the longer side (`max(a, b)`).
  - But since the rectangle can be rotated, the square’s side must also be at least `2 * min(a, b)` (to fit both sides when placed side by side).
- Therefore, the required square side length is `s = max(max(a, b), 2 * min(a, b))`.
- The answer is simply the area of this square: `s × s`.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since each test case is solved in constant time.  
- **Space Complexity:** `O(1)`, only a few variables are used per test case.
