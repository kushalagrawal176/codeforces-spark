# Problem Number - 1380A Three Indices  
**Problem Link:** [https://codeforces.com/problemset/problem/1380/A](https://codeforces.com/problemset/problem/1380/A)  

---

## Topics  
- Implementation  
- Arrays  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 200 (number of test cases)  
- 3 ≤ `n` ≤ 1000 (length of the array)  
- 1 ≤ `arr[i]` ≤ `n` (array elements)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to find three indices `(i, j, k)` such that `i < j < k` and the middle element `arr[j]` is strictly greater than both its neighbors (`arr[i]` and `arr[k]`).  
- This essentially means we are looking for a **peak element** in the array that has both a smaller element before and after it.  
- Strategy:  
  1. Iterate through the array from index `1` to `n-2` (since the first and last elements cannot be peaks).  
  2. Check if `arr[i] > arr[i-1] && arr[i] > arr[i+1]`.  
  3. If found, output "YES" and the indices `(i, i+1, i+2)` in **1-based indexing**.  
  4. If no such element exists, output "NO".  

This works because the problem only requires **one valid triplet** if it exists, not all possible ones.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(1)`, only a few variables are used for tracking.  
