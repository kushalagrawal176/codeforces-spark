# Problem Number - 2047B Replace Character  

**Problem Link:** [https://codeforces.com/problemset/problem/2047/B](https://codeforces.com/problemset/problem/2047/B)  

---

## Topics
- Strings  
- Frequency Counting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 500  
- 1 ≤ `n` ≤ 10  
- String length = `n`  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks us to modify a given string by replacing **one occurrence of the least frequent character** with the **most frequent character**.  
- Steps to solve:
  1. Count the frequency of each character in the string.  
  2. Identify the character with the minimum frequency (`min_ch`) and the character with the maximum frequency (`max_ch`).  
     - If multiple characters have the same minimum or maximum frequency, choose the lexicographically smallest one for consistency.  
  3. Traverse the string and replace the **first occurrence** of `min_ch` with `max_ch`.  
  4. Print the modified string.  

- This ensures only one replacement is made, and the transformation is deterministic.  

## Time and Space Complexity
- **Time Complexity:**  
  - Counting frequencies: `O(n)`  
  - Finding min/max frequency characters: `O(26) ≈ O(1)`  
  - Replacing one character: `O(n)`  
  - Overall per test case: **O(n)**  

- **Space Complexity:**  
  - Frequency array of size 26: `O(26) ≈ O(1)`  
  - String storage: `O(n)`  
  - Overall: **O(n)**  