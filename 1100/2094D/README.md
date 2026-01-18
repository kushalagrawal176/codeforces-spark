# Problem Number - 2094D Tung Tung Sahur  

**Problem Link:** [https://codeforces.com/problemset/problem/2094/D](https://codeforces.com/problemset/problem/2094/D)  

---

## Topics  
- String Processing  
- Greedy  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `|p|` ≤ `|s|` ≤ 2 × 10⁵ (length of strings)  
- Total length of all strings across test cases ≤ 2 × 10⁵  
- Strings consist only of characters `L` and `R`  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- We are given two strings `p` (pattern) and `s` (sahur sequence).  
- Both strings alternate between blocks of `L` and `R`.  
- For each block of consecutive identical characters in `p`, the corresponding block in `s` must:  
  - Contain the same character.  
  - Have a length between `temp` (length in `p`) and `2 × temp`.  
- The algorithm:  
  1. Traverse both strings simultaneously.  
  2. Count consecutive characters (`temp` for `p`, `temp2` for `s`).  
  3. Check if `temp2` is valid (`temp ≤ temp2 ≤ 2 × temp`).  
  4. Alternate the expected character (`L` ↔ `R`).  
  5. If any mismatch occurs or strings end unevenly, output "NO".  
  6. Otherwise, output "YES".  

This greedy approach works because the sequence must strictly follow the alternating block structure with bounded expansion.  

## Time and Space Complexity  
- **Time Complexity:** `O(|p| + |s|)` per test case, since each string is traversed once.  
- **Space Complexity:** `O(1)`, only counters and a few variables are used.  
