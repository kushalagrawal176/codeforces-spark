# Problem Number - 1832C Contrast Value

**Problem Link:** [https://codeforces.com/problemset/problem/1832/C](https://codeforces.com/problemset/problem/1832/C)

---

## Topics
- Greedy
- Implementation
- Arrays

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)
- 1 ≤ `n` ≤ 3 ⋅ 10^5 (array size per test case)
- 0 ≤ `a[i]` ≤ 10^9 (array elements)
- Sum of n across all test cases ≤ 3 ⋅ 10^5
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to compute the **contrast value** of an array.
- Essentially, we want to capture the "zig-zag" pattern in the array.
- Observations:
  - If consecutive elements are equal, they do not contribute to contrast and can be ignored.
  - The contrast value is determined by the number of times the direction of change (increase vs decrease) flips.
- Approach:
  - Traverse the array and count the number of times the direction changes.
  - The answer is simply the number of direction changes + 1 (since the first element always starts a subsequence).

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the array once.
- **Space Complexity:** `O(n)` for storing the compressed array.
