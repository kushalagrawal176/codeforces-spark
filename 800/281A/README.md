# Problem Number - 281A Word Capitalization

**Problem Link:** [https://codeforces.com/problemset/problem/281/A](https://codeforces.com/problemset/problem/281/A)

---

## Topics
- Strings
- Implementation

## Constraints
- Input string length: 1 ≤ `|s|` ≤ 1000
- String consists of uppercase and lowercase English letters
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to capitalize the first letter of the given word.
- If the first character is already uppercase, the word remains unchanged.
- If the first character is lowercase, convert it to uppercase while keeping the rest of the string intact.
- Example:  
  Input: `"ApPLe"` → Output: `"ApPLe"`  
  Input: `"word"` → Output: `"Word"`

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only the first character needs to be checked and possibly modified.
- **Space Complexity:** `O(1)`, as no extra space is required beyond the input string.
