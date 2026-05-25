# Problem Number - 1722A Spell Check  
**Problem Link:** [https://codeforces.com/problemset/problem/1722/A](https://codeforces.com/problemset/problem/1722/A)  

---

## Topics
- Implementation
- String manipulation
- Sorting 

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 10 (length of string)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks us to check if the given string is a permutation of the word `"Timur"`.  
- Since `"Timur"` has exactly 5 distinct characters, the first check is whether the string length `n` equals 5.  
- If not, the answer is immediately `"NO"`.  
- If `n == 5`, we need to verify that the string contains all characters of `"Timur"` exactly once.  
- A simple way to do this is:
  - Sort the input string.  
  - Sort the target string `"Timur"`.  
  - Compare the two sorted strings. If they match, output `"YES"`, otherwise `"NO"`.  

This approach ensures correctness because sorting aligns characters in a deterministic order, making comparison straightforward.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the string of length `n`. Since `n` is at most 10, this is efficient. OR `O(1)`, brute force manual checking
- **Space Complexity:** `O(1)`, only constant extra space is used.  
