# Problem Number - 275A Lights Out  
**Problem Link:** [https://codeforces.com/problemset/problem/275/A](https://codeforces.com/problemset/problem/275/A)  
---

## Topics
- Implementation  
- Simulation  
- Bit Manipulation  

## Constraints
- Input is a 3×3 grid (9 integers total) between `0` to `100`.  
- Each integer represents the number of times a light button is pressed.  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The grid starts with all lights turned **on**.  
- Pressing a button toggles the state of that light and its four neighbors (up, down, left, right).  
- Since pressing a button an even number of times cancels out (light returns to original state), only the parity (odd/even) of presses matters.  
- For each cell `(i, j)`:  
  - If the number of presses is odd, toggle the cell and its neighbors.  
  - If the number of presses is even, do nothing.  
- After processing all cells, print the final state of the grid (1 = on, 0 = off).  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since the grid size is fixed (3×3).  
- **Space Complexity:** `O(1)`, only constant space used for the grid.  
