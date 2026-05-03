# Problem Number - 2144B Maximum Cost Permutation

**Problem Link:** [https://codeforces.com/problemset/problem/2144/B](https://codeforces.com/problemset/problem/2144/B)

---

## Topics
- Permutations
- Implementation
- Greedy
- Arrays

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2 × 10⁵ (size of permutation)
- 0 ≤ `pᵢ` ≤ `n`
- No positive integer appears more than once
- Sum of `n` over all test cases ≤ 2 × 10⁵
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A permutation of length `n` must contain all integers from `1` to `n` exactly once.
- The **cost** of a permutation is defined as the minimum length of a contiguous subsegment that must be sorted to make the entire permutation sorted in ascending order.
- The input array may contain zeros, which represent missing values. These zeros must be replaced with the missing integers to form a valid permutation.
- To maximize the cost:
  - Identify the leftmost index `l` where the permutation deviates from being sorted (`p[l] ≠ l+1`).
  - Identify the rightmost index `r` where the permutation deviates (`p[r] ≠ r+1`).
  - The maximum cost is then the length of this segment: `r - l + 1`.
  - If the permutation is already sorted, the cost is `0`.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array to find `l` and `r`.
- **Space Complexity:** `O(n)` for storing the permutation array.
