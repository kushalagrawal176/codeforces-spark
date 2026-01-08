# Problem Number - 1985D Manhattan Circle  
**Problem Link:** [https://codeforces.com/problemset/problem/1985/D](https://codeforces.com/problemset/problem/1985/D)  

---

## Topics
- Implementation  
- Geometry  
- Math  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n ⋅ m` ≤ 2 ⋅ 10⁵
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem provides a grid of size `n × m` containing `.` and `#`.  
- The `#` cells form a circle in Manhattan distance. The task is to find the center of this circle.  
- Observation: The center of the circle is simply the average of the coordinates of all `#` cells.  
- Approach:  
  - Traverse the grid and record the positions of all `#` cells.  
  - Maintain sums of row indices (`si`) and column indices (`sj`) along with a count (`cnt`).  
  - The center coordinates are `(si / cnt, sj / cnt)`.  
- This works because the circle is symmetric in Manhattan distance, so the average of all marked cells gives the exact center.  

## Time and Space Complexity
- **Time Complexity:** `O(n × m)`, since we scan the entire grid once.  
- **Space Complexity:** `O(1)`, only constant space used for sums and counters.  
