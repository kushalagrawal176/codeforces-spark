# Problem 1914D - Three Activities

**Problem Link:** [https://codeforces.com/problemset/problem/1914/D](https://codeforces.com/problemset/problem/1914/D)

---

## Topics
- Greedy
- Sorting
- DP
- Brute Force
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴
- 3 ≤ `n` ≤ 10⁵
- 1 ≤ `aᵢ`, `bᵢ`, `cᵢ` ≤ 10⁸
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Monocarp must choose three **distinct days** for skiing (array A), movies (array B), and board games (array C) to maximize total friends joining.
- **Key Insight**: Only the **top 3 values** from each activity matter since lower values cannot contribute to optimal solution.
- Extract top 3 `(value, day_index)` pairs for each activity and sort descending by value.
- Brute force check all **3×3×3 = 27 combinations**, validating that selected days are distinct.
- Track maximum valid sum across all valid triplets.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` for sorting top-3 extraction + `O(27)` per test case
- **Space Complexity:** `O(n)` for input arrays + `O(1)` for top-3 storage
