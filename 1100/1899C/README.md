# Problem Number - 1899C Yarik and Array  
**Problem Link:** [https://codeforces.com/problemset/problem/1899/C](https://codeforces.com/problemset/problem/1899/C)  

---

## Topics
- Dynamic Programming  
- Greedy  
- Arrays  
- 2 pointers

## Constraints
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `n` ≤ 2 × 10^5  
- -10^3 ≤ `a[i]` ≤ 10^3  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum sum of a contiguous subsequence where adjacent elements must have **different parity** (one odd, one even).  
- This is similar to Kadane’s algorithm (maximum subarray sum), but with an added parity constraint.  
- Maintain a running subsequence sum `s`.  
  - If the current element has the **same parity** as the previous one, restart the subsequence at `a[i]`.  
  - If the parity is **different**, extend the subsequence: `s = max(s + a[i], a[i])`.  
- Track the global maximum `sum` across all subsequences.  
- This ensures we always consider the best alternating-parity subsequence sum.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once.  
- **Space Complexity:** `O(1)`, only constant extra space used for tracking sums.  
