# Problem Number - 2218A The 67th Integer Problem

**Problem Link:** [https://codeforces.com/problemset/problem/2218/A](https://codeforces.com/problemset/problem/2218/A)

---

## Topics
- Implementation
- Conditional Logic
- Math

## Constraints
- 1 ≤ `t` ≤ 6767 (number of test cases)
- Input integer `a` -67 ≤ `a` ≤ 67
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- For each test case, we are given an integer `a`.
- The task is to check whether `a + 1` lies within the range [-67, 67].
- If it does, output `a + 1`. Otherwise, output `a`.
- This is a straightforward conditional check problem, requiring only one comparison per test case.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a single comparison and output are performed.
- **Space Complexity:** `O(1)`, as only a few variables are used.