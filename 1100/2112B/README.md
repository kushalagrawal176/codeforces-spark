# Problem Number - 2112B Shrinking Array

**Problem Link:** [https://codeforces.com/problemset/problem/2112/B](https://codeforces.com/problemset/problem/2112/B)

---

## Topics
- Arrays
- Implementation
- Greedy
- Simulation

## Constraints
- 1 ≤ `t` ≤ 200 (number of test cases)
- 2 ≤ `n` ≤ 100 (array size per test case)
- 1 ≤ `a[i]` ≤ 10⁶ (array elements)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether it is possible to shrink the array according to the rules:
  - choose 2 adjacent positions `i` and `i+1` in the array
  - choose integer `x` such that **min(`a[i]`, `a[i+1]`)** ≤ `x` ≤ **max(`a[i]`, `a[i+1]`)**
  - remove the numbers `a[i]` and `a[i+1]` from the array and insert `x` (size of array decreases by 1)

- **Step-by-step reasoning:**
  1. Traverse the array and check if any consecutive pair has `|a[i] - a[i-1]| ≤ 1`.  
     - If found, print `0`.
  2. If not found, check monotonicity:
     - If strictly increasing or strictly decreasing, print `-1`.
  3. Otherwise, print `1`.

- This works because:
  - A consecutive difference ≤ 1 guarantees immediate shrinking.
  - Strict monotonic arrays cannot be shrunk under the rules.
  - Non-monotonic arrays without small differences require at least one operation.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once.
- **Space Complexity:** `O(n)` for storing the array, though only `O(1)` extra space is used for flags.
