# Problem Number - 2070A FizzBuzz Remixed  
**Problem Link:** [https://codeforces.com/problemset/problem/2070/A](https://codeforces.com/problemset/problem/2070/A)  
---
## Topics
- Implementation  
- Math  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 0 ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem is a variation of the classic FizzBuzz sequence.  
- We need to determine the position of the `n`-th element in the remixed sequence.  
- Observation:  
  - Every block of 15 numbers contributes exactly 3 special outputs.  
  - So, `(n / 15) * 3` gives the number of complete blocks.  
  - Add `+1` for the starting offset.  
  - Then, check the remainder (`n % 15`) to adjust the answer:  
    - If remainder = 0 → no extra addition.  
    - If remainder = 1 → add 1.  
    - Else → add 2.  
- This greedy counting ensures we map `n` correctly to its position in the remixed sequence.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since calculations are direct.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
