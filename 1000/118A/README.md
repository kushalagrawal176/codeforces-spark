# Problem Number - 118A String Task  
**Problem Link:** [https://codeforces.com/problemset/problem/118/A](https://codeforces.com/problemset/problem/118/A)  

---

## Topics  
- Strings  
- Implementation  

## Constraints  
- `Input string length` ≤ 100  
- String consists of uppercase and lowercase English letters  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to transform the input string by removing all vowels (`A, O, Y, E, U, I` in both cases).  
- For each consonant in the string:  
  - Prepend a `"."` before it.  
  - Convert it to lowercase if it is uppercase.  
- This ensures the final string contains only consonants, each preceded by a dot, and all characters are lowercase.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where n is the length of the string (single pass).  
- **Space Complexity:** `O(n)`, for storing the transformed string.  
