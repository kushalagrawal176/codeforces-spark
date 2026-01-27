# Problem Number - 580C Kefa and Park  
**Problem Link:** [https://codeforces.com/problemset/problem/580/C](https://codeforces.com/problemset/problem/580/C)  

---

## Topics
- Graph Theory  
- Depth-First Search (DFS)  
- Trees  

## Constraints
- 2 ≤ `n` ≤ 10⁵ (number of vertices)  
- 1 ≤ `m` ≤ `n` (maximum allowed consecutive cats)  
- Each vertex has either `0` or `1` cat  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The park is represented as a tree with `n` vertices. Kefa starts at the root (vertex 1).  
- Each vertex may contain a cat. Kefa cannot visit a path where the number of consecutive cat vertices exceeds `m`.  
- The task is to count the number of leaf vertices Kefa can reach under these constraints.  

### Steps:
1. Build an adjacency list to represent the tree.  
2. Use DFS starting from the root (vertex 1).  
3. Track the number of consecutive cat vertices along the path.  
   - If the current vertex has a cat, increment the consecutive count.  
   - Otherwise, reset it to 0.  
4. If the consecutive count exceeds `m`, stop exploring that path.  
5. If a node is a leaf (no children except its parent) and the path is valid, increment the answer.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since each vertex and edge is visited once in DFS.  
- **Space Complexity:** `O(n)`, for storing the adjacency list and recursion stack.  
