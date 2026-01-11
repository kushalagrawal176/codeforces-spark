# Problem Number - 1696B NIT Destroys the Universe  
**Problem Link:** [https://codeforces.com/problemset/problem/1696/B](https://codeforces.com/problemset/problem/1696/B)  

---

## Topics
- Implementation  
- Arrays  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10⁵  
- 0 ≤ `a[i]` ≤ 10⁹  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem asks us to determine the minimum number of operations required to destroy the universe (array).  
- Each operation can remove a contiguous segment of non-zero elements.  
- Key observation:  
  - The answer depends only on the number of **non-zero segments** in the array.  
  - If there are no non-zero segments → answer = 0.  
  - If there is exactly 1 non-zero segment → answer = 1.  
  - If there are 2 or more non-zero segments → answer = 2 (since we can always destroy them in at most 2 moves).  
- Implementation steps:  
  1. Traverse the array and count contiguous non-zero segments.  
  2. Cap the result at 2 using `min(2, cnt)`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for scanning the array.  
- **Space Complexity:** `O(1)`, only counters used.  