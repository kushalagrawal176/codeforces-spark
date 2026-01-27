# Problem Number - 455A Boredom  
**Problem Link:** [https://codeforces.com/problemset/problem/455/A](https://codeforces.com/problemset/problem/455/A)  

---

## Topics
- Dynamic Programming  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `a[i]` ≤ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem is similar to the "House Robber" problem: if you take a number `x`, you cannot take `x-1` or `x+1`.  
- First, count the contribution of each number: for every occurrence of `x`, add `x` to `freq[x]`.  
- Define `dp[i]` as the maximum points achievable considering numbers up to `i`.  
- Recurrence relation:  
  - `dp[i] = max(dp[i-1], dp[i-2] + freq[i])`  
  - This means either skip `i` (take best up to `i-1`) or take `i` (add its contribution plus best up to `i-2`).  
- Initialize:  
  - `dp[0] = 0`, `dp[1] = freq[1]`.  
- The answer is `dp[maxValue]`, where `maxValue` is the largest number in the input.  

## Time and Space Complexity
- **Time Complexity:** `O(n + max(a[i]))`, since we process all input and then iterate through possible values up to 10⁵.  
- **Space Complexity:** `O(max(a[i]))`, for storing frequency and DP arrays.  
