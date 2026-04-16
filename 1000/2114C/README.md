# Problem Number - 2114C Need More Arrays

**Problem Link:** [https://codeforces.com/problemset/problem/2114/C](https://codeforces.com/problemset/problem/2114/C)

---

## Topics
- Greedy
- Dynamic Programming
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2 × 10⁵ (array size per test case)
- 1 ≤ `a[i]` ≤ 10⁶ (array elements)
- The array is sorted in non-decreasing order
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given a sorted array `a` of length `n`. We want to partition it into the minimum number of arrays based on the following rule:
  - Start with the first element in a new array.
  - For each subsequent element:
    - If the difference between the current element and the last element of the ongoing array is **greater than 1**, start a new array.
    - Otherwise, continue adding to the current array.
- This essentially counts the number of "gaps" greater than 1 in the sorted sequence.
- The answer is simply the number of such gaps plus one (for the first array).

### Example
For `a = [1, 2, 4, 6]`:
- Start with `[1]`.
- `2` continues in the same array → `[1, 2]`.
- `4 - 2 > 1`, so start a new array → `[4]`.
- `6 - 4 > 1`, so start another new array → `[6]`.
- Final arrays: `[1, 2]`, `[4]`, `[6]`.
- Answer = 3.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once.
- **Space Complexity:** `O(1)`, only counters and temporary variables are used.