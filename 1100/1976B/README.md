# Problem Number - 1976B Increase/Decrease/Copy

**Problem Link:** [https://codeforces.com/problemset/problem/1976/B](https://codeforces.com/problemset/problem/1976/B)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- $1 \le t \le 10^4$ (Number of test cases)
- $1 \le n \le 2 \times 10^5$
- $1 \le a_i, b_i \le 10^9$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given two arrays $a$ of size $n$ and $b$ of size $n + 1$. We want to transform array $a$ into the first $n$ elements of array $b$ using three operations: increment an element, decrement an element, or copy the last element of $a$ to expand its size and then modify it.
- To make the minimum number of operations to transform $a$ into $b[0 \dots n-1]$, the base cost is the sum of absolute differences between each corresponding element: $\sum_{i=0}^{n-1} |a_i - b_i|$.
- Since $b$ has size $n+1$ and we need to form the extra element $b[n]$, we must insert an extra step where we copy some element and adjust it to reach $b[n]$, or leverage an element whose range already covers $b[n]$.
- We iterate through all elements, accumulating the base difference `sum`, and simultaneously find the minimum extra cost `e` required to connect $b[n]$ to the closest value among $a_i$ and $b_i$. If $b[n]$ falls inclusively between $a_i$ and $b_i$, the extra cost is `0`.
- Finally, we add `e + 1` (accounting for the extra copy operation) to our base `sum`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for iterating through the arrays of size $n$.
- **Space Complexity:** $O(n)$ to store arrays $a$ and $b$.