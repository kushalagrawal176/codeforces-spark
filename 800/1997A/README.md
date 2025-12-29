# Problem Number - 1997A Strong Password  
**Problem Link:** [https://codeforces.com/problemset/problem/1997/A](https://codeforces.com/problemset/problem/1997/A)  

---

## Topics  
- Strings  
- Implementation  

---

## Constraints  
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `|s|` ≤ 10  
- `s` consists of lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

---

## Intuition / Approach  
- The task is to transform a given password string into a "strong" password.  
- A password is considered strong if it does not contain two consecutive identical characters.  
- Strategy:  
  1. Traverse the string from left to right.  
  2. If two consecutive characters are equal (`s[i] == s[i+1]`), insert a new character between them.  
     - The new character is chosen as the next letter in the alphabet `(ch - 'a' + 1) % 26 + 'a'`.  
     - This ensures the inserted character is different from the repeated one.  
     - Stop after the first modification.  
  3. If no consecutive identical characters are found, prepend the string with the next character after the first one.  
- This guarantees the resulting string will be strong.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)`, since we scan the string once.  
- **Space Complexity:** `O(|s|)`, for storing the modified string.  