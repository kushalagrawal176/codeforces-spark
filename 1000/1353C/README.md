# Problem Number - 1353C Board Moves  

**Problem Link:** [https://codeforces.com/problemset/problem/1353/C](https://codeforces.com/problemset/problem/1353/C)  

---

## Topics  
- Implementation  
- Math  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 200 (number of test cases)  
- 1 ≤ `n` ≤ 5 ⋅ 10⁵ (size of the board, always odd)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks for the minimum number of moves required to bring all pieces from the corners of concentric squares to the center of the board.  
- The board is of size `n × n`, and the center is at position `(n/2, n/2)`.  
- Each concentric square layer contributes moves proportional to its distance from the center.  
- For layer `i` (where `i` ranges from 1 to `n/2`):  
  - The number of cells in the layer is `8 * i`.  
  - Each of these cells requires `i` moves to reach the center.  
  - Contribution of layer `i` = `8 * i * i`.  
- Summing over all layers gives the total number of moves:  
  - `ans = Σ (8 * i^2)` for `i = 1` to `n/2`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n/2) = O(n)` if computed directly with a loop, but can be optimized to `O(1)` using the summation formula for squares.  
- **Space Complexity:** `O(1)`, only constant space used for accumulation.  
