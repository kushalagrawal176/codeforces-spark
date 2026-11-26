# Problem Number - 1988B Make Majority

**Problem Link:** [https://codeforces.com/problemset/problem/1988/B](https://codeforces.com/problemset/problem/1988/B)

---

## Topics
- Greedy
- Implementation
- Strings / Arrays

## Constraints
- $1 ≤ t ≤ 4 \cdot 10^4$ (number of test cases)
- $1 ≤ n ≤ 2 × 10⁵$
- Time limit per test: 1.5 seconds
- Memory limit per test: 512 megabytes

## Intuition / Approach
- In each operation, choosing a contiguous subarray and replacing it with the majority element allows us to collapse any contiguous block of `0`s into a single `0`.
- Keeping consecutive `1`s separate preserves each `1` as its own element, maximizing the count of `1`s relative to `0`s.
- Since collapsing adjacent `0`s into one `0` never hurts and always minimizes the number of remaining `0`s, we only need to count:
  - `n1`: total number of `'1'` characters in the sequence.
  - `n0`: number of maximal contiguous blocks (segments) of `'0'` characters.
- We can make the final sequence consist of a single `1` (meaning strictly more `1`s than `0`s in the reduced sequence) if and only if `n1 > n0`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, scanning the sequence once.
- **Space Complexity:** $O(1)$ auxiliary space (excluding input string storage).