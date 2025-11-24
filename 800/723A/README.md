# Problem Number - 723A The New Year: Meeting Friends

**Problem Link:** [https://codeforces.com/problemset/problem/723/A](https://codeforces.com/problemset/problem/723/A)

---

## Topics
- Implementation
- Math
- Sorting

## Constraints
- Input consists of three distinct integers `x1, x2, x3` (positions of friends)
- 1 ≤ `x1`, `x2`, `x3` ≤ 100
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum total distance three friends need to travel to meet at a single point on a number line.
- To minimize the sum of distances, the optimal meeting point is always the **median** of the three positions.
- Steps:
  1. Sort the three positions.
  2. The middle value (median) is the meeting point.
  3. Compute the total distance as:  
     `|x1 - median| + |x2 - median| + |x3 - median|`
- Example:  
  - Input: `7 1 4`  
  - Sorted: `1 4 7` → median = 4  
  - Distances: `|7-4| + |1-4| + |4-4| = 3 + 3 + 0 = 6`  
  - Output: `6`

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only three numbers are sorted and distances computed.  
- **Space Complexity:** `O(1)`, no extra space required.
