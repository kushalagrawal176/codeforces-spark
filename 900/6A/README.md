# Problem Number - 6A Triangle

**Problem Link:** [https://codeforces.com/problemset/problem/6/A](https://codeforces.com/problemset/problem/6/A)

---

## Topics
- Geometry
- Implementation
- Sorting

## Constraints
- Length of segments are positive integers.
- Time limit per test: 2.0 seconds
- Memory limit per test: 64 megabytes

## Intuition / Approach
- The problem provides 4 stick lengths, and we need to determine if we can choose 3 sticks to form a **TRIANGLE** (strictly positive area), a **SEGMENT** (degenerate triangle where the sum of two sides equals the third), or if it is **IMPOSSIBLE** to form either.
- First, read the 4 stick lengths and store them in an array.
- Sort the array in ascending order. Having the lengths sorted makes it easy to check the triangle inequality theorem for any triplet of sticks.
- Check for a non-degenerate triangle using the combinations of the smallest/middle sticks and middle/largest sticks:
  - `a[0] + a[1] > a[2]` or `a[1] + a[2] > a[3]`
- If that fails, check for a degenerate triangle (segment):
  - `a[0] + a[1] == a[2]` or `a[1] + a[2] == a[3]`
- If neither condition is met, output `IMPOSSIBLE`.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ or $O(N log N)$ where N = 4 (sorting a fixed-size array of 4 elements takes constant time).
- **Space Complexity:** $O(1)$, only a fixed-size array of 4 elements is used.