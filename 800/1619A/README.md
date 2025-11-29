# Problem Number - 1619A Square String?  
**Problem Link:** [https://codeforces.com/problemset/problem/1619/A](https://codeforces.com/problemset/problem/1619/A)  

---

## Topics  
- Implementation  
- Strings  

---

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `|s|` ≤ 100 (length of string)  
- String consists of lowercase English letters  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The problem asks whether a given string `s` can be considered a **square string**.  
- A string is a square string if:  
  - Its length is even.  
  - The first half of the string is identical to the second half.  

**Steps to solve:**  
1. Read the number of test cases `t`.  
2. For each string `s`:  
   - If the length of `s` is odd → output `"NO"`.  
   - Otherwise, compare the first half with the second half character by character.  
   - If all characters match → output `"YES"`.  
   - Else → output `"NO"`.  

**Example:**  
- Input: `s = "abab"`  
  - Length = 4 (even).  
  - First half = `"ab"`, second half = `"ab"`.  
  - Both halves match → output `"YES"`.  

- Input: `s = "abc"`  
  - Length = 3 (odd).  
  - Cannot be a square string → output `"NO"`.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where `n` is the length of the string (comparison of halves).  
- **Space Complexity:** `O(1)`, only constant space used for flags and counters.  
