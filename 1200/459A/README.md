# Problem Number - 459A Pashmak and Garden

**Problem Link:** [https://codeforces.com/problemset/problem/459/A](https://codeforces.com/problemset/problem/459/A)

---

## Topics
- Geometry
- Implementation
- Math

## Constraints
- Coordinates are integers with `absolute value` ≤ 100
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to determine the coordinates of the other two vertices of a square, given two opposite vertices `(x1, y1)` and `(x2, y2)`.
- There are three possible cases:
  1. **Vertical alignment (x1 == x2):**  
     The given points lie on the same vertical line. The square can be formed by shifting horizontally by the side length `(y2 - y1)`.
  2. **Horizontal alignment (y1 == y2):**  
     The given points lie on the same horizontal line. The square can be formed by shifting vertically by the side length `(x2 - x1)`.
  3. **Diagonal alignment (|x2 - x1| == |y2 - y1|):**  
     The given points form a diagonal of the square. The other two vertices are `(x1, y2)` and `(x2, y1)`.
- If none of these conditions hold, it is impossible to form a square, and the answer is `-1`.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since we only perform a few arithmetic checks and calculations.
- **Space Complexity:** `O(1)`, as only constant extra space is used.
