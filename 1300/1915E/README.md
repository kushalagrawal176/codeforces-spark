# Problem Number - 1915E Romantic Glasses

**Problem Link:** [https://codeforces.com/problemset/problem/1915/E](https://codeforces.com/problemset/problem/1915/E)

---

## Topics
- Prefix Sums
- Hashing / Sets
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2 × 10⁵ (number of glasses per test case)
- 1 ≤ `aᵢ` ≤ 10⁹ (juice units in each glass)
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Iulia drinks from odd-indexed glasses, while her date drinks from even-indexed glasses.  
- The task is to check if there exists a contiguous subarray where both drink the same total amount of juice.
- Reformulating: we want to know if there exists indices `l, r` such that the alternating sum of elements in that subarray equals zero.
- Define an alternating prefix sum:
  - `sum[i] = a[0] - a[1] + a[2] - a[3] + ... ± a[i]`
- If at any two different positions the alternating prefix sum is equal, then the subarray between them has equal juice for Iulia and her date.
- Thus, the problem reduces to checking if any alternating prefix sum value repeats.
- Implementation:
  - Maintain a running alternating sum.
  - Store seen sums in a hash set.
  - If a sum repeats, answer "YES"; otherwise "NO".

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we compute prefix sums and check in a hash set.
- **Space Complexity:** `O(n)` in the worst case, storing all prefix sums.
