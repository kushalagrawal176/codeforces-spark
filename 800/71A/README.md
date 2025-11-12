# Problem Number - 71A Way Too Long Words

**Problem Link:** [https://codeforces.com/problemset/problem/71/A](https://codeforces.com/problemset/problem/71/A)

---

## Topics
- Strings
- Implementation
- Simulation

## Constraints
- 1 ≤ n ≤ 100  
- Each word length: 1 ≤ |word| ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to shorten words that are "way too long."
- A word is considered too long if its length is **greater than 10**.
- The shortening rule is:
  - Keep the **first character**.
  - Replace the middle part with the **number of characters omitted**.
  - Keep the **last character**.
- Example:  
  - `"localization"` → `"l10n"`  
  - `"word"` → `"word"` (since length ≤ 10, no change).
- The solution is straightforward:
  - For each word, check its length.
  - If length > 10, apply the shortening rule.
  - Otherwise, print the word as-is.

## Time and Space Complexity
- **Time Complexity:** O(n), since we process each word once.  
- **Space Complexity:** O(1), only constant extra space used.  
