# Problem Number - 1869B 2D Traveling

**Problem Link:** [https://codeforces.com/problemset/problem/1869/B](https://codeforces.com/problemset/problem/1869/B)

---

## Topics
- Greedy
- Geometry
- Shortest Paths
- Implementation

## Constraints
- $1 \le t \le 10^4$
- $2 \le n \le 2 \cdot 10^5$
- $0 \le k \le n$
- $1 \le a, b \le n$
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum cost to travel from city `a` to city `b` in a 2D plane. 
- There are `k` major cities (from 1 to `k`) where travel costs between any two major cities are considered free (0 cost). 
- We have two main strategies to consider:
  1. **Direct Travel:** Go straight from city `a` to city `b` with a cost equal to the Manhattan distance between them.
  2. **Via Major Cities:** Travel from city `a` to some major city `i` (where $1 \le i \le k$), take free travel to a major city `j`, and then travel from major city `j` to city `b`. Because major-to-major travel is free, this simplifies to finding the minimum cost from `a` to *any* major city, plus the minimum cost from *any* major city to `b`.
- Thus, the answer is the minimum of the direct Manhattan distance between `a` and `b`, and the sum of the minimum distance from `a` to a major city and from `b` to a major city.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, since we iterate through the coordinates of all major cities to find the minimum distances.
- **Space Complexity:** $O(n)$ to store the coordinates of the cities.