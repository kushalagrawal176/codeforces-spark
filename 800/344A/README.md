# Problem Number - 344A Magnets  
**Problem Link:** [https://codeforces.com/problemset/problem/344/A](https://codeforces.com/problemset/problem/344/A)  

---

## Topics  
- Implementation  
- Simulation  
- Strings  

## Constraints  
- 1 ≤ `n` ≤ 100000 (number of magnets)  
- Each magnet is represented as a string `"10"` or `"01"`  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem describes a sequence of magnets placed one after another.  
- Each magnet has two poles represented as `"10"` or `"01"`.  
- When two consecutive magnets have different orientations, they form a new group.  
- The task is to count how many groups of magnets are formed.  

### Approach:  
- Read the number of magnets `n`.  
- Store the sequence of magnet orientations.  
- Initialize a counter with 1 (since there is always at least one group).  
- Traverse the sequence:  
  - If the current magnet’s orientation differs from the previous one, increment the counter.  
- Print the final counter as the number of groups.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we traverse the list of magnets once.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  
