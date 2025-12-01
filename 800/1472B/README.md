# Problem Number - 1472B Fair Division

**Problem Link:** [https://codeforces.com/problemset/problem/1472/B](https://codeforces.com/problemset/problem/1472/B)

---

## Topics
- Implementation  
- Greedy  
- Math  
- DP  

## Constraints
- 1 ≤ `t` ≤ 10000 (number of test cases)  
- 1 ≤ `n` ≤ 100 (number of coins)  
- Each coin value is either `1` or `2`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to divide coins into two groups with equal sum.  
- Since coins are only of value `1` or `2`, the total sum of coins determines feasibility:  
  1. If the total sum is **odd**, division is impossible (`NO`).  
  2. If the total sum is **even**, check if half of the sum can be formed:  
     - If `(sum / 2)` is even, division is always possible (`YES`).  
     - If `(sum / 2)` is odd, we need at least two coins of value `1` to balance the partition.  
- Thus, the answer depends on the parity of the sum and the availability of `1`-value coins.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through all coins to compute the sum and counts.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  
