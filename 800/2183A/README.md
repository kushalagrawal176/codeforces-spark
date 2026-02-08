# Problem Number - 2183A Binary Array Game

**Problem Link:** [https://codeforces.com/problemset/problem/2183/A](https://codeforces.com/problemset/problem/2183/A)

---

## Topics
- Implementation
- Game Theory
- Arrays

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)
- 3 ≤ `n` ≤ 100 (array length)
- Array elements are binary (`0` or `1`)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem defines a game played on a binary array.
- The decision depends only on the **first** and **last** elements of the array:
  - If both are `0`, then **BOB** wins.
  - Otherwise, **ALICE** wins.
- The middle elements of the array do not affect the outcome, so they can be ignored.
- Thus, the solution reduces to:
  - Read the first element `a`.
  - Skip the middle elements.
  - Read the last element `b`.
  - Apply the condition:
    - If `a == b == 0`, print `"BOB"`.
    - Else, print `"ALICE"`.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case due to reading input, but the decision itself is `O(1)`.
- **Space Complexity:** `O(1)`, only a few variables are used.
