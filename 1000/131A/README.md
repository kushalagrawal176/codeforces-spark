# Problem Number - 131A cAPS lOCK  
**Problem Link:** [https://codeforces.com/problemset/problem/131/A](https://codeforces.com/problemset/problem/131/A)  

---

## Topics  
- Strings  
- Implementation  
- Case Conversion  

## Constraints  
- `Input string length` ≤ 100  
- String consists of uppercase and lowercase English letters  
- Time limit per test: 0.5 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether the given string is typed incorrectly due to Caps Lock being accidentally turned on.  
- A string is considered incorrectly typed if:  
  1. All characters are uppercase.  
  2. All characters except the first are uppercase.  
- If the string meets these conditions, we must toggle the case of the first character and convert the rest to lowercase.  
- Otherwise, the string is printed unchanged.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where n is the length of the string (single traversal).  
- **Space Complexity:** `O(n)`, for storing the transformed string.  
