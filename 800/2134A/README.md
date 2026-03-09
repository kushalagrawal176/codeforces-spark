# Problem Number - 2134A Painting With Two Colors

**Problem Link:** [https://codeforces.com/problemset/problem/2134/A](https://codeforces.com/problemset/problem/2134/A)

---

## Topics
- Implementation  
- Parity / Symmetry  
- Math  

## Constraints
- 1 ≤ `t` ≤ 500  
- 1 ≤ `n` ≤ 10⁹  
- 1 ≤ `a`, `b` ≤ `n`  
- **Time limit per test:** 1 second  
- **Memory limit per test:** 256 megabytes  

## Intuition / Approach
- We are given a row of `n` cells, initially white.  
  - First, we paint `a` consecutive cells red.  
  - Then, we paint `b` consecutive cells blue.  
  - If a cell is painted both red and blue, its final color is blue.  
- The goal is to determine if there exists a choice of positions such that the final coloring is **symmetric** (i.e., cell `i` has the same color as cell `n+1-i` for all `i`).  

### Key Observations:
1. **Symmetry depends on parity:**  
   - For the grid to be symmetric, the placement of the blue segment must align with the symmetry axis.  
   - This requires `(n - b)` to be even, ensuring the blue segment can be centered symmetrically.  

2. **Red segment flexibility:**  
   - If `(n - a)` is even, the red segment can also be placed symmetrically.  
   - If not, symmetry can still be achieved if the red segment is "covered" by the blue segment (i.e., `a ≤ b`).  

3. **Final condition:**  
   - Symmetry is possible if:  
     - `(n - b) % 2 == 0` **AND**  
     - `((n - a) % 2 == 0 OR a ≤ b)`  

This leads directly to the implementation check.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case (just arithmetic checks).  
- **Space Complexity:** `O(1)`, no extra memory required.  