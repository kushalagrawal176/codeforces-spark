# Problem 1138A - Sushi for Two

**Problem Link:** [https://codeforces.com/problemset/problem/1138/A](https://codeforces.com/problemset/problem/1138/A)

---

## Topics
- Implementation
- Greedy
- Two Pointers

## Constraints
- $2 ≤ n ≤ 10^5$ (Length of the array)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the length of the longest contiguous subsegment of sushi such that it can be split into two halves of equal length, where the first half contains only one type of sushi (e.g., all 1s) and the second half contains only the other type (e.g., all 2s), or vice versa.
- Instead of explicitly checking every subarray, we can group the contiguous identical sushi types into lengths of consecutive blocks (e.g., if array is `[1, 1, 1, 2, 2]`, the block lengths are `[3, 2]`).
- For any two adjacent blocks of differing types, a valid alternating subsegment can be formed with length equal to `2 × min(length of block 1, length of block 2)`.
- We can efficiently compute this on the fly in a single pass (O(n) time and O(1) space) by keeping track of the length of the current block (`c`), the length of the previous block (`lc`), and updating the maximum answer as `2 × min(lc, c)` whenever the sushi type changes.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, as we iterate through the array of size `n` a single time.
- **Space Complexity:** $O(1)$, since we only use a few variables to track the current and previous block lengths and the maximum answer.