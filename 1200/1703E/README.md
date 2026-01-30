# Problem Number - 1703E Mirror Grid  

**Problem Link:** [https://codeforces.com/problemset/problem/1703/E](https://codeforces.com/problemset/problem/1703/E)  

---  

## Topics  
- Implementation  
- Simulation  
- Matrices  

## Constraints  
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n` ≤ 100  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem gives us an `n × n` binary grid and asks us to make the grid symmetric under 90-degree rotations with the minimum number of cell flips.  
- Each group of 4 cells that are rotationally symmetric (positions that map to each other under rotation) must be made identical.  
- For each such group, we count how many cells are `1` and how many are `0`.  
- The minimum flips required for that group is `min(count_of_ones, count_of_zeros)`.  
- Summing this over all groups gives the total minimum flips required.  

### Example of a 4-cell group:  
For cell `(i, j)`, the symmetric group includes:  
- `(i, j)`  
- `(j, n-1-i)`  
- `(n-1-i, n-1-j)`  
- `(n-1-j, i)`  

We calculate flips for each group and accumulate.  

## Time and Space Complexity  
- **Time Complexity:** `O(n²)`, since we check each cell in the top-left quadrant and process its symmetric group.  
- **Space Complexity:** `O(n²)` for storing the grid, though only O(1) extra space is needed for calculations.  
