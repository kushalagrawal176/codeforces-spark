# Problem Number - 2254B Evanescent

**Problem Link:** [https://codeforces.com/problemset/problem/2254/B](https://codeforces.com/problemset/problem/2254/B)

---

## Topics
- Implementation
- Strings
- Two Pointers

## Constraints
- $1 ≤ t ≤ 10⁴$ (number of test cases)
- $3 ≤ n ≤ 2 × 10⁵$ (length of string)
- $s$ consists of lowercase Latin letters.
- The sum of $n$ over all test cases does not exceed 2 × 10⁵.
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach

- The problem asks us to delete exactly one character from the string, excluding the first and last characters, to minimize the length of its compressed version.
- A compressed string is formed by replacing every maximal contiguous group of identical characters with a single character.
- Instead of actually deleting every possible character and calculating the compressed string each time, we can use a simple observation.
- First, count the number of consecutive groups (runs) of identical characters in the original string.
- Deleting a character can reduce the number of groups only when its previous and next characters are equal, but different from the character being deleted.
- In other words, if we find a pattern of the form `aba`, where `a != b`, deleting the middle character merges the two groups of `a` into one.
- This reduces the compressed length by exactly 2.
- Therefore, there are only two possible outcomes:
  - If the string contains an `aba` pattern at any valid interior position, the answer is `number of groups - 2`.
  - Otherwise, the answer remains `number of groups`.
- We can calculate the number of groups by iterating through the string and incrementing a counter whenever the current character differs from the previous character.
- While iterating, check whether `s[i-1] == s[i+1]` and `s[i] != s[i-1]`.
- This allows us to solve the problem in a single traversal without constructing any new strings.

## Algorithm

1. Initialize `groups = 1`.
2. Iterate through the string from index `1` to `n-1`.
3. Whenever `s[i] != s[i-1]`, increment `groups`.
4. Check every valid interior position for the pattern `aba`:
   - If `s[i-1] == s[i+1]` and `s[i] != s[i-1]`, an optimal deletion reduces the number of groups by 2.
5. If such a pattern exists, print `groups - 2`.
6. Otherwise, print `groups`.

## Time and Space Complexity

- **Time Complexity:** $O(n)$ per test case, since we traverse the string a constant number of times to count groups and check for the `aba` pattern.
- **Space Complexity:** $O(1)$, since we only use a constant number of variables and do not create any additional data structures.