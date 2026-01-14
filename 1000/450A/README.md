# Problem Number - 450A Jzzhu and Children  
**Problem Link:** [https://codeforces.com/problemset/problem/450/A](https://codeforces.com/problemset/problem/450/A)  

---

## Topics
- Implementation  
- Math  
- Simulation  

## Constraints
- 1 ≤ `n` ≤ 100  
- 1 ≤ `m` ≤ 100  
- 1 ≤ `a[i]` ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a queue of children, each with a certain number of candies they want.  
- Each round, the first child in the queue receives `m` candies. If they still need more, they go to the end of the queue; otherwise, they leave.  
- Instead of simulating the entire process, we can calculate directly:  
  - For each child, compute the number of rounds they need as `ceil(a[i] / m)`.  
  - The child who requires the maximum number of rounds will be the last one to leave.  
  - If multiple children tie, the one with the largest index (latest in the queue) is chosen.  

- This avoids unnecessary simulation and gives the answer efficiently.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we compute the required rounds for each child once.  
- **Space Complexity:** `O(1)`, only counters and tracking variables are used.  
