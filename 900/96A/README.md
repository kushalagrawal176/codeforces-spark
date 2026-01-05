# Problem Number - 96A Football  
**Problem Link:** [https://codeforces.com/problemset/problem/96/A](https://codeforces.com/problemset/problem/96/A)  

---

## Topics  
- Strings  
- Implementation  

## Constraints  
- Input: a binary string consisting of characters `0` and `1`  
- `Length of string` ≤ 100  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine if there exists a situation where **7 or more consecutive players** of the same team (`0` or `1`) are standing together.  
- This translates to checking if the string contains a substring of at least 7 identical consecutive characters.  
- Approach:  
  - Iterate through the string and count consecutive identical characters.  
  - If the count reaches 7 at any point, output `"YES"`.  
  - Otherwise, after checking the entire string, output `"NO"`.  
- Alternatively, this can be solved using built-in string search functions by checking if `"0000000"` or `"1111111"` exists as a substring.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where `n` is the length of the string, since we scan through it once.  
- **Space Complexity:** `O(1)`, only a few variables are used for counting.  
