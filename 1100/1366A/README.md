# Problem Number - 1366A Shovels and Swords

**Problem Link:** [https://codeforces.com/problemset/problem/1366/A](https://codeforces.com/problemset/problem/1366/A)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- 0 ≤ a, b ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- You are given two resources: sticks (`a`) and diamonds (`b`).
- You can craft:
  - **Shovel** → requires 2 sticks + 1 diamond  
  - **Sword** → requires 1 stick + 2 diamonds  
- Each tool consumes exactly **3 resources** in total.
- Therefore, the maximum number of tools you can craft is limited by:
  1. The smaller of `a` and `b` (since one resource may run out first).  
  2. The total resources divided by 3 → `(a + b) / 3`.  
- The final answer is:

    `max tools = min(a, b, (a + b) / 3)`



## Time and Space Complexity
- **Time Complexity:** O(1), since the answer is computed directly using a formula.  
- **Space Complexity:** O(1), only constant space used.
