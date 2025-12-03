# Problem Number - 1760B Atilla's Favorite Problem  
**Problem Link:** https://codeforces.com/problemset/problem/1760/B  

---

## Topics  
- Implementation  
- Strings  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 100 (length of the string)  
- String consists of lowercase Latin letters (`a`–`z`)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks for Atilla’s favorite letter in a given string.  
- Atilla considers the "favorite" letter to be the lexicographically largest character in the string.  
- Since the alphabet is ordered (`a` = 1, `b` = 2, …, `z` = 26), the task reduces to finding the maximum character in the string and outputting its position in the alphabet.  
- Steps:  
  1. For each test case, read the string.  
  2. Traverse all characters and keep track of the maximum character.  
  3. Convert this character to its alphabet position using `(ch - 'a' + 1)`.  
  4. Print the result.  

This is a straightforward implementation problem with no complex logic.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, where `n` is the length of the string (to find the maximum character).  
- **Space Complexity:** `O(1)`, only constant space used for tracking the maximum character.  
