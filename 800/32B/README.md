# Problem Number - 32B Borze  
**Problem Link:** [https://codeforces.com/problemset/problem/32/B](https://codeforces.com/problemset/problem/32/B)  

---

## Topics  
- Implementation  
- String Processing  

## Constraints  
- 1 ≤ `|s|` ≤ 200 (length of the Borze code string)  
- Input consists only of characters `.` and `-`  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks to decode a string written in Borze code into digits.  
- The mapping rules are:  
  - `.` → `0`  
  - `-.` → `1`  
  - `--` → `2`  
- Approach:  
  - Traverse the string character by character.  
  - If the current character is `.`, append `0` to the result.  
  - If the current character is `-`, check the next character:  
    - If it is `.`, append `1` and skip the next character.  
    - If it is `-`, append `2` and skip the next character.  
- This greedy parsing works because the Borze code is guaranteed to be valid and unambiguous.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where n is the length of the string (single pass).  
- **Space Complexity:** `O(1)`, aside from the output string.  
