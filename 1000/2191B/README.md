# Problem Number - 2191B MEX Reordering  
**Problem Link:** [https://codeforces.com/problemset/problem/2191/B](https://codeforces.com/problemset/problem/2191/B)  

---

## Topics
- Arrays  
- Sorting  
- Hash Maps  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 500  
- 2 ≤ `n` ≤ 100  
- 0 ≤ `a[i]` ≤ `n`  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to reorder the array such that the sequence of **MEX values** (minimum excluded integers) of prefixes and suffixes are always different.  
- Steps:  
  1. Count occurrences of each number using a frequency map.  
  2. Sort the array to process elements in increasing order.  
  3. Maintain two maps:  
     - `mp` for remaining elements (suffix).  
     - `mp1` for processed elements (prefix).  
  4. At each step, compute:  
     - `l` = MEX of prefix (smallest integer not in `mp1`).  
     - `r` = MEX of suffix (smallest integer not in `mp`).  
  5. If at any point `l == r`, then the condition fails → output `"NO"`.  
  6. If the loop finishes without conflict, output `"YES"`.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n log n)` for sorting.  
  - `O(n)` for scanning and updating maps.  
  - Overall `O(n log n)` per test case.  
- **Space Complexity:**  
  - `O(n)` for storing frequency maps and the array.  
