# Problem Number - 746B Decoding

**Problem Link:** [https://codeforces.com/problemset/problem/746/B](https://codeforces.com/problemset/problem/746/B)

---

## Topics
- Strings
- Implementation
- Greedy

## Constraints
- 1 ≤ `n` ≤ 2000
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to decode a string that was encoded by repeatedly taking the middle character (or one of the middle characters depending on the length parity) and moving it to the front of the resulting encoded string.
- To reverse this process, we can start with the first character of the encoded string and iteratively place each subsequent character either at the beginning or the end of our growing decoded string.
- By checking the parity of `(n - i)` for each index `i`, we can precisely determine whether the current character should be prepended or appended to match the original decoding sequence.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, as we iterate through each character of the string of length `n` once.
- **Space Complexity:** `O(n)`, to store the resulting decoded string.