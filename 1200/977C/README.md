# Problem Number - 977C Less or Equal  
**Problem Link:** [https://codeforces.com/problemset/problem/977/C](https://codeforces.com/problemset/problem/977/C)  

---

## Topics
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 2 × 10^5  
- 0 ≤ `k` ≤ n  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to find an integer `x` such that **exactly `k` elements in the array are less than or equal to `x`**.  
- Steps to solve:
  1. Sort the array.  
  2. If `k = 0`, then `x` must be smaller than the smallest element. If the smallest element is `1`, no valid answer exists (since `x` must be ≥ 1). Otherwise, `x = a[0] - 1`.  
  3. If `k > 0`, then candidate `x = a[k-1]`.  
  4. To ensure validity, check that `a[k-1]` is not equal to `a[k]` (to avoid having more than `k` elements ≤ `x`).  
- If no valid `x` exists, output `-1`.  

## Time and Space Complexity
- **Time Complexity:**  `O(n log n)` due to sorting the array.  
- **Space Complexity:** `O(n)` for storing the array elements.  