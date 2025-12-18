# Problem Number - 1272C Yet Another Broken Keyboard
**Problem Link:** https://codeforces.com/problemset/problem/1272/C

---

## Topics
- strings
- implementation
- combinatorics

## Constraints
- 1 ≤ `n` ≤ 200000  
- 1 ≤ `k` ≤ 26  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given a string and a set of allowed characters.
- A substring is considered good if **all characters** in it belong to the allowed set.
- Good substrings come from **continuous segments** of allowed characters.
- If a segment has length `L`, the number of good substrings is:

    **`L × (L + 1) / 2`**

- Traverse the string, count lengths of valid segments, and sum their contributions.

## Time and Space Complexity
- **Time Complexity:** `O(n)` — single pass through the string.
- **Space Complexity:** `O(26) = O(1)` — only a 26‑size array.
