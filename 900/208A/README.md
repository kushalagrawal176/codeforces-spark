# Problem Number - 208A Dubstep  
**Problem Link:** [https://codeforces.com/problemset/problem/208/A](https://codeforces.com/problemset/problem/208/A)  

---

## Topics  
- Strings  
- Implementation  

## Constraints  
- Input: a string consisting of uppercase English letters and the substring `"WUB"`  
- 1 ≤ `|s|` ≤ 200  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem describes a remix where the substring `"WUB"` is inserted between words of a song.  
- The task is to reconstruct the original song by removing `"WUB"` and replacing it with spaces.  
- Steps:  
  1. Read the input string.  
  2. Replace all occurrences of `"WUB"` with a space.  
  3. Trim leading/trailing spaces and collapse multiple spaces into one.  
  4. Print the resulting string as the original song.  
- This can be solved either by manually scanning the string or by using built-in string replacement functions.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where `n` is the length of the string, since we scan or replace substrings.  
- **Space Complexity:** `O(n)`, for storing the processed string.  