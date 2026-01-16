# Problem Number - 2123C Prefix Min and Suffix Max  
**Problem Link:** [https://codeforces.com/problemset/problem/2123/C](https://codeforces.com/problemset/problem/2123/C)  

---

## Topics  
- Arrays  
- Prefix/Suffix Computation  
- Implementation  
- Simulation  

---

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (array length)  
- 1 ≤ `a[i]` ≤ 10⁶ (array elements)  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- You are given an array `a` of length `n`. For each element `a[i]`, you need to determine whether it satisfies certain conditions based on prefix minimums and suffix maximums.  
- **Key idea:**  
  - Compute `mini[i]` = minimum of all elements before index `i`.  
  - Compute `maxi[i]` = maximum of all elements after index `i`.  
- For each position `i`:  
  - If `mini[i] == -1` (no prefix) or `maxi[i] == -1` (no suffix), mark as `"1"`.  
  - Else, if `mini[i] ≤ a[i]` and `maxi[i] ≥ a[i]`, mark as `"0"`.  
  - Otherwise, mark as `"1"`.  
- Construct the answer string by concatenating results for all positions.  

---

## Time and Space Complexity  
- **Prefix computation:** `O(n)`, scanning left to right.  
- **Suffix computation:** `O(n)`, scanning right to left.  
- **Final check:** `O(n)`, scanning all elements.  
- **Total Time Complexity:** `O(n)` per test case.  
- **Space Complexity:** `O(n)`, for storing prefix minimums and suffix maximums.  
