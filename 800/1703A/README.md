# Problem Number - 1703A YES or YES?

**Problem Link:** [https://codeforces.com/problemset/problem/1703/A](https://codeforces.com/problemset/problem/1703/A)

---

## Topics
- Strings
- Implementation

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)
- Each string length = 3 (the word to check)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to check whether the given string is `"yes"`, ignoring case sensitivity.
- For each test case:
  1. Read the string `s`.
  2. Convert it to lowercase (or uppercase) for uniform comparison.
  3. If the normalized string equals `"yes"`, output `"YES"`.
  4. Otherwise, output `"NO"`.
- Example:  
  - Input: `YeS`  
  - Normalized: `yes` → matches → Output: `YES`.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since the string length is fixed (3 characters).  
- **Space Complexity:** `O(1)`, only a few variables are used.
