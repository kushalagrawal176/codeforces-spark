# Problem Number - 2094B Bobritto Bandito  

**Problem Link:** [https://codeforces.com/problemset/problem/2094/B](https://codeforces.com/problemset/problem/2094/B)  

---

## Topics  
- Implementation  
- Simulation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 2000 (total days)  
- 1 ≤ `m` ≤ `n` (target day)  
- `-n` ≤ `l` ≤ 0 ≤ `r` ≤ `n` (infected segment after n days)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The infection starts at house `0` and spreads outward by one house per day on both sides.  
- After `n` days, the infected segment length is `n + 1`. We are given the segment `[l, r]` representing the infected range after `n` days.  
- The task is to determine any valid segment `[l′, r′]` that could represent the infected range after `m` days.  
- Key observations:  
  - On day `m`, the infected segment length must be `m + 1`.  
  - If `0 + m ≤ r`, then the segment can be `[0, m]`.  
  - If `0 + m > r`, then the segment can be `[r - m, r]`.  
  - If `0 - m ≥ l`, then the segment can be `[0 - m, 0]`.  
- These conditions ensure that the chosen segment is valid and consistent with the infection spread rules.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since the solution relies on direct conditional checks.  
- **Space Complexity:** `O(1)`, only constant space is used.  
