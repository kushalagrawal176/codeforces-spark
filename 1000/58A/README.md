# Problem Number - 58A Chat room  
**Problem Link:** [https://codeforces.com/problemset/problem/58/A](https://codeforces.com/problemset/problem/58/A)  

---

## Topics  
- Strings  
- Implementation  
- Subsequence Checking  

## Constraints  
- `Input string length` ≤ 100  
- String consists of lowercase English letters  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether the word `"hello"` appears as a subsequence in the given string.  
- A subsequence means the letters must appear in order but not necessarily consecutively.  
- Approach:  
  1. Initialize a pointer to track progress through the target word `"hello"`.  
  2. Traverse the input string character by character.  
  3. If the current character matches the next required character in `"hello"`, move the pointer forward.  
  4. If the pointer reaches the end of `"hello"`, it means the subsequence exists.  
  5. Print `"YES"` if found, otherwise `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where n is the length of the input string (single traversal).  
- **Space Complexity:** `O(1)`, only constant space used for tracking subsequence progress.  
