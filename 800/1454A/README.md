# Problem Number - 1454A Special Permutation

**Problem Link:** [https://codeforces.com/problemset/problem/1454/A](https://codeforces.com/problemset/problem/1454/A)

---

## Topics
- Implementation
- Constructive algorithms
- Permutations

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)
- 2 ≤ `n` ≤ 100 (size of permutation)
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to construct a **special permutation** of numbers from 1 to `n` such that **no element remains in its original position** (i.e., no fixed points).
- A simple way to achieve this is:
  - Start with the natural sequence `[1, 2, 3, ..., n]`.
  - Swap each element with its next one. For example, `[2, 1, 4, 3, 6, 5, ...]`.
  - This guarantees that no element stays in its original position.
- For odd `n`, the last element would remain fixed if we only swap pairs. To fix this:
  - Perform the same swapping until the last three elements.
  - Then rotate the last three elements (e.g., `[n-2, n, n-1]`).
- This ensures the permutation is valid for both even and odd `n`.
- **OR**
- store elements in descending order which ensures that no element is at its original position
- ensure middle element is taken care of when `n` is odd.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we construct the permutation in linear time.
- **Space Complexity:** `O(n)`, for storing the permutation.