# Problem Number - 2114B Not Quite a Palindromic String

**Problem Link:** [https://codeforces.com/problemset/problem/2114/B](https://codeforces.com/problemset/problem/2114/B)

---

## Topics
- Strings
- Greedy
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 2 ≤ `n` ≤ 2 ⋅ 10⁵ (string length, always even)
- 0 ≤ `k` ≤ `n/2`
- String consists only of characters `'0'` and `'1'`
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem defines a **good pair** as indices `(i, n - i + 1)` where the characters are equal.
- Vlad wants to rearrange the string so that there are **exactly k good pairs**.
- Key observations:
  - Each pair is formed by two characters. To maximize good pairs, we can group identical characters together.
  - The maximum number of good pairs possible is `(cnt0 / 2) + (cnt1 / 2)` where `cnt0` and `cnt1` are counts of zeros and ones.
  - The minimum number of good pairs possible is `|cnt0 - cnt1| / 2`, since imbalance forces mismatches.
  - To achieve exactly `k`, it must lie between `minPairs` and `maxPairs`.
  - Additionally, `(k - minPairs)` must be even, because rearrangements change pairs in steps of 2 (swapping two characters affects two pairs).

- **Algorithm:**
  1. Count zeros and ones in the string.
  2. Compute `maxPairs` and `minPairs`.
  3. Check if `k` lies in the valid range and satisfies parity condition.
  4. Output "YES" if possible, otherwise "NO".

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (counting zeros and ones).
- **Space Complexity:** `O(1)`, only counters are used.