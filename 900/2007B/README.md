# Problem Number 2007B - Index and Maximum Value

**Problem Link:** [https://codeforces.com/problemset/problem/2007/B](https://codeforces.com/problemset/problem/2007/B)

---

## Topics
- Data Structures
- Greedy
- Implementation

## Constraints
- $1 \le t \le 2 \cdot 10^4$ (number of test cases)
- $1 \le n, m \le 10^5$ (length of the array and the number of operations)
- $1 \le a_i \le 10^9$ (array elements)
- Sum of $n, m$ over all test cases $\le 10^5$
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to perform range increment/decrement updates on an array and output the maximum element after each operation.
- Updating every element in the range $[l, r]$ for each query would be too slow ($O(n)$ per query), leading to a Time Limit Exceeded (TLE).
- However, we notice that we only need to track the **maximum element** of the array (`max_val`). 
- For each query:
  - If the current maximum value falls within the update range ($l \le max-val \le r$), then applying `+` will increase the maximum value by 1, and `-` will decrease it by 1.
  - If the current maximum value is outside the range $[l, r]$, the range update does not affect the maximum element, so it remains unchanged.
- Thus, each operation can be processed in $O(1)$ time.

## Time and Space Complexity
- **Time Complexity:** $O(n + m)$ per test case, where $n$ is the size of the array and $m$ is the number of operations. Finding the initial maximum takes $O(n)$, and each query is processed in $O(1)$.
- **Space Complexity:** $O(1)$ auxiliary space, as we only need to store the maximum value variables during processing.