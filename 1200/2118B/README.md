# Problem Number - 2118B Make It Permutation

**Problem Link:** [https://codeforces.com/problemset/problem/2118/B](https://codeforces.com/problemset/problem/2118/B)

---

## Topics
- Implementation
- Permutations

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)
- 3 ≤ `n` ≤ 5000 (size of permutation)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires constructing a sequence of operations that transforms an initial arrangement into a valid permutation of size `n`.
- The key observation is that we can always achieve this using **2n - 1 operations**.
- For each `i` from 1 to `n`, we:
  - Connect `i` with `1` and itself, ensuring each element is linked.
  - If `i` is not the last element, connect `i` with `(i+1)` and `n` to maintain continuity.
- This guarantees that all numbers from 1 to `n` are included and the structure forms a valid permutation.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through all elements once.
- **Space Complexity:** `O(1)`, as only constant extra space is used for printing operations.
