# Problem Number - 1829A Love Story  

**Problem Link:** [https://codeforces.com/problemset/problem/1829/A](https://codeforces.com/problemset/problem/1829/A)  

---

## Topics  
- Implementation  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- Each string has length exactly 10  
- Strings consist of lowercase English letters  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine how many characters differ between a given string `s` of length 10 and the fixed string `"codeforces"`.  
- For each test case:  
  1. Read the string `s`.  
  2. Compare each character of `s` with the corresponding character in `"codeforces"`.  
  3. Count the number of mismatches.  
  4. Print the mismatch count.  
- This is a straightforward character comparison problem.  

## Time and Space Complexity  
- **Time Complexity:** `O(10)` per test case, which simplifies to `O(1)`, since the string length is fixed.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  
