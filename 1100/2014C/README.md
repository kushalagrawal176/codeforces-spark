# Problem Number - 2014C Robin Hood in Town  
**Problem Link:** [https://codeforces.com/problemset/problem/2014/C](https://codeforces.com/problemset/problem/2014/C)  

---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (number of townspeople)  
- 1 ≤ `a[i]` ≤ 10⁶ (wealth of each person)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine the **minimum additional wealth** needed so that **more than half of total population** have wealth **strictly less than half of average wealth**.  
- Steps to solve:
  1. Compute the sum of all wealth values.  
  2. Sort the array to find the median wealth `mid = a[n/2]`.  
  3. Calculate the target wealth as `extra = 2 × mid × n + 1`.  
     - This ensures the doubled median wealth is strictly greater than the sum.  
  4. Compare `extra` with the current sum:  
     - If `n ≤ 2`, output `-1` (not possible).  
     - If `extra < sum`, output `0` (no extra wealth needed).  
     - Otherwise, output `extra - sum` (minimum additional wealth required).  

- The key insight is that the median wealth determines the threshold, and we only need to check whether doubling it (scaled by `n`) surpasses the total sum.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case due to sorting.  
- **Space Complexity:** `O(n)` for storing the wealth array.  