# Problem Number - 1497C1 k-LCM (easy version)  

**Problem Link:** [https://codeforces.com/problemset/problem/1497/C1](https://codeforces.com/problemset/problem/1497/C1)  

---

## Topics  
- Number Theory  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 3 ≤ `n` ≤ 10^9 (value to be split)  
- `k` = 3 (fixed for easy version)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to split the integer `n` into exactly `k = 3` positive integers such that their sum is `n` and their **LCM is ≤ n/2**.  
- Observations:  
  - If `n` is odd → split as `(n/2, n/2, 1)`.  
  - If `n` is even and divisible by 4 → split as `(n/2, n/4, n/4)`.  
  - If `n` is even but not divisible by 4 → split as `((n/2 - 1), (n/2 - 1), 2)`.  
- These cases guarantee minimal LCM for `k = 3`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case (direct computation).  
- **Space Complexity:** `O(1)`, constant space usage.  
