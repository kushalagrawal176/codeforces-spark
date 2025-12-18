# Problem Number - 1873D 1D Eraser  
**Problem Link:** [https://codeforces.com/problemset/problem/1873/D](https://codeforces.com/problemset/problem/1873/D)  

---

## Topics  
- Greedy  
- Implementation  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 2 × 10^5  
- 1 ≤ `k` ≤ `n`  
- Sum of n over all test cases ≤ 2 × 10^5  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to erase all `'B'` characters in the string using the minimum number of eraser strokes.  
- Each eraser stroke covers `k` consecutive positions.  
- A greedy approach works best:  
  - Traverse the string from left to right.  
  - When a `'B'` is found, use the eraser starting at that position.  
  - This erases up to `k` characters, so skip ahead by `k`.  
  - Increment the counter each time the eraser is used.  
- This ensures all `'B'` characters are erased with the minimum number of strokes.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we scan through the string once per test case.  
- **Space Complexity:** `O(1)`, only a counter and index variable are used.  
