# Problem Number - 61A Ultra-Fast Mathematician  
**Problem Link:** [https://codeforces.com/problemset/problem/61/A](https://codeforces.com/problemset/problem/61/A)  

---

## Topics  
- Strings  
- Implementation  
- Bit Manipulation  

## Constraints  
- Input: Two binary strings of equal length  
- 1 ≤ `length of each string` ≤ 100  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to simulate the work of an "ultra-fast mathematician" who performs a bitwise XOR operation on two binary strings.  
- For each position `i` in the strings:  
  - If the bits are the same (`0` and `0` or `1` and `1`), the result is `0`.  
  - If the bits are different (`0` and `1` or `1` and `0`), the result is `1`.  
- This is equivalent to performing XOR on each pair of characters.  
- Construct the resulting string by iterating through both input strings and applying the above rule.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where `n` is the length of the binary strings, since we check each character once.  
- **Space Complexity:** `O(n)`, for storing the resulting string.  
