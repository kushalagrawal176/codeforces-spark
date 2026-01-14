# Problem Number - 1791D Distinct Split  
**Problem Link:** [https://codeforces.com/problemset/problem/1791/D](https://codeforces.com/problemset/problem/1791/D)  

---

## Topics
- Strings  
- Hashing / Frequency Counting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 2 ≤ `n` ≤ 2 × 10⁵  
- Sum of `n` over all test cases ≤ 2 × 10⁵  
- String consists of lowercase English letters  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum possible sum of distinct characters when splitting a string `s` into two non-empty parts.  
- For each possible split point `i` (between prefix `s[0..i]` and suffix `s[i+1..n-1]`), we calculate:  
  - Distinct characters in the prefix.  
  - Distinct characters in the suffix.  
  - Their sum.  

- Naively recalculating distinct counts for each split would be too slow.  
- Instead, we use **frequency maps**:  
  - Count all characters in the suffix initially.  
  - Move characters one by one from suffix to prefix while updating counts.  
  - Track the maximum sum of distinct counts during this process.  

- This ensures each character is processed only once, giving an efficient solution.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each character is moved once from suffix to prefix.  
- **Space Complexity:** `O(26) ≈ O(1)`, since we only store counts of lowercase English letters.  