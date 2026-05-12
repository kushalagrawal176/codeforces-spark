# Problem Number - 2131A Lever

**Problem Link:** [https://codeforces.com/problemset/problem/2131/A](https://codeforces.com/problemset/problem/2131/A)

---

## Topics
- Math

---

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)
- 1 ≤ `n` ≤ 10 (length of arrays)
- 1 ≤ `a[i]`, `x[i]` ≤ 10 (array values)
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem provides two arrays of length `n` for each test case.
- We start with an initial result `res = 1`.
- For each index `i`, we compare the values `a[i]` and `x[i]`.
- If `a[i] > x[i]`, we add the difference `(a[i] - x[i])` to `res`.
- Finally, print the result for each test case.

This is essentially a **simulation problem** where we directly implement the described process without any complex data structures or algorithms.

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through both arrays once.
- **Space Complexity:** `O(n)`, for storing the arrays.