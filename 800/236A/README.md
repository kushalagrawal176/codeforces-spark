# Problem Number - 236A Boy or Girl

**Problem Link:** [https://codeforces.com/problemset/problem/236/A](https://codeforces.com/problemset/problem/236/A)

---

## Topics
- Strings
- Implementation
- Sets / HashMap

## Constraints
- Input string length: 1 ≤ |s| ≤ 100
- String consists of lowercase English letters
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to determine whether the number of distinct characters in a given username is even or odd.
- If the number of distinct characters is even, print `"CHAT WITH HER!"`.
- If the number of distinct characters is odd, print `"IGNORE HIM!"`.
- To solve this:
  - Use a data structure like `set` (C++) or `HashSet` (Java) to store unique characters.
  - The size of the set gives the count of distinct characters.
  - Check the parity of this count and print the corresponding message.

## Time and Space Complexity
- **Time Complexity:** O(n), where n is the length of the string. Each character is processed once.
- **Space Complexity:** O(1), since at most 26 distinct lowercase letters can be stored.
