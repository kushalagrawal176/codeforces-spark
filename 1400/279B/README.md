# Problem Number - 279B Books  
**Problem Link:** [https://codeforces.com/problemset/problem/279/B](https://codeforces.com/problemset/problem/279/B)  

---

## Topics
- Two Pointers  
- Sliding Window  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `t` ≤ 10⁹  
- 1 ≤ `a[i]` ≤ 10⁴  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum number of consecutive books that can be read within a given total time `t`.  
- Each book has a reading time, and we need to find the longest contiguous subarray such that the sum of its elements does not exceed `t`.  
- A brute force approach of checking all subarrays would be too slow `(O(n^2))`, especially since `n` can be up to 10⁵.  
- Instead, we use the **sliding window (two pointers)** technique:  
  - Maintain a window `[j, i]` representing the current sequence of books.  
  - Expand the window by moving `i` forward and adding `a[i]` to the sum.  
  - If the sum exceeds `t`, shrink the window from the left by moving `j` forward and subtracting `a[j]` until the sum is valid again.  
  - Track the maximum window size (`i - j + 1`) during the process.  
- This ensures we only traverse the array once, achieving linear time complexity.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since each book is added and removed from the window at most once.  
- **Space Complexity:** `O(1)`, aside from storing the input array.  
