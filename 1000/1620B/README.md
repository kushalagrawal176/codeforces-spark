# Problem Number - 1620B Triangles on a Rectangle

**Problem Link:** [https://codeforces.com/problemset/problem/1620/B](https://codeforces.com/problemset/problem/1620/B)

---

## Topics
- Geometry
- Greedy
- Math

## Constraints
- $1 \le t \le 10^4$ (Number of test cases)
- $3 \le w, h \le 10^6$ (Width and height of the rectangle)
- For each side, the number of points $k$ satisfies $2 \le k \le 2 \cdot 10^5$
- The total sum of $k$ over all test cases does not exceed $2 \cdot 10^5$
- Coordinate values are strictly increasing integers between $0$ and $w$ or $h$
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The area of a triangle is given by the formula: 
  $$\text{Area} = \frac{1}{2} \times \text{base} \times \text{height}$$
- The problem asks us to find the maximum value of $2 \times \text{Area}$, which simplifies the formula to just:
  $$2 \times \text{Area} = \text{base} \times \text{height}$$
- To maximize the area, we must choose two points on the exact same edge of the rectangle to serve as the **base**, and any point on the opposite parallel edge to establish the **height**.
- Since the input coordinates for each edge are already provided in strictly increasing order, the maximum possible base on any given edge is simply the distance between its last point and its first point: `a[q-1] - a[0]`.
- The maximum height from that base is fixed by the rectangle's dimensions:
  - For horizontal edges (parallel to the x-axis), the maximum height to the opposite side is $h$.
  - For vertical edges (parallel to the y-axis), the maximum height to the opposite side is $w$.
- We loop through all 4 sides, calculate the max potential area for each side (`base * height`), and track the global maximum. `long long` integers are required to prevent integer overflow when multiplying the base and height.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(\sum q) \approx \mathcal{O}(N)$ where $N$ is the total number of points across all test cases. We read each coordinate exactly once.
- **Space Complexity:** $\mathcal{O}(1)$ auxiliary space if we only track the first and last elements during input stream parsing, or $\mathcal{O}(q)$ per query if using a vector to store the coordinates of the current side.