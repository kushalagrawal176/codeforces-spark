# Problem Number - 2218C The 67th Permutation Problem

**Problem Link:** [https://codeforces.com/problemset/problem/2218/C](https://codeforces.com/problemset/problem/2218/C)

---

## Topics
- Implementation
- Constructive Algorithms
- Permutations

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 10⁵ (size of permutation block)
- Time limit per test: 2 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The task is to construct a special permutation of length `3n` with a defined pattern.
- The solution works in **two passes**:
  - **First pass:** Starting from the end, for every block of 3 elements, assign the largest available numbers to positions `i` and `i-1`. This ensures descending placement of pairs.
  - **Second pass:** Again from the end, assign the remaining numbers to positions `i` (the first element of each block). This fills the gaps left in the first pass.
- This guarantees that all numbers from `1` to `3n` are placed exactly once, forming a valid permutation.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array twice in steps of 3.
- **Space Complexity:** `O(n)`, for storing the permutation of size `3n`. Only linear space is used.
