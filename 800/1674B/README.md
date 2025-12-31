# Problem Number - 1674B Dictionary  

**Problem Link:** [https://codeforces.com/problemset/problem/1674/B](https://codeforces.com/problemset/problem/1674/B)  

---

## Topics  
- Strings  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 650 (number of test cases)  
- Each string `s` has length 2 and consists of lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach  
- The problem defines a custom dictionary order for all possible two-letter strings.  
- Each string is formed from lowercase letters `'a'` to `'z'`, but the order excludes strings where both characters are the same.  
- To compute the position of a given string `s`:  
  1. Calculate `(s[0] - 'a') * 25 + (s[1] - 'a)`.  
     - This accounts for the number of strings starting with letters before `s[0]`.  
  2. If the second character is lexicographically smaller than the first (`s[1] < s[0]`), increment the value by 1 to skip the invalid case where both characters are equal.  
- This gives the dictionary index of the string.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since the formula is computed directly.  
- **Space Complexity:** `O(1)`, only constant space is used.  
