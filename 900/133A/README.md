# Problem Number - 133A HQ9+  
**Problem Link:** [https://codeforces.com/problemset/problem/133/A](https://codeforces.com/problemset/problem/133/A)  

---

## Topics  
- Strings  
- Implementation  

## Constraints  
- Input: a string consisting of characters from the HQ9+ language  
- 1 ≤ `|s|` ≤ 100  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine whether the given program written in HQ9+ will produce any output.  
- In HQ9+, only the instructions `'H'`, `'Q'`, and `'9'` produce output:  
  - `'H'` prints "Hello, World!"  
  - `'Q'` prints the source code itself  
  - `'9'` prints the lyrics of "99 Bottles of Beer"  
- Therefore, the task reduces to checking if the input string contains any of these characters.  
- If the string contains `'H'`, `'Q'`, or `'9'`, output `"YES"`. Otherwise, output `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where `n` is the length of the string, since we scan through it once.  
- **Space Complexity:** `O(1)`, only a boolean flag is used.  
