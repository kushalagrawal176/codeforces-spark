# Problem Number - 2033B Sakurako and Water

**Problem Link:** [https://codeforces.com/problemset/problem/2033/B](https://codeforces.com/problemset/problem/2033/B)

---

## Topics
- Implementation
- Data Structures
- Matrices

## Constraints
- 1 ≤ `t` ≤ 200
- 1 ≤ `n` ≤ 500
- -$10^5$ ≤ `a[i][j]` ≤ $10^5$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem involves a square matrix where we can increase the values of elements along any main diagonal (top-left to bottom-right) by 1 in a single operation. We want to make all elements non-negative with the minimum number of operations.
- For any negative element at position $(i, j)$, its value must be increased to at least 0. Raising the entire diagonal associated with $(i, j)$ is the most efficient way to handle negative numbers in that specific diagonal.
- The minimum operations needed for a particular diagonal are determined by the absolute value of the most negative element on that diagonal (i.e., its minimum value).
- We can iterate through each element in the matrix. If an element is negative, we traverse its entire diagonal, find the minimum value (most negative), zero out the diagonal elements, and add the absolute value of that minimum to our total operation count.

## Time and Space Complexity
- **Time Complexity:** $O(n^2)$, since each element in the n × n matrix is visited and processed a constant number of times.
- **Space Complexity:** $O(n^2)$, to store the matrix elements.