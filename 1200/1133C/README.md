# Problem Number - 1133C Balanced Team  
**Problem Link:** [https://codeforces.com/problemset/problem/1133/C](https://codeforces.com/problemset/problem/1133/C)  
---
## Topics
- Two Pointers
- Sorting
- Implementation

## Constraints
- 1 ≤ `n` ≤ 2 ⋅ 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the largest possible team such that the skill difference between the strongest and weakest member is `at most 5`.  
- First, sort the array of skill levels. This ensures that any valid team will be a contiguous subarray.  
- Use a **two-pointer (sliding window)** approach:
  - Maintain two indices `l` and `r` representing the current window.  
  - Expand `r` while the difference `a[r] - a[l] ≤ 5`.  
  - If the difference exceeds 5, increment `l` to shrink the window.  
  - Track the maximum window size (`r - l`) throughout.  
- This guarantees the largest team size is found efficiently.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` due to sorting, plus `O(n)` for the two-pointer traversal. Overall `O(n log n)`.  
- **Space Complexity:** `O(1)` additional space, aside from the input array.  
