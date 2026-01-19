# Problem Number - 474B Worms  
**Problem Link:** [https://codeforces.com/problemset/problem/474/B](https://codeforces.com/problemset/problem/474/B)  

---

## Topics
- Implementation  
- Binary Search  
- Prefix Sums  

## Constraints
- 1 ≤ `n` ≤ 10⁵ (number of piles)  
- 1 ≤ `m` ≤ 10⁵ (number of queries)  
- 1 ≤ `worms in each pile` ≤ 1000  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Each pile contains a certain number of worms. Queries ask: given worm number `t`, which pile does it belong to?  
- To solve efficiently:  
  - Compute prefix sums of worms in piles. This gives the cumulative worm count up to each pile.  
  - For each query `t`, find the smallest index `i` such that `prefix[i] ≥ t`.  
  - This can be done using binary search (`lower_bound` in C++).  
- The answer is `i + 1` because piles are 1-indexed.  

## Time and Space Complexity
- **Time Complexity:** `O(n + m log n)`  
  - `O(n)` to build prefix sums.  
  - `O(log n)` per query using binary search.  
- **Space Complexity:** `O(n)`, for storing prefix sums.  
