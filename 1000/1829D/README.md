# Problem Number - 1829D Gold Rush  
**Problem Link:** [https://codeforces.com/problemset/problem/1829/D](https://codeforces.com/problemset/problem/1829/D)  

## Topics  
- Recursion  
- Implementation  
- Number Theory  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n`, `m` ≤ 10⁷ (initial gold and target gold)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- You start with `n` units of gold and want to check if it is possible to obtain exactly `m` units by repeatedly applying the following operation:  
  - If the current pile size is divisible by 3, split it into two piles of sizes `n/3` and `2n/3`.  
- The problem reduces to checking if `m` can be reached from `n` using recursive splitting.  
- **Key observations:**  
  - If `n == m`, the answer is immediately "YES".  
  - If `n` is not divisible by 3 and `n != m`, the answer is "NO".  
  - Otherwise, recursively check both splits (`n/3` and `2n/3`) to see if `m` can be reached.  
- This can be solved using recursion or DFS-style simulation.  

## Time and Space Complexity  
- **Time Complexity:** `O(log n)`, since each division reduces the pile size by a factor of 3.  
- **Space Complexity:** `O(log n)`, due to recursion stack depth.  
