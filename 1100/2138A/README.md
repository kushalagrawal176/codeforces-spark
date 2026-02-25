# Problem Number - 2138A Cake Assignment

**Problem Link:** [https://codeforces.com/problemset/problem/2138/A](https://codeforces.com/problemset/problem/2138/A)

---

## Topics
- Implementation
- Math
- Simulation
- BitMasks

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `k` ≤ 60  
- 1 ≤ `x` < 2ᵏ⁺¹ - 1  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem involves dividing a cake into two parts represented by numbers `x` and `y`, where `y = 2^(k+1) - x`.  
- At each step, the smaller part is doubled, and the larger part is reduced by the smaller part.  
- This process continues until both parts become equal.  
- Each operation is recorded as either `1` (if `x` was smaller) or `2` (if `y` was smaller).  
- The task is to output the number of operations performed and the sequence of operations.  

### Key Observations
- The process is essentially simulating a balancing act between `x` and `y`.  
- Doubling the smaller and subtracting from the larger ensures convergence.  
- The sequence of operations can be built iteratively until equality is reached.  

## Time and Space Complexity
- **Time Complexity:** `O(k)`, since in the worst case the number of operations is bounded by the exponent `k`.  
- **Space Complexity:** `O(k)`, for storing the sequence of operations.  
