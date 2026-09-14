# Problem Number - 1183B Equalize Prices

**Problem Link:** [https://codeforces.com/problemset/problem/1183/B](https://codeforces.com/problemset/problem/1183/B)

---

## Topics
- Greedy
- Sorting

## Constraints
- $1 ≤ t ≤ 100$ (Number of test cases)
- $1 ≤ n ≤ 100$ (Number of elements)
- $1 ≤ k ≤ 10^8$ (Maximum absolute difference allowed)
- $1 ≤ a_i ≤ 10^8$ (Elements of the array)
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array of prices and a maximum allowed difference $k$. We want to find a single target price $B$ such that for every element $a_i$ in the array, $|a_i - B| \le k$ holds true. We need to maximize $B$.
- If we sort the array, the minimum element is $a[0]$ and the maximum element is $a[n-1]$.
- To make every element fall within a range of $k$ from our target price $B$, the highest possible price we can pick without violating the condition for the minimum element is $a[0] + k$.
- After choosing $B = a[0] + k$, we must check if the maximum element $a[n-1]$ can also be adjusted to $B$. This requires that the distance between the maximum element and our target price is also within $k$, i.e., $a[n-1] - (a[0] + k) \le k$, which simplifies to $a[n-1] - k \le a[0] + k$.
- If this condition fails, it is impossible to find a common price $B$, so we output `-1`. Otherwise, the maximum valid target price is `a[0] + k`.

## Time and Space Complexity
- **Time Complexity:** $O(n \log n)$ per test case due to sorting the array (or $O(n)$ if we find the minimum and maximum elements in a single pass without sorting).
- **Space Complexity:** $O(n)$ to store the array elements (or $O(1)$ auxiliary space if done iteratively).