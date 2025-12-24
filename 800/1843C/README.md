# Problem Number - 1843C Sum in Binary Tree  
**Problem Link:** [https://codeforces.com/problemset/problem/1843/C](https://codeforces.com/problemset/problem/1843/C)  

---

## Topics  
- Implementation  
- Math  
- Binary Trees  

## Constraints  
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `n` ≤ 10^16  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem describes a binary tree where each node has a value equal to its index.  
- Starting from a given node `n`, we repeatedly move to its parent (`n / 2`) until reaching the root node (1).  
- At each step, we add the current node’s value to the sum.  
- Finally, we include the root node (value = 1).  
- This effectively computes the sum of all nodes encountered along the path from `n` to the root.  

## Time and Space Complexity  
- **Time Complexity:** `O(log n)`, since we repeatedly divide `n` by 2 until reaching 1.  
- **Space Complexity:** `O(1)`, only a few variables are used for accumulation.  
