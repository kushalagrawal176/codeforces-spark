# Problem Number - 1335B Construct the String  
**Problem Link:** [https://codeforces.com/problemset/problem/1335/B](https://codeforces.com/problemset/problem/1335/B)  

---

## Topics
- Strings  
- Implementation  
- Constructive Algorithms  

## Constraints
- 1 ≤ `t` ≤ 2000 (number of test cases)  
- 1 ≤ `a` ≤ `n` ≤ 2000  
- 1 ≤ `b` ≤ `min(a, 26)`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We need to construct a string of length `n` such that every substring of length `a` contains exactly `b` distinct characters.  
- A simple constructive approach works:  
  1. Use the first `b` lowercase letters of the alphabet (`a, b, c, ...`).  
  2. Repeat them cyclically to build the string of length `n`.  
  3. This guarantees that any substring of length `a` will contain exactly `b` distinct characters.  
- Implementation detail:  
  - For each position `i` in the string, assign the character `'a' + (i % b)`.  
  - This cycles through the first `b` letters repeatedly until the string reaches length `n`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we construct the string character by character.  
- **Space Complexity:** `O(n)`, for storing the constructed string.  
