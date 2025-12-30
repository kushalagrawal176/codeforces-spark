# Problem Number - 2003A Turtle and Good Strings  
**Problem Link:** [https://codeforces.com/problemset/problem/2003/A](https://codeforces.com/problemset/problem/2003/A)  

---

## Topics
- Strings  
- Implementation  
- Conditional Logic  

## Constraints
- 1 ≤ `t` ≤ 500  
- 2 ≤ `n` ≤ 100  
- String length = `n`  
- Characters are lowercase English letters (A–Z)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether a given string can be considered "good" based on simple rules.  
- Rules:  
  - If the string length `n = 1`, it is always `"NO"`.  
  - If `n = 2`, the string is `"YES"` only if the two characters are different; otherwise `"NO"`.  
  - If `n > 2`, the string is `"YES"` only if the first and last characters are different; otherwise `"NO"`.  
- Approach:  
  - Read the string and check conditions based on its length.  
  - Use direct comparisons (`s.charAt(0)` and `s.charAt(n-1)` `(in java)`) to decide the output.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only a few character comparisons are needed regardless of `n`.  
- **Space Complexity:** `O(1)`, only constant space is used.  
