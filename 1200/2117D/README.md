# Problem Number - 2117D Retaliation

**Problem Link:** [https://codeforces.com/problemset/problem/2117/D](https://codeforces.com/problemset/problem/2117/D)

---

## Topics
- Implementation
- Math
- Simulation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 2 ≤ `n` ≤ 2 × 10⁵ (array size)
- 1 ≤ `aᵢ` ≤ 10⁹ (array elements)
- Sum of `n` across all test cases ≤ 2 × 10⁵
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The array is considered **exploded** when all elements become zero.
- Yousef can perform two types of operations:
  1. Decrease each element `a[i]` by its index `i`.
  2. Decrease each element `a[i]` by `(n - i + 1)`.

- The key observation is that both operations subtract values that form **arithmetic progressions** across the array.
- For the array to be reducible to all zeros:
  - The differences between consecutive elements must remain constant (i.e., the array must already form an arithmetic progression).
  - Additionally, the starting element and progression must align with divisibility conditions so that repeated operations can reduce all elements to exactly zero.
- The check boils down to:
  - Verify if the array is an arithmetic progression.
  - Ensure that `(a[0] - d)` is divisible by `(n + 1)` and that resulting values are non-negative.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we check differences across the array.
- **Space Complexity:** `O(n)` for storing the array.