# Problem Number - 2005A Simple Palindrome

**Problem Link:** [https://codeforces.com/problemset/problem/2005/A](https://codeforces.com/problemset/problem/2005/A)

---

## Topics
- Constructive Algorithms
- Greedy
- Implementation
- Math

## Constraints
- $1 ≤ t ≤ 100$ (number of test cases)
- $1 ≤ n ≤ 100$ (length of the string)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for a string of length `n` using only the five vowels (`a`, `e`, `i`, `o`, `u`) such that the number of palindromic subsequences is minimized.
- Grouping identical vowels together in blocks (`a`s, then `e`s, then `i`s, then `o`s, then `u`s) prevents cross-vowel palindromic subsequences of length 2 or more, leaving palindromic subsequences formed within each vowel group.
- To minimize the number of palindromic subsequences across the 5 groups, distribute the `n` characters as evenly as possible across the 5 vowels: each vowel gets at least `n / 5` copies, and the first `n % 5` vowels get 1 extra copy.
- Repeating each vowel `n / 5 + (i < n % 5 ? 1 : 0)` times in order produces a valid string of length `n` with the minimum possible palindromic subsequences.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case to construct the output string of length `n` (or $O(1)$ over the fixed 5 vowels if built directly).
- **Space Complexity:** $O(n)$ to store the resulting string of length `n`.