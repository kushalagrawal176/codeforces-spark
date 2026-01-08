# Problem Number - 115A Party  
**Problem Link:** [https://codeforces.com/problemset/problem/115/A](https://codeforces.com/problemset/problem/115/A)  

---

## Topics
- Graphs  
- DFS / BFS  
- Tree Depth  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 2000  
- 1 ≤ `p[i]` ≤ `n`  OR `p[i]` = -1
- Time limit per test: 3 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a company hierarchy where each employee either reports to another employee or directly to the boss (denoted by `-1`).  
- We can represent this hierarchy as a forest of rooted trees, where each root corresponds to an employee with no manager.  
- The task is to find the maximum depth among all trees, which represents the largest number of groups that can be formed.  
- To solve this, we:  
  - Build an adjacency list of employees and their subordinates.  
  - For each root (employee with no manager), perform DFS or BFS to calculate the depth of the tree.  
  - Track the maximum depth across all roots.  
- The answer is simply the maximum depth found.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since each employee is visited once during DFS/BFS.  
- **Space Complexity:** `O(n)`, for storing the adjacency list and recursion/queue overhead.  
