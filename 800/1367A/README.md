# Problem Number - 1367A Short Substrings  

**Problem Link:** [https://codeforces.com/problemset/problem/1367/A](https://codeforces.com/problemset/problem/1367/A)  

---

## Topics  
- Implementation  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 2 ≤ `|s|` ≤ 100 (length of string per test case)  
- Strings consist of lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to reconstruct the original string `b` from a given string `s`.  
- Observation:  
  - The string `s` is formed by overlapping substrings of `b`.  
  - To recover `b`, we take the first two characters of `s`, and then every second character starting from index 3.  
- Steps:  
  1. Read the number of test cases `t`.  
  2. For each test case, read the string `s`.  
  3. Initialize the result with the first two characters of `s`.  
  4. Append every second character starting from index 3 until the end of `s`.  
  5. Print the reconstructed string.  

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)` per test case, since we iterate through the string once.  
- **Space Complexity:** `O(|s|)`, for storing the reconstructed string.  
