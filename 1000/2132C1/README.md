# Problem Number - 2132C1 The Cunning Seller (easy version)

**Problem Link:** [https://codeforces.com/problemset/problem/2132/C1](https://codeforces.com/problemset/problem/2132/C1)

---

## Topics
- Greedy
- Math
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The seller wants to maximize the number of coins earned by selling items in bundles of powers of 3.  
- For each bundle size `3^k`, the seller earns a specific number of coins based on the formula:  `coins = 3^(k+1) + k * 3^(k-1)`
- The greedy approach is to always subtract the largest possible power of 3 from `n` until `n` becomes 0.  
- Each time we subtract `3^k`, we add the corresponding coin value to the total.  
- This ensures that we maximize the number of coins while reducing `n` efficiently.

## Time and Space Complexity
- **Time Complexity:** `O(log n)`, since we repeatedly check decreasing powers of 3 until `n` becomes 0.  
- **Space Complexity:** `O(1)`, only constant space is used for variables.
