# Problem Number - 2210A A Simple Sequence

**Problem Link:** [https://codeforces.com/problemset/problem/2210/A](https://codeforces.com/problemset/problem/2210/A)

---

## Topics
- Implementation
- Greedy
- Sequences

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)
- 2 ≤ `n` ≤ 100 (length of sequence)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires generating a descending sequence from `n` down to `1`.
- For each test case:
  - Read the integer `n`.
  - Print the sequence `n, n-1, ..., 1` separated by spaces.
- This is a straightforward loop-based problem with no complex logic or data structures required.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate from `n` down to `1`.
- **Space Complexity:** `O(1)`, as only constant extra space is used for printing the sequence.
