# Problem Number - 1950D Product of Binary Decimals  
**Problem Link:** [https://codeforces.com/problemset/problem/1950/D](https://codeforces.com/problemset/problem/1950/D)  

---

## Topics
- Greedy  
- Number Theory  
- Bit Manipulation
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 5 ⋅ 10⁴  
- 1 ≤ `n` ≤ 10⁵  
- Time limit per test: 3 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- A **binary decimal** is a number whose decimal representation consists only of digits `0` and `1` (e.g., 1, 10, 11, 101).  
- The problem asks whether a given integer `n` can be expressed as a product of such binary decimals.  
- Direct brute force factorization is infeasible for large `n`. Instead, we use a greedy reduction strategy:  
  - Precompute all binary decimals up to a certain limit (in this case, numbers formed from binary strings of integers up to 31).  
  - For each test case, repeatedly divide `n` by these binary decimals whenever possible.  
  - If after all divisions `n` reduces to `1`, then it can be expressed as a product of binary decimals. Otherwise, it cannot.  
- This works because any valid product must be divisible by these binary decimal factors, and dividing greedily ensures we reduce `n` optimally.  

## Time and Space Complexity
- **Time Complexity:** `O(log n × k)`, where `k` is the number of binary decimal factors checked (constant, since we only go up to 31).  
- **Space Complexity:** `O(1)`, only storing a few temporary variables and strings.  
