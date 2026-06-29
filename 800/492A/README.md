# Problem Number - 492A Vanya and Cubes  

**Problem Link:** [https://codeforces.com/problemset/problem/492/A](https://codeforces.com/problemset/problem/492/A)  

---

## Topics
- Implementation  
- Math 
- Greedy

## Constraints
- 1 ≤ `n` ≤ 10,000  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum number of **complete pyramid levels** that can be built using `n` cubes.  
- To build a pyramid:
  - Level 1 requires 1 cube.  
  - Level 2 requires 1 + 2 = 3 cubes.  
  - Level 3 requires 1 + 2 + 3 = 6 cubes.  
  - In general, level `k` requires the sum of the first `k` natural numbers = `k * (k + 1) / 2`.  
- The total cubes required for `l` levels is the sum of triangular numbers:  `Total cubes = Σ (i=1 to l) [ i * (i+1) / 2 ]`
  
- We keep adding levels until the required cubes exceed `n`.  
- The answer is the largest `l` such that the pyramid can be fully built with `n` cubes.  

## Time and Space Complexity
- **Time Complexity:** `O(l)`, where `l` is the number of levels (at most ~100 for n ≤ 10,000). This is efficient.  
- **Space Complexity:** `O(1)`, only constant space is used for accumulation.  
