# Problem Number - 2169A Alice and Bob

**Problem Link:** [https://codeforces.com/problemset/problem/2169/A](https://codeforces.com/problemset/problem/2169/A)

---

## Topics
- Implementation
- Math
- Greedy

## Constraints
- 1 ≤ `t` ≤ 10⁴
- 1 ≤ `n` ≤ 3 ⋅ 10⁵
- 1 ≤ `a` ≤ 10⁹
- 1 ≤ `v[i]` ≤ 10⁹ (non-decreasing order)
- Time limit per test: 2 second
- Memory limit per test: 512 megabytes

## Intuition / Approach
- Alice and Bob are playing a game where they choose a number based on the distribution of elements relative to a given integer `a`.
- Alice picks number `a` and Bob picks certain number. All numbers closest to Alice's one will go to Alice else to Bob
- We are asked to decide an integer for Bob such that **number of marbles that goes to Bob is maximum**.
- The logic is:
  - Count how many elements are **less than `a`** (`cnt1`).
  - Count how many elements are **greater than `a`** (`cnt2`).
  - If `cnt1 > cnt2`, then choosing `a - 1` is optimal.
  - Otherwise, choosing `a + 1` is optimal.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for scanning the array once.
- **Space Complexity:** `O(1)`, only counters are used.
