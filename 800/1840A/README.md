# Problem Number - 1840A Cipher Shifer  
**Problem Link:** [https://codeforces.com/problemset/problem/1840/A](https://codeforces.com/problemset/problem/1840/A)  
---

## Topics
- Implementation  
- Strings  
- Simulation  
- 2 pointers

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 2 ≤ `n` ≤ 100 (length of the string)  
- String consists of lowercase English letters  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a cipher where the original message can be reconstructed by scanning the given string.  
- Start with a pointer at the first character (`ptr = 0`) and move through the string.  
- Whenever a character at position `i` matches the character at `ptr`, that character belongs to the decoded message.  
- After recording it, move the pointer to `i + 1` and continue scanning.  
- This greedy simulation ensures we decode the message correctly in one pass.   

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the string once.  
- **Space Complexity:** `O(n)` for storing the decoded message.  
