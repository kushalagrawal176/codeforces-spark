# Problem Number - 1829E The Lakes

**Problem Link:** [https://codeforces.com/problemset/problem/1829/E](https://codeforces.com/problemset/problem/1829/E)

---

## Topics
- Graphs
- Depth-First Search (DFS) / Breadth-First Search (BFS)
- Implementation
- Flood Fill

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n, m \le 1000$
- $0 \le a_{i,j} \le 1000$
- The sum of $n \times m$ over all test cases does not exceed $10^6$.
- Time limit per test: 3 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the maximum volume of a lake in a given $n \times m$ grid. 
- A lake is defined as a connected component of cells with positive depth (values greater than 0) that are adjacent horizontally or vertically.
- The volume of a lake is the sum of the depths of all cells belonging to that connected component.
- We can traverse the grid cell by cell. Whenever we encounter an unvisited cell with a depth greater than 0, we can use **DFS** or **BFS** (Flood Fill algorithm) to explore the entire connected component, summing up the values of all the cells in that lake.
- We keep track of the maximum volume found across all lakes in the grid.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n \times m)$ per testcase, since every cell is visited and processed at most once during the traversal.
- **Space Complexity:** $\mathcal{O}(n \times m)$ in the worst case for the visited array/matrix and the recursion stack space used by DFS.