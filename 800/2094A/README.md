# Problem Number - 2094A Trippi Troppi  
**Problem Link:** https://codeforces.com/problemset/problem/2094/A  

---

## Topics  
- Implementation  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- Each test case consists of three non-empty strings  
- Each string contains only lowercase Latin letters (`a`–`z`)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem provides three strings for each test case.  
- The task is to construct a new string using the **first character** of each of the three given strings.  
- Steps:  
  1. Read the three strings.  
  2. Extract the first character from each string.  
  3. Concatenate these three characters in order.  
  4. Print the resulting string.  

This is a straightforward string manipulation problem with no complex logic.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since we only access the first character of each string.  
- **Space Complexity:** `O(1)`, only constant space used for storing the result string.  
