# Problem Number - 2106B St. Chroma

**Problem Link:** [https://codeforces.com/problemset/problem/2106/B](https://codeforces.com/problemset/problem/2106/B)

---

## Topics
- Greedy
- Implementation
- Permutations
- MEX (Minimum Excludant)

## Constraints
- 1 ≤ `t` ≤ 4000 (number of test cases)
- 1 ≤ `n` ≤ 2 × 10⁵ (length of permutation)
- 0 ≤ `x` ≤ `n`
- Sum of `n` across all test cases ≤ 2 × 10⁵
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given two integers `n` and `x`. We need to construct a permutation `p` of length `n` (containing all integers from `0` to `n-1`) such that the number of cells painted with color `x` is maximized.
- The painting rule: the i-th cell is painted with `MEX(p₁, p₂, …, pᵢ)`.
- **Key observation:**  
  - The MEX of a prefix increases only when the current element equals the current MEX.  
  - To maximize occurrences of color `x`, we want the prefix MEX to equal `x` as often as possible.
- **Strategy:**  
  - Place all numbers less than `x` early in the permutation so that the prefix MEX quickly becomes `x`.  
  - Delay placing `x` itself until the end, ensuring the prefix MEX stays at `x` for as many positions as possible.  
  - Finally, place `x` at the end to allow the MEX to move beyond `x`.
- This greedy construction guarantees the maximum number of cells painted with color `x`.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we construct the permutation directly.  
- **Space Complexity:** `O(1)`, direct printing of elements