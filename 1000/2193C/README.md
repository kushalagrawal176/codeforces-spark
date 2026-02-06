# Problem Number - 2193C Replace and Sum  
**Problem Link:** [https://codeforces.com/problemset/problem/2193/C](https://codeforces.com/problemset/problem/2193/C)  

---

## Topics
- Arrays  
- Prefix Sum  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n`, `q` ≤ 2 × 10⁵  
- 1 ≤ `a[i]`, `b[i]` ≤ 10⁴  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given two arrays `a` and `b` of length `n`.  
- Step 1: Replace each element `a[i]` with `max(a[i], b[i])`. This ensures we always keep the larger value.  
- Step 2: Transform `a` into a suffix maximum array. For each index `i` from right to left, set `a[i] = max(a[i], a[i+1])`. This guarantees that every prefix query considers the maximum possible values.  
- Step 3: Convert `a` into a prefix sum array. This allows answering range sum queries efficiently in O(1).  
- Step 4: For each query `(l, r)`, compute the sum in range using prefix sums:  answer = a[r] - (l > 0 ? a[l-1] : 0)
  
- This approach ensures that queries are answered quickly after preprocessing.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` for preprocessing (max replacement, suffix max, prefix sum).  
  - `O(1)` per query using prefix sums.  
  - Overall: `O(n + q)` per test case.  
- **Space Complexity:**  
  - `O(n)` for storing arrays `a` and `b`.  
  - No extra space beyond input arrays and prefix sums.  