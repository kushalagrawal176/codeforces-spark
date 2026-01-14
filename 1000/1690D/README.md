# Problem Number - 1690D Black and White Stripe  
**Problem Link:** [https://codeforces.com/problemset/problem/1690/D](https://codeforces.com/problemset/problem/1690/D)  

---

## Topics
- Strings  
- Sliding Window  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `k` ≤ `n` ≤ 2 ⋅ 10⁵  
- String consists of only characters `B` and `W`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of `W` characters to be changed into `B` so that there exists a substring of length `k` consisting entirely of `B`.  
- Strategy:  
  - Use a **sliding window** of size `k` across the string.  
  - Count the number of `W` characters in the current window.  
  - Track the minimum count of `W` across all windows.  
  - This minimum represents the least number of changes required.  

- The sliding window ensures efficient computation without recalculating counts from scratch for each substring.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each character is processed once in the sliding window.  
- **Space Complexity:** `O(1)`, only counters are used.  
