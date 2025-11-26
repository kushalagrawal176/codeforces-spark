# Problem Number - 1791A Codeforces Checking  
**Problem Link:** [https://codeforces.com/problemset/problem/1791/A](https://codeforces.com/problemset/problem/1791/A)  

---

## Topics  
- Implementation  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 26 (number of test cases)  
- Each test case consists of a single lowercase English letter  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks whether the given character belongs to the word **"codeforces"**.  
- Approach:  
  - Read the character input.  
  - Check if the character is one of the letters in `"codeforces"`.  
  - If yes, print **"YES"**.  
  - Otherwise, print **"NO"**.  
- Since the word `"codeforces"` has only 10 distinct characters, the check can be done directly using a set or simple conditional statements.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since checking membership in a fixed set of characters is constant time.  
- **Space Complexity:** `O(1)`, only a constant set of characters is stored.  
