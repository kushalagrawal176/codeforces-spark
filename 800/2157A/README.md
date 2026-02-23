# Problem Number - 2157A Dungeon Equilibrium  

**Problem Link:** [https://codeforces.com/problemset/problem/2157/A](https://codeforces.com/problemset/problem/2157/A)  

---

## Topics
- Implementation  
- Frequency Counting  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 100  
- 0 ≤ `a[i]` ≤ `n`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives us `n` elements.  
- We want to make array "balanced" where an element `x` occurs exactly the `x` number of times.  
- To achieve this, we count the frequency of each strength value.  
- For each element `i`:  
  - If `freq[i] == 0` or `freq[i] == i`, no changes are needed.  
  - If `freq[i] < i`, then all `freq[i]` elements must be removed.  
  - If `freq[i] > i`, then `freq[i] - i` elements must be removed.  
- Summing these removals across all strengths gives the minimum number of elements to eliminate.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`.  
- **Space Complexity:** `O(1)`, since we store frequencies up to 100.  
