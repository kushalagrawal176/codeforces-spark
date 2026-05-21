# Problem Number - 2139B Cake Collection

**Problem Link:** [https://codeforces.com/problemset/problem/2139/B](https://codeforces.com/problemset/problem/2139/B)

---

## Topics
- Greedy
- Sorting
- Implementation

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)
- 1 ≤ `n` ≤ 10⁵ (number of ovens)
- 1 ≤ `m` ≤ 10⁸ (number of seconds)
- 1 ≤ `aᵢ` ≤ 10⁵ (cakes baked per second by oven `i`)
- Sum of `n` across all test cases ≤ 2 × 10⁵
- Time limit per test: 1 second
- Memory limit per test: 512 megabytes

## Intuition / Approach
- Maple has `n` ovens, each producing `aᵢ` cakes per second. At the end of each second, she can teleport to any oven and collect all cakes accumulated there.
- To maximize the total cakes collected in `m` seconds, she should prioritize ovens with the highest baking rates.
- **Key Insight:**  
  - If Maple collects from the oven with rate `a[i]` at second `k`, she gains `a[i] × (m - k + 1)` cakes (because the oven continues baking until that second).  
  - Thus, sorting ovens in descending order of `a[i]` ensures she collects from the most productive ovens first.
- The optimal strategy is:
  1. Sort ovens by cake rate in descending order.
  2. For the top `min(n, m)` ovens, collect cakes sequentially.  
     Contribution from oven `i` (0-indexed after sorting) = `a[i] × (m - i)`.
- This greedy approach guarantees maximum cake collection.

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting ovens: `O(n log n)`  
  - Summation: `O(min(n, m))`  
  - Total complexity is `O(n log n)`, which is efficient given constraints.
- **Space Complexity:** `O(n)`, for storing oven rates.