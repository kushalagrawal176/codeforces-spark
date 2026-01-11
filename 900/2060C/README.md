# Problem Number - 2060C Game of Mathletes  
**Problem Link:** [https://codeforces.com/problemset/problem/2060/C](https://codeforces.com/problemset/problem/2060/C)  

---

## Topics
- Two Pointers  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 2 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `k` ≤ 2 × n
- Array elements are integers in the range `[1, n] ` 
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are asked to count the number of **pairs (i, j)** such that `arr[i] + arr[j] = k`.  
- Key observation:  
  - Sorting the array allows us to use the **two-pointer technique** efficiently.  
  - Start with one pointer at the beginning (`i = 0`) and one at the end (`j = n-1`).  
  - If `arr[i] + arr[j] == k`, we found a valid pair → increment count, move both pointers inward.  
  - If `arr[i] + arr[j] < k`, move `i++` to increase the sum.  
  - If `arr[i] + arr[j] > k`, move `j--` to decrease the sum.  
- This ensures we check all possible pairs in **O(n)** time after sorting.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting.  
- **Space Complexity:** `O(n)`, for storing the array.  