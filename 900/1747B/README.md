# Problem Number - 1747B BAN BAN

**Problem Link:** [https://codeforces.com/problemset/problem/1747/B](https://codeforces.com/problemset/problem/1747/B)

---

## Topics
- Constructive Algorithms
- Greedy

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $1 \le n \le 100$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach

- We are given a string of length `3n` consisting of `n` copies of `"BAN"` concatenated together (e.g., for `n = 2`, the string is `"BANBAN"`).
- In one operation, we can choose any two distinct indices `i` and `j` (`1 <= i, j <= 3n`) and swap characters `s[i]` and `s[j]`. The goal is to minimize operations so that `"BAN"` does **not** appear as a subsequence anywhere in the final string.
- A subsequence `"BAN"` is avoided if all `'B'`s appear after all `'A'`s and `'N'`s—for instance, turning the string into a sequence of `'N'`s, followed by `'A'`s, followed by `'B'`s (such as `"NNAABB"`).
- Notice that in `"BANBAN..."`, the `'B'`s sit at indices `1, 4, 7, ...` (`1 + 3k`) and the `'A'`s sit at indices `2, 5, 8, ...` (`2 + 3k`).
- Pairing the leftmost `'B'` with the rightmost `'A'` and swapping them moves `'A'` toward the front and `'B'` toward the back in a single move.
- Advancing `left` by `3` and `right` by `3` until `left >= right` eliminates all `"BAN"` subsequences in the minimum number of moves, which is `(n + 1) / 2` (using integer division).

## Time and Space Complexity

- **Time Complexity:** $O(n)$ per test case (or $O(1)$ to compute the number of operations, and $O(n)$ to print the swap pairs).
- **Space Complexity:** $O(1)$ auxiliary space.