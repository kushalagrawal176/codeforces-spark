# Problem Number - 600B Queries about less or equal elements  
**Problem Link:** [https://codeforces.com/problemset/problem/600/B](https://codeforces.com/problemset/problem/600/B)  

---

## Topics
- Binary Search  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `n`, `m` ≤ 2 × 10⁵  
- -10⁹ ≤ `a[i]`, `b[j]` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to answer `m` queries: for each query value `b[j]`, determine how many elements in array `a` are **less than or equal to `b[j]`**.  
- **Step 1:** Sort the array `a`.  
- **Step 2:** For each query `b[j]`, perform a binary search to find the index of the first element greater than `b[j]`.  
- **Step 3:** The number of elements ≤ `b[j]` is simply the position of that index (or equivalently, `upper_bound(a.begin(), a.end(), b[j]) - a.begin()` in C++).  
- This ensures efficient query handling.  

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting: `O(n log n)`.  
  - Each query: `O(log n)`.  
  - Total: `O(n log n + m log n)`.  
- **Space Complexity:** `O(n)`, for storing the array.  
