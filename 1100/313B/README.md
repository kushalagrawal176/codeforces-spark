# Problem Number - 313B Ilya and Queries  
**Problem Link:** [https://codeforces.com/problemset/problem/313/B](https://codeforces.com/problemset/problem/313/B)  
---
## Topics
- Prefix Sums
- String Processing
- Implementation

## Constraints
- 1 ≤ `|s|` ≤ 10⁵  
- 1 ≤ `t` ≤ 10⁵  
- 1 ≤ `l` < `r` ≤ `|s|`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks to answer multiple queries on a string `s` where each query `(l, r)` requires counting the number of positions `i` such that `s[i] = s[i+1]` within the substring from `l` to `r`.  
- A direct approach would be too slow (O(n × t)), so we need preprocessing.  
- Use a **prefix sum array**:
  - Define `a[i]` as the number of adjacent equal pairs up to index `i`.  
  - For each position `i` (from 1 to n-1), if `s[i] == s[i-1]`, increment the count; otherwise carry forward the previous value.  
- For each query `(l, r)`, the answer is simply `a[r-1] - a[l-1]`.  
- This allows answering each query in O(1) after O(n) preprocessing.

## Time and Space Complexity
- **Time Complexity:** `O(n + t)`, where O(n) is for preprocessing and O(1) per query.  
- **Space Complexity:** `O(n)`, for storing the prefix sum array.  
