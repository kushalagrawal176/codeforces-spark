# Problem Number - 1851B Parity Sort  
**Problem Link:** [https://codeforces.com/problemset/problem/1851/B](https://codeforces.com/problemset/problem/1851/B)  

---

## Topics
- Implementation  
- Sorting  
- Parity  

## Constraints
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `n` ≤ 2*10^5  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether the array can be sorted while preserving the parity of each element’s position.  
- Observations:  
  - Sorting the array normally may change the parity (even/odd) of elements compared to their original positions.  
  - To check feasibility, compare the sorted array with the original array element by element.  
  - If for every index `i`, the parity of `a[i]` in the sorted array matches the parity of `a[i]` in the original array, then the answer is `"YES"`.  
  - Otherwise, the answer is `"NO"`.  
- Approach:  
  - Copy the original array into another array `b`.  
  - Sort the array `a`.  
  - Compare parity of each element in `a` and `b`.  
  - If all match → `"YES"`, else → `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` due to sorting.  
- **Space Complexity:** `O(n)` for storing the copy of the array.  
