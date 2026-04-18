# Problem Number - 2218B The 67th 6-7 Integer Problem

**Problem Link:** [https://codeforces.com/problemset/problem/2218/B](https://codeforces.com/problemset/problem/2218/B)

---

## Topics
- Implementation
- Math
- Greedy Approach

## Constraints
- 1 ≤ `t` ≤ 6767 (number of test cases)
- Each test case consists of 7 integers
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires computing a specific expression based on 7 integers.
- For each test case:
  - Track the maximum value among the 7 integers.
  - Compute the sum of all integers, but subtract them directly (i.e., accumulate negative values).
  - Finally, output `sum + 2 * maxi`.
- This works because the formula effectively adjusts the total by doubling the maximum element and subtracting the rest, which matches the problem’s requirement.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we only process 7 integers.
- **Space Complexity:** `O(1)`, as only a few variables are used to track the sum and maximum.
