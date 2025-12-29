# Problem Number - 1433D Districts Connection  
**Problem Link:** [https://codeforces.com/problemset/problem/1433/D](https://codeforces.com/problemset/problem/1433/D)  

---

## Topics  
- Graphs  
- Implementation  
- Constructive Algorithms  

## Constraints  
- 1 ≤ `t` ≤ 500  
- 2 ≤ `n` ≤ 5000  
- 1 ≤ `a[i]` ≤ 10^9 (district types)  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to connect all districts into a spanning tree such that no two connected districts have the same type.  
- If all districts have the same type, it is impossible to form such a tree, so the answer is **NO**.  
- Otherwise, we can always construct a valid spanning tree:  
  1. Find the first district whose type differs from the first district.  
  2. Connect district 1 with all districts of a different type.  
  3. Connect the first different district with all districts that share the same type as district 1.  
- This guarantees that all districts are connected and no edge connects districts of the same type.  
- The output is **YES** followed by the list of edges forming the spanning tree.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for scanning the array and constructing edges.  
- **Space Complexity:** `O(n)`, for storing district types.  
