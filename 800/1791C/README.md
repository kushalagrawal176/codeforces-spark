# Problem Number - 1791C Prepend and Append  

**Problem Link:** [https://codeforces.com/problemset/problem/1791/C](https://codeforces.com/problemset/problem/1791/C)  

---

## Topics  
- Implementation  
- Two Pointers  

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10^3 (length of string per test case)  
- The string consists of characters `'0'` and `'1'`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to repeatedly remove characters from both ends of the string if they are **different**.  
- If the first and last characters are equal, the process stops.  
- The task is to output the length of the remaining string after performing all possible removals.  
- Approach:  
  1. Use two pointers: `left` starting at 0 and `right` starting at `n - 1`.  
  2. While `left < right` and `s[left] != s[right]`, move inward (`left++`, `right--`).  
  3. Once the loop ends, the remaining length is `right - left + 1`.  
- This works because each removal reduces the string size by 2, and the process stops when both ends match.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since in the worst case we may traverse half the string.  
- **Space Complexity:** `O(1)`, only pointers and counters are used.  
