# Problem Number - 2009C The Legend of Freya the Frog  
**Problem Link:** [https://codeforces.com/problemset/problem/2009/C](https://codeforces.com/problemset/problem/2009/C)  
---
## Topics
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10^4  
- 0 ≤ `x`, `y` ≤ 10^9  
- 1 ≤ `k` ≤ 10^9  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Freya starts at (0,0) and alternates moves along the **x-axis** and **y-axis**, with each move allowing her to jump between 0 and `k` units.  
- To reach coordinate `(x,y)`, we need to calculate the minimum number of moves required.  
- For each axis:
  - The number of moves needed to cover distance `d` is `ceil(d / k)`.  
  - For `x`, moves are counted as odd steps; for `y`, moves are counted as even steps.  
- The total moves required is the maximum of:
  - `2 * moves_x - 1` (since the last x move can be odd-indexed),  
  - `2 * moves_y` (since y moves occur on even steps).  
- This ensures Freya reaches both coordinates exactly.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, as no extra data structures are used.  
