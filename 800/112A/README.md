# Problem Number - 112A Petya and Strings

**Problem Link:** [https://codeforces.com/problemset/problem/112/A](https://codeforces.com/problemset/problem/112/A)

---

## Topics
- Strings
- Implementation
- Lexicographical Comparison

## Constraints
- Input strings length: 1 ≤ |s| ≤ 100
- Strings consist of uppercase and lowercase Latin letters
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to compare two strings lexicographically, ignoring case sensitivity.
- First, both strings should be converted to lowercase (or uppercase) to ensure case-insensitive comparison.
- Then, compare the strings character by character:
  - If the first string is lexicographically smaller, output `-1`.
  - If the first string is lexicographically greater, output `1`.
  - If both strings are equal, output `0`.
- In Java or C++, this can be simplified using built-in functions like `compareToIgnoreCase()` (Java) or `transform` + comparison operators (C++).

## Time and Space Complexity
- **Time Complexity:** O(n), where n is the length of the strings (up to 100). Each character is checked once.
- **Space Complexity:** O(1), only constant extra space is used for transformations and comparisons.
