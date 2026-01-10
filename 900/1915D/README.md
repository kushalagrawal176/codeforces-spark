# Problem Number - 1915D Unnatural Language Processing  
**Problem Link:** [https://codeforces.com/problemset/problem/1915/D](https://codeforces.com/problemset/problem/1915/D)  
---

## Topics
- String Processing  
- Implementation  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 100 
- 1 ≤ `n` ≤ 2 ⋅ 10⁵
- String length = `n`  
- String consists of lowercase English letters  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to split a given string into syllables according to specific rules.  
- Each syllable is either of length 2 or 3, and the splitting depends on whether the next character is a vowel (`a` or `e`).  
- Algorithm:  
  1. Traverse the string from left to right.  
  2. Take two characters as the base of a syllable.  
  3. If the fourth character ahead is **not** a vowel, then include the third character in the syllable (making it length 3).  
  4. Append a `"."` after each syllable to mark the split.  
  5. Continue until the end of the string, appending remaining characters directly.  
- This greedy approach ensures syllables are formed correctly without backtracking.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the string once.  
- **Space Complexity:** `O(n)`, for storing the output string with separators.  
