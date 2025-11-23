# Problem Number - 148A Insomnia cure  
**Problem Link:** [https://codeforces.com/problemset/problem/148/A](https://codeforces.com/problemset/problem/148/A)  

---

## Topics
- Implementation
- Simulation
- Math

## Constraints
- 1 ≤ `k`, `l`, `m`, `n` ≤ 10  
- 1 ≤ `d` ≤ 10^5  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a dragon that will be damaged if the day number is divisible by any of four given integers (`k`, `l`, `m`, `n`).  
- We need to count how many days (from 1 to `d`) the dragon will be damaged.  
- Approach:
  1. Iterate through all days from 1 to `d`.  
  2. For each day, check if it is divisible by any of the four numbers.  
  3. If yes, increment the count.  
- This brute force approach works because `d` is at most 100,000, which is manageable within the time limit.  
- Alternatively, inclusion-exclusion principle could be applied, but direct simulation is simple and efficient enough here.

## Time and Space Complexity
- **Time Complexity:** `O(d)`, since we check each day up to `d`.  
- **Space Complexity:** `O(1)`, only a counter variable is used.
