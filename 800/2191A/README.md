# Problem Number - 2191A Array Coloring  
**Problem Link:** [https://codeforces.com/problemset/problem/2191/A](https://codeforces.com/problemset/problem/2191/A)  

---

## Topics
- Arrays  
- Indexing  
- Parity Check  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 200  
- 2 ≤ `n` ≤ 100  
- 1 ≤ `a[i]` ≤ `n`  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given a permutation of size `n`. Each element’s position in the array is stored.  
- The task is to check whether the permutation can be “colored” such that adjacent values differ in index parity.  
- Steps:  
  1. Build an index array `a` where `a[val]` = position of value `val` in the permutation.  
  2. For each value `i` from 1 to `n`:  
     - If `i == 1`, check parity difference between positions of `1` and `2`.  
     - If `i == n`, check parity difference between positions of `n` and `n-1`.  
     - Otherwise, check parity difference between positions of `i` and both neighbors (`i-1` and `i+1`).  
  3. If any parity difference is even, the condition fails → output `"NO"`.  
  4. If all checks pass, output `"YES"`.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` per test case to build index array and check parity conditions. 
- **Space Complexity:**  
  - `O(n)` for storing index positions.  
