# Problem Number - 977B Two-gram  
**Problem Link:** [https://codeforces.com/problemset/problem/977/B](https://codeforces.com/problemset/problem/977/B)  

---

## Topics
- Strings  
- Hashing / Maps  
- Implementation  

## Constraints
- 2 ≤ `n` ≤ 100 (length of the string)  
- String consists only of uppercase English letters  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to find the most frequent **two-character substring (two-gram)** in the given string.  
- We iterate through the string and extract every substring of length 2.  
- Use a map (or hash map) to count the frequency of each two-gram.  
- Track the two-gram with the maximum frequency while iterating.  
- Finally, output the most frequent two-gram.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we scan the string once and process each two-gram.  
- **Space Complexity:** `O(n)`, for storing counts of two-grams in a map.  
