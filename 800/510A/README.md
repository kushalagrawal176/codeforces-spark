# Problem Number - 510A Fox And Snake  
**Problem Link:** [https://codeforces.com/problemset/problem/510/A](https://codeforces.com/problemset/problem/510/A)  

---

## Topics
- Implementation
- Simulation
- Strings

## Constraints
- 3 ≤ `n`, `m` ≤ 50  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to print a snake pattern on an `n × m` grid.  
- Rules:
  - Odd rows (1, 3, 5, …) are completely filled with `#`.  
  - Even rows alternate between having a `#` at the **end** or at the **start**, with the rest filled by `.`.  
- Approach:
  1. Iterate through each row from 1 to `n`.  
  2. If the row index is odd → print `m` times `#`.  
  3. If the row index is even:
     - If it’s the first even row, place `#` at the end.  
     - Next even row, place `#` at the start.  
     - Alternate this placement for subsequent even rows.  
  4. Continue until all rows are printed.  
- This direct simulation works efficiently given the small constraints.

## Time and Space Complexity
- **Time Complexity:** `O(n × m)`, since we generate each character of the grid.  
- **Space Complexity:** `O(1)`, only constant space used for counters and direction tracking.
