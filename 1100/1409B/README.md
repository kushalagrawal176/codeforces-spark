# Problem Number - 1409B Minimum Product

**Problem Link:** [https://codeforces.com/problemset/problem/1409/B](https://codeforces.com/problemset/problem/1409/B)

---

## Topics
- Greedy
- Math
- Implementation

## Constraints
- 1 ≤ `t` ≤ 2⋅10^4  
- 1 ≤ `a`, `b`, `x`, `y` ≤ 10^9  
- `x` ≤ `a`, `y` ≤ `b`  
- 1 ≤ `n` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given two numbers `a` and `b`, each with a minimum bound (`x` and `y` respectively).  
- We can perform at most `n` decrements in total, and the goal is to minimize the product `a × b`.  
- The key observation is that the optimal strategy is always one of two greedy approaches:
  1. **Reduce `a` first** as much as possible (down to `x`), then use remaining decrements on `b`.  
  2. **Reduce `b` first** as much as possible (down to `y`), then use remaining decrements on `a`.  
- Compute the product in both cases and take the minimum.  
- This works because reducing one variable maximally before touching the other ensures we explore both possible optimal paths.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we only perform constant-time calculations.  
- **Space Complexity:** `O(1)`, no extra space required beyond a few variables.  
