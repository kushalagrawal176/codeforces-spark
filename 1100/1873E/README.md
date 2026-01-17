# Problem Number - 1873E Building an Aquarium  
**Problem Link:** [https://codeforces.com/problemset/problem/1873/E](https://codeforces.com/problemset/problem/1873/E)  
---
## Topics
- Binary Search  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴ 
- 1 ≤ `n` ≤ 2 ⋅ 10⁵  
- 1 ≤ `x` ≤ 10⁹  
- 1 ≤ `a[i]` ≤ 10⁹  
- Sum of n across all test cases ≤ 2 ⋅ 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are asked to determine the maximum possible water level `h` that can be achieved in the aquarium after pouring exactly `x` units of water.  
- Each aquarium section has an initial height `a[i]`. To raise it to level `h`, we need `(h - a[i])` units of water if `h > a[i]`.  
- The total water required for a given `h` is the sum of these values across all sections.  
- The problem reduces to finding the **maximum `h` such that total water ≤ x**.  
- This can be solved using **binary search**:
  - Search between `0` and `max(a) + x`.  
  - For each midpoint `mid`, compute the water needed.  
  - If water needed ≤ x, update answer and move right (try higher `h`).  
  - Otherwise, move left (try lower `h`).  
- The binary search ensures we efficiently find the maximum feasible water level.

## Time and Space Complexity
- **Time Complexity:** `O(n log(max(a) + x))`, where `O(n)` is for computing water needed per check and log factor comes from binary search.  
- **Space Complexity:** `O(n)`, for storing the aquarium heights.  
