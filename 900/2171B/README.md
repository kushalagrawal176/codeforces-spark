# Problem Number - 2171B Yuu Koito and Minimum Absolute Sum  
**Problem Link:** [https://codeforces.com/problemset/problem/2171/B](https://codeforces.com/problemset/problem/2171/B)  

---

## Topics
- Implementation  
- Arrays  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 2 ≤ `n` ≤ 2 × 10⁵  
- -1 ≤ `a[i]` ≤ 10⁶  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given an array of size `n` that may contain `-1` values.  
- The task is to replace `-1` values with integers such that the **absolute difference between the first and last element** is minimized.  
- Key observations:  
  - For all middle elements (indices 1 to n-2), if they are `-1`, we can safely replace them with `0` since they do not affect the absolute difference between the first and last elements.  
  - For the first and last elements:  
    - If both are `-1`, set both to `0`.  
    - If only one is `-1`, set it equal to the other end to minimize the difference.  
    - If neither is `-1`, keep them unchanged.  
- Finally, compute `abs(a[n-1] - a[0])` and print the modified array.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for scanning and replacing values.  
- **Space Complexity:** `O(n)`, for storing the array.  