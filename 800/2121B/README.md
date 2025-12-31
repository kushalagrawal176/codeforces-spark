# Problem Number - 2121B Above the Clouds  

**Problem Link:** [https://codeforces.com/problemset/problem/2121/B](https://codeforces.com/problemset/problem/2121/B)  

---

## Topics  
- Strings  
- Implementation  
- Hashing / Frequency Counting  

## Constraints  
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 3 ≤ `n` ≤ 10^5 (length of string)  
- String `s` consists of lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given a string `s` of length `n`.  
- The first and last characters are marked as "special".  
- The task is to check if any character in the middle of the string (from index `1` to `n-2`) has already appeared as one of the special characters.  
- Approach:  
  1. Store the first and last characters in a frequency map.  
  2. Traverse the middle characters of the string.  
  3. If any middle character is already present in the map, then the answer is `"YES"`.  
  4. Otherwise, after checking all, the answer is `"NO"`.  
- This ensures we detect overlap between middle characters and the special boundary characters.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, as we only store character frequencies (bounded by alphabet size).  
