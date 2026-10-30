# Problem Number - 1795B Ideal Point

**Problem Link:** [https://codeforces.com/problemset/problem/1795/B](https://codeforces.com/problemset/problem/1795/B)

---

## Topics
- Implementation
- Data Structures
- Greedy

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- $1 \le n \le 50$ (number of segments)
- $1 \le k \le 50$ (the target point)
- $1 \le l_i \le r_i \le 50$ for each segment $[l_i, r_i]$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether point $k$ can be the **ideal point**, meaning it has the maximum frequency of coverage among all points, and *strictly* greater frequency than any other point.
- A point's frequency is the number of given segments that cover it.
- For $k$ to be the unique ideal point, we must ensure that no other point can tie or exceed its frequency. 
- In particular, if there is a segment that starts at $k$ ($l_i = k$) and another segment that ends at $k$ ($r_i = k$), then point $k$ is covered by both. If we shrink or shift the segments, $k$ is the anchor point. 
- More simply, $k$ can be the ideal point if and only if at least one segment starts at $k$ and at least one segment ends at $k$. If both conditions are met, we can always construct a configuration where $k$ is the sole point with the maximum frequency.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per testcase, as we iterate through all $n$ segments to check if any segment starts or ends at $k$.
- **Space Complexity:** $O(1)$, since we only use a few variables to track whether such segments exist.