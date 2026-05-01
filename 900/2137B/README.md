# Problem Number - 2137B Fun Permutation

**Problem Link:** [https://codeforces.com/problemset/problem/2137/B](https://codeforces.com/problemset/problem/2137/B)

---

## Topics
- Implementation
- Permutations
- Arrays

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 2 ≤ `n` ≤ 2 ⋅ 10⁵ (size of permutation)
- 1 ≤ `p[i]` ≤ `n` (size of permutation)
- Sum of all `n` across test cases ≤ 2 ⋅ 10⁵
- Time limit per test: 2 second
- Memory limit: 256 megabytes

## Intuition / Approach
- The problem provides a permutation of size `n` and asks us to transform it into another permutation.
- The transformation rule is simple: for each element `a` in the permutation, output `n + 1 - a`.
- This effectively "mirrors" the permutation around the midpoint.  
  Example: If `n = 5` and the permutation is `[1, 2, 3, 4, 5]`, the output becomes `[5, 4, 3, 2, 1]`.
- Since each element is processed independently, we can directly compute the transformed value in O(n) time per test case.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the permutation once.
- **Space Complexity:** `O(1)`, aside from input storage, as we only compute and print values directly.
