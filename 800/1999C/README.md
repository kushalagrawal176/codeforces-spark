# Problem Number - 1999C Showering  
**Problem Link:** [https://codeforces.com/problemset/problem/1999/C](https://codeforces.com/problemset/problem/1999/C)  

---

## Topics  
- Implementation  
- Greedy  
- Intervals  / Range

## Constraints  
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `n` ≤ 2*10^5  
- 1 ≤ `s`, `m` ≤ 10^9  
- 0 ≤ `l`, `r` ≤ `m`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem provides `n` intervals `[l, r]` representing times when Alex is occupied.  
- We need to check if there exists a continuous free segment of length at least `s` within the total time `0` to `m`.  
- Approach:  
  - Check the gap before the first interval: if `l ≥ s`, then a free segment exists.  
  - Check gaps between consecutive intervals: if `l - prev_r ≥ s`, then a free segment exists.  
  - Check the gap after the last interval: if `m - r ≥ s`, then a free segment exists.  
- If any of these conditions hold, output `"YES"`. Otherwise, output `"NO"`.  
- This greedy check ensures we only need to scan through the intervals once.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we iterate through all intervals once per test case.  
- **Space Complexity:** `O(1)`, only a few variables are used to track interval boundaries.  
