# Problem Number - 1702C Train and Queries

**Problem Link:** [https://codeforces.com/problemset/problem/1702/C](https://codeforces.com/problemset/problem/1702/C)

---

## Topics
- Data Structures
- Hash Maps
- Implementation

## Constraints
- $1 ≤ t ≤ 10^4$ (Test cases)
- $1 ≤ n, k ≤ 2 × 10^5$
- $1 ≤ u_i ≤ 2 × 10^9$
- $1 ≤ a_j, b_j ≤ 2 × 10^9$
- Time limit per test: 3 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires us to process multiple queries on an array representing a train route, where each query asks if it's possible to travel from station `a` to station `b`.
- To make valid moves, station `a` must appear somewhere before station `b` in the given sequence of stations.
- For each unique station, we only need to track its **first occurrence** (minimum index) and its **last occurrence** (maximum index) in the array.
- We can use a hash map to store these boundary indices for each station element.
- For each query `(a, b)`, we check if:
  1. Both `a` and `b` exist in the map.
  2. The first occurrence of `a` is less than or equal to the last occurrence of `b` (`pos[a][0] <= pos[b][1]`).
- If these conditions are satisfied, print "YES"; otherwise, print "NO".

## Time and Space Complexity
- **Time Complexity:** $O(n + k)$ — $O(n)$ to populate the map with first and last indices, and $O(1)$ on average per query for $k$ queries.
- **Space Complexity:** $O(n)$ — to store the positions of unique elements in the hash map.