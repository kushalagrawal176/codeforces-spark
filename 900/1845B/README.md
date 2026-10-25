# Problem Number - 1845B Come Together

**Problem Link:** [https://codeforces.com/problemset/problem/1845/B](https://codeforces.com/problemset/problem/1845/B)

---

## Topics
- Geometry
- Math
- Implementation

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- Coordinates range: $1 \le x, y \le 10^8$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the maximum number of steps that persons $B$ and $C$ can walk together starting from their respective starting points towards person $A$, or more accurately, the number of grid cells that lie on both a shortest path from $A$ to $B$ and a shortest path from $A$ to $C$.
- A shortest path from point $A(x_a, y_a)$ to point $B(x_b, y_b)$ only moves in the directions that reduce both the horizontal and vertical distances between them. Thus, the path shares steps as long as both $B$ and $C$ are in the same relative direction (left/right and up/down) relative to $A$.
- We can analyze the horizontal and vertical axes independently:
  - For the X-axis, if both $B$ and $C$ are to the right of $A$ ($x_a < x_b$ and $x_a < x_c$), they will overlap for $\min(x_b, x_c) - x_a$ steps. If both are to the left ($x_a > x_b$ and $x_a > x_c$), they overlap for $x_a - \max(x_b, x_c)$ steps. Otherwise, they move in opposite directions right away, sharing 0 horizontal steps.
  - Similarly, perform the same check for the Y-axis.
- The total shared steps will be $1$ (for the starting point $A$ itself) plus the shared horizontal steps plus the shared vertical steps.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, as it only involves basic arithmetic and comparisons.
- **Space Complexity:** $O(1)$, only constant space used for variables.