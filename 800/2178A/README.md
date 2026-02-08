# Problem Number - 2178A Yes or Yes

**Problem Link:** [https://codeforces.com/problemset/problem/2178/A](https://codeforces.com/problemset/problem/2178/A)

---

## Topics
- Strings
- Implementation
- Simulation

## Constraints
- 1 ≤ `t` ≤ 500 (number of test cases)
- 2 ≤ `|s|` ≤ 100 (length of string)
- String consists of uppercase English letters `Y` or `N`
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires checking a string under specific rules:
  - If two consecutive `'Y'` characters appear, the answer is `"NO"`.
  - Otherwise, the string is valid and the answer is `"YES"`.
- To implement this:
  - Track the previous character while iterating through the string.
  - If `prev == 'Y'` and the current character is also `'Y'`, mark invalid (`flag = false`).
  - Otherwise, update `prev`:
    - If `prev == current`, set `prev = 'N'`.
    - Else, set `prev = 'Y'`.
- After processing, print `"YES"` if no invalid condition was found, otherwise `"NO"`.

## Time and Space Complexity
- **Time Complexity:** `O(|s|)` per test case, since we scan through the string once.
- **Space Complexity:** `O(1)`, only a few variables are used for tracking.
