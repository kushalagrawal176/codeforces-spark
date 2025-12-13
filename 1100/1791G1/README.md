# Problem Number - 1791G1 Teleporters (Easy Version)

**Problem Link:** [https://codeforces.com/problemset/problem/1791/G1](https://codeforces.com/problemset/problem/1791/G1)

---

## Topics
- Greedy
- Sorting
- Implementation

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 2 × 10^5  
- 1 ≤ `c` ≤ 10^9  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum number of teleporters that can be used given a budget `c`.  
- Each teleporter at position `i` has an actual cost of `a[i] + i` (since moving to position `i` costs `i` units and using the teleporter costs `a[i]`).  
- To maximize the number of teleporters used, we should always pick the cheapest available teleporters first.  
- Steps:
  1. Compute the effective cost for each teleporter: `cost[i] = a[i] + i`.
  2. Sort all teleporters by their cost.
  3. Iteratively subtract the cost from the budget `c` until we can no longer afford the next teleporter.
  4. Count how many teleporters were successfully used.
- This greedy approach works because choosing cheaper teleporters first ensures we maximize the count before the budget runs out.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case due to sorting.   
- **Space Complexity:** `O(n)` for storing teleporter costs.
