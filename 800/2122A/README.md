# Problem Number - 2122A Greedy Grid

**Problem Link:** [https://codeforces.com/problemset/problem/2122/A](https://codeforces.com/problemset/problem/2122/A)

---

## Topics
- Implementation
- Grid Problems
- Greedy Strategy
- Constructive Proof

## Constraints
- 1 ≤ `t` ≤ 5000 (number of test cases)
- 1 ≤ `n`, `m` ≤ 100 (grid dimensions)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A **greedy path** starts at the top-left cell and moves only right or down, always choosing the neighbor with the greater value (or either if equal).
- The problem asks whether there exists an `n × m` grid of nonnegative integers such that **no greedy path achieves the maximum value among all possible down/right paths**.
- Key observation:
  - If both dimensions are small, greedy paths will always coincide with maximum paths.
  - To construct a counterexample, the grid must be large enough to allow a non-greedy path to outperform greedy ones.
- After analysis, the condition is:
  - **YES** if `min(n, m) ≥ 2` and `max(n, m) ≥ 3`.
  - **NO** otherwise.
- This is because:
  - At least 2 rows and 2 columns are needed to allow deviation between greedy and optimal paths.
  - At least one dimension must be ≥ 3 to ensure a non-greedy path can accumulate more value than greedy.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only simple comparisons are made.
- **Space Complexity:** `O(1)`, no extra memory required.
