# Problem Number - 1354B Ternary String  
**Problem Link:** [https://codeforces.com/problemset/problem/1354/B](https://codeforces.com/problemset/problem/1354/B)  

---

## Topics
- Two Pointers  
- Sliding Window  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 20000 (number of test cases)  
- 1 ≤ `|s|` ≤ 200000 (length of string per test case)  
- The string consists only of characters `'1'`, `'2'`, and `'3'`.  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We need to find the **shortest substring** that contains all three digits: `'1'`, `'2'`, and `'3'`.  
- A brute force approach checking all substrings would be too slow (`O(n²)`).  
- Instead, we use a **sliding window (two pointers)** technique:  
  1. Expand the `right` pointer until the window contains at least one '1', one '2', and one '3'.  
  2. Once valid, shrink the window from the `left` pointer to minimize its length while still containing all three digits.  
  3. Track the minimum length across all valid windows.  
- If no valid substring exists, output `0`.  

This approach ensures efficiency by scanning the string only once.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (each character processed at most twice).  
- **Space Complexity:** `O(1)`, only counters for `'1'`, `'2'`, and `'3'` are needed.  
