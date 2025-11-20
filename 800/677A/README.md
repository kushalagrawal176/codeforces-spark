# Problem Number - 677A Vanya and Fence  
**Problem Link:** [https://codeforces.com/problemset/problem/677/A](https://codeforces.com/problemset/problem/677/A)  

---

## Topics
- Implementation
- Simulation

## Constraints
- 1 ≤ `n` ≤ 1000  
- 1 ≤ `h` ≤ 1000  
- 1 ≤ `ai` ≤ 2·h (height of each friend)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum width of the road required for `n` friends to walk.  
- Each friend has a height `ai`.  
- If a friend’s height is **greater than** the fence height `h`, they need width `2` (bend down).  
- Otherwise, they need width `1`.  
- Approach:  
  1. Read `n` and `h`.  
  2. For each friend’s height `ai`:  
     - If `ai > h`, add `2` to the total width.  
     - Else, add `1`.  
  3. Print the total width.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for iterating through all friends.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  
