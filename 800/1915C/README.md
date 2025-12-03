# Problem 1915C - Can I Square?

**Problem Link:** [https://codeforces.com/problemset/problem/1915/C](https://codeforces.com/problemset/problem/1915/C)

---

## Topics
- Math
- Implementation
- Binary Search

## Constraints
- 1 ≤ `t` ≤ 10^4
- 1 ≤ `n` ≤ 2⋅10^5
- 1 ≤ `ai` ≤ 10^9
- Sum of n over all test cases ≤ 2×10^5
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Calin receives buckets containing 1×1 squares and must use **all** squares to form one large square.
- Sum all squares from all buckets to get total count S.
- Check if S is a perfect square (exists integer K where K×K = S).
- Output "YES" if perfect square exists, "NO" otherwise.

## Time and Space Complexity
- **Time Complexity:** `O(n)` for reading all inputs across test cases
- **Space Complexity:** `O(1)`, only storing running sum
