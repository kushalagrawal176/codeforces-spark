# Problem Number - 2075B Array Recoloring  

**Problem Link:** [https://codeforces.com/problemset/problem/2075/B](https://codeforces.com/problemset/problem/2075/B)  

---

## Topics  
- Arrays  
- Greedy  
- Sorting  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 2 ≤ `n` ≤ 5000 (array size)  
- 1 ≤ `k` ≤ `n`  
- 1 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to maximize the sum of selected elements after recoloring operations.  
- Two cases arise based on the value of `k`:  
  1. **If k ≥ 2:**  
     - We can select the largest `k+1` elements.  
     - Sorting the array and summing the top `k+1` values gives the maximum possible sum.  
  2. **If k = 1:**  
     - We can only recolor once, so the optimal sum involves either:  
       - The sum of the first and last elements, or  
       - The maximum of `(max(a[0], a[n-1]) + a[i])` for some middle element `a[i]`.  
     - We compute all possibilities and take the maximum.  

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(n log n)` when `k ≥ 2` (due to sorting).  
  - `O(n)` when `k = 1` (linear scan).  
- **Space Complexity:** `O(n)` for storing the array.  
