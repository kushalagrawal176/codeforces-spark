# Problem Number - 160A Twins  
**Problem Link:** [https://codeforces.com/problemset/problem/160/A](https://codeforces.com/problemset/problem/160/A)  

---

## Topics  
- Greedy  
- Sorting  
- Implementation  

## Constraints  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `coin value` ≤ 100  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given `n` coins with different values. The goal is to determine the **minimum number of coins** one twin must take so that their total value is strictly greater than the sum of the remaining coins.  
- To minimize the number of coins, we should always take the **largest coins first**.  
- Steps:  
  1. Compute the total sum of all coins.  
  2. Sort the coins in ascending order.  
  3. Start picking coins from the largest to smallest, keeping track of the running sum.  
  4. Stop once the running sum becomes strictly greater than half of the total sum.  
- The number of coins picked at this point is the answer.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)`, due to sorting the coins.  
- **Space Complexity:** `O(n)`, for storing the coin values.  