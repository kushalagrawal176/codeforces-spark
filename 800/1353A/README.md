# Problem Number - 1353A Most Unstable Array

**Problem Link:** [https://codeforces.com/problemset/problem/1353/A](https://codeforces.com/problemset/problem/1353/A)

---

## Topics
- Implementation  
- Math  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `n`, `m` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum possible sum of absolute differences between consecutive elements in an array of length `n`, where each element is between `1` and `m`.  
- Key observations:
  - If `n = 1`, there are no consecutive pairs, so the result is `0`.  
  - If `n = 2`, the maximum difference comes from choosing the smallest and largest values, giving a result of `m`.  
  - If `n ≥ 3`, we can place extremes (`1` and `m`) multiple times to maximize instability. The maximum achievable sum is `2 * m`.  
- Thus, the solution is:
  - `0` if `n == 1`  
  - `m` if `n == 2`  
  - `2 * m` if `n ≥ 3`  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since the answer is computed directly using conditions.  
- **Space Complexity:** `O(1)`, only constant space is used.  
