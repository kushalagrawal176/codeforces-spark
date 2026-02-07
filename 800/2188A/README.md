# Problem Number - 2188A Divisible Permutation

**Problem Link:** [https://codeforces.com/problemset/problem/2188/A](https://codeforces.com/problemset/problem/2188/A)

---

## Topics
- Permutations
- Greedy
- Implementation

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 2 ≤ `n` ≤ 100 (size of permutation)  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to construct a permutation of numbers from `1` to `n` such that it satisfies the divisibility condition described in the problem.  
- The construction strategy is:
  1. Start filling the permutation from the end (`n-1`) in steps of 2, assigning increasing values.
  2. After filling those positions, determine the starting index for the remaining positions:
     - If `n` is odd, start from index 1.
     - If `n` is even, start from index 0.
  3. Continue filling the remaining positions in steps of 2 with the next values.
- This ensures that the permutation meets the divisibility requirement by carefully distributing numbers across even and odd indices.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we fill the array in two passes.  
- **Space Complexity:** `O(n)`, for storing the permutation.  
