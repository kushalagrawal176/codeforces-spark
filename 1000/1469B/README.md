# Problem Number - 1469B Red and Blue

**Problem Link:** [https://codeforces.com/problemset/problem/1469/B](https://codeforces.com/problemset/problem/1469/B)

---

## Topics
- Greedy
- DP / Prefix Sums
- Two Pointers

## Constraints
- $1 \le t \le 1000$ (Number of test cases)
- $1 \le n, m \le 100$
- $-100 \le r_i, b_i \le 100$
- Time limit per test: 2.0 seconds
- Memory limit per test: 512 megabytes

## Intuition / Approach
- The problem requires us to merge two arrays, $R$ (red) and $B$ (blue), into a single array $C$ such that the relative order of elements from both arrays is preserved, and the maximum prefix sum of $C$ is maximized.
- Since the elements of $R$ and $B$ can be interleaved arbitrarily without shifting their internal relative order, the choice to include a prefix of $R$ is completely independent of the choice to include a prefix of $B$.
- To get the maximum possible prefix sum of the combined array $C$, we can **greedily** find the **maximum prefix sum** achievable by array $R$ alone (or 0 if all prefix sums are negative) and add it to the maximum prefix sum achievable by array $B$ alone (or 0 if negative). 
- Thus, the problem reduces to finding:
$$\max(0, \max(\text{prefix sums of } R)) + \max(0, \max(\text{prefix sums of } B))$$

## Time and Space Complexity
- **Time Complexity:** $O(n + m)$ per test case, as we only need a single pass through both arrays to compute their maximum prefix sums.
- **Space Complexity:** $O(1)$ auxiliary space if we track the running prefix sum on the fly without storing the arrays.