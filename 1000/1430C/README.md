# Problem Number - 1430C Numbers on Whiteboard  
**Problem Link:** [https://codeforces.com/problemset/problem/1430/C](https://codeforces.com/problemset/problem/1430/C)  

---

## Topics
- Greedy
- Simulation 
- Implementation

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 2 ≤ `n` ≤ 2 ⋅ 10⁵ (size of the whiteboard numbers)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem starts with numbers from `1` to `n` written on a whiteboard.  
- At each step, we pick two numbers `x` and `y`, erase them, and write `ceil((x + y) / 2)` back.  
- The goal is to reduce the board to a single number (minimum possible) while outputting the sequence of operations.  

### Key Observations:
- To minimize complexity, we can always merge the largest two numbers first (`n` and `n-1`).  
- After merging, the new number is approximately `n`, so we keep merging it with the next largest available number.  
- This greedy strategy ensures we reach the final single number efficiently.  
- The first line of output is always `2` (the final number left after all merges).  
- Then we print the sequence of pairs merged step by step.  

### Example:
For `n = 4`:  
- Start with numbers {1, 2, 3, 4}  
- Merge (4, 3) → ceil(7/2) = 4 → board becomes {1, 2, 4}  
- Merge (4, 2) → ceil(6/2) = 3 → board becomes {1, 3}  
- Merge (3, 1) → ceil(4/2) = 2 → board becomes {2}  

Output:  
2
4 3
4 2
3 1

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we perform `n-1` merges.  
- **Space Complexity:** `O(1)`, only storing a few variables for simulation.  
