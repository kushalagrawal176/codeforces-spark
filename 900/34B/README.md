# Problem Number - 34B Sale  
**Problem Link:** [https://codeforces.com/problemset/problem/34/B](https://codeforces.com/problemset/problem/34/B)  

---

## Topics
- Implementation  
- Greedy  
- Sorting  

## Constraints
- 1 ≤ `n` ≤ 100  
- 1 ≤ `m` ≤ `n`  
- -1000 ≤ `price` ≤ 1000  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum profit that can be obtained by selling at most `m` TVs.  
- Each TV has a price, which may be negative (meaning the shopkeeper pays you to take it).  
- To maximize profit:  
  1. Sort all prices in ascending order.  
  2. Pick the first `m` negative prices (the best deals).  
  3. Sum them up and take the absolute value, since profit is positive.  
- This greedy approach works because choosing the most negative values first maximizes the total gain.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the list of prices.  
- **Space Complexity:** `O(n)`, for storing the prices.  
