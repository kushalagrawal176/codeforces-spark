# Problem Number - 2085A Serval and String Theory

**Problem Link:** [https://codeforces.com/problemset/problem/2085/A](https://codeforces.com/problemset/problem/2085/A)

---

## Topics
- Strings
- Greedy
- Implementation

## Constraints
- 1 ≤ `t` ≤ 500 (number of test cases)
- 1 ≤ `n` ≤ 1000 (length of string)
- 0 ≤ `k` ≤ 10⁴ (maximum number of allowed operations)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A string is called **universal** if it is lexicographically smaller than its reversal.
- We are given a string `s` and allowed to perform at most `k` swap operations (swapping any two characters).
- Key observations:
  - If `s` is already lexicographically smaller than its reversal, the answer is **YES**.
  - If `k > 0`, we can always rearrange characters to try to make `s` smaller than its reversal, unless all characters are identical (e.g., `"aaa"`), in which case reversal is the same and impossible to make universal.
  - If `k = 0`, we must check directly whether `s < reverse(s)`.

- Therefore, the solution boils down to:
  1. Compute the reversal of `s`.
  2. If all characters are the same → output **NO**.
  3. Else if `s < reverse(s)` → output **YES**.
  4. Else if `k > 0` → output **YES** (since swaps allow rearrangement).
  5. Otherwise → output **NO**.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we need to compute the reversal and compare strings.
- **Space Complexity:** `O(n)` for storing the reversed string.
