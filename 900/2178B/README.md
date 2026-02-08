# Problem Number - 2178B Impost or Sus

**Problem Link:** [https://codeforces.com/problemset/problem/2178/B](https://codeforces.com/problemset/problem/2178/B)

---

## Topics
- Strings
- Implementation
- Simulation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 3 ≤ `|s|` ≤ 2 x 10⁵ (length of string)
- String consists of lowercase English letters `s` or `u`
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem revolves around scanning a string and counting transformations based on the character `'u'`.
- For each `'u'` in the string:
  - If the previous character is also `'u'`, replace it with `'s'` and increment the counter.
  - If the next character is `'u'`, replace it with `'s'` and increment the counter.
- After processing the middle characters, check the boundaries:
  - If the first character is `'u'`, increment the counter.
  - If the last character is `'u'`, increment the counter.
- The final count represents the number of replacements or "sus" transformations performed.

## Time and Space Complexity
- **Time Complexity:** `O(|s|)` per test case, since we scan through the string once.
- **Space Complexity:** `O(|s|)` due to string storage, but only constant extra space is used for counters and temporary variables.
