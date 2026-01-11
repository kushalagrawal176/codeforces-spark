# Problem Number - 1440B Sum of Medians  
**Problem Link:** [https://codeforces.com/problemset/problem/1440/B](https://codeforces.com/problemset/problem/1440/B)  

---

## Topics
- Greedy  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n`, `k` ≤ 1000  
- 0 ≤ `a[i]` ≤ 10⁹ (total array size across all test cases)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given `k` arrays, each of size `n`. All arrays are merged into one sorted array of size `n*k`.  
- The task is to find the **sum of medians** of each of the `k` arrays.  
- Key observation:  
  - Since the arrays are merged and sorted, the medians of each array can be directly picked from specific positions in the sorted array.  
  - For each array of size `n`, the median is located at position `(n/2 + 1)` from the end of that array segment.  
  - Therefore, starting from the end of the sorted array, we pick every `(n/2 + 1)`-th element for `k` times.  
- Formula:  
  - Sum = Σ (a[n*k - i*(n/2 + 1)]) for i = 1 to k  

## Time and Space Complexity
- **Time Complexity:** `O(n*k)`, for reading input and computing sum.  
- **Space Complexity:** `O(n*k)`, for storing the array.  