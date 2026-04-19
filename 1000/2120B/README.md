# Problem Number - 2120B Square Pool

**Problem Link:** [https://codeforces.com/problemset/problem/2120/B](https://codeforces.com/problemset/problem/2120/B)

---

## Topics
- Geometry
- Simulation
- Math
- Implementation

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)
- 1 ≤ `n` ≤ 1000 (balls per test case, total sum ≤ 1000)
- 2 ≤ `s` ≤ 10⁹ (side length of the square pool table)
- Ball positions: 0 < `xi`, `yi` < `s` (strictly inside the table, not on edges or corners)
- Directions: `dx`, `dy` ∈ {−1, 1}
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The pool table is a square of side `s` with pockets at the four corners: (0,0), (0,s), (s,0), (s,s).
- Each ball starts at an integer coordinate `(xi, yi)` and moves diagonally at 45° with direction `(dx, dy)`.
- Because collisions are elastic and the table is square, the ball’s trajectory is equivalent to reflecting the table infinitely in both directions. This transforms the problem into checking whether the ball’s path intersects a pocket in this extended grid.
- A ball is potted if its trajectory eventually reaches a corner. Mathematically, this reduces to checking whether: $|dx \cdot xi - dy \cdot yi| = 0 \text{ or } s$

- This condition ensures the ball’s diagonal path aligns with a corner pocket after reflections.
- For each ball, compute this condition and count how many satisfy it.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we check each ball individually.
- **Space Complexity:** `O(1)`, only counters and temporary variables are used.