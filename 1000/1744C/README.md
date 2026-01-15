# Problem Number - 1744C Traffic Light  

**Problem Link:** [https://codeforces.com/problemset/problem/1744/C](https://codeforces.com/problemset/problem/1744/C)  

---

## Topics  
- Implementation  
- String Manipulation  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (length of the string)  
- The string consists of characters `'r'`, `'y'`, and `'g'`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The traffic light string is circular, meaning after the last character, it loops back to the first.  
- We are given a target color `c`. The goal is to find the maximum time it takes for a person standing at a light of color `c` to reach the next green (`'g'`).  
- To handle the circular nature, duplicate the string (`s + s`).  
- Traverse the string from right to left:  
  - Track the last position where `'g'` appears.  
  - For each occurrence of character `c`, compute the distance to the nearest `'g'` to its right.  
  - Update the maximum distance found.  
- The result is the maximum waiting time across all positions of color `c`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we traverse the string once.  
- **Space Complexity:** `O(n)`, due to storing the duplicated string.  
