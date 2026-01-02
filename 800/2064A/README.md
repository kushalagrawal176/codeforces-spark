# Problem Number - 2064A Brogramming Contest  
**Problem Link:** [https://codeforces.com/problemset/problem/2064/A](https://codeforces.com/problemset/problem/2064/A)  
---
## Topics
- Implementation
- Strings
- Greedy

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n` ≤ 1000  
- String length = n, consisting only of characters '0' and '1'  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine the number of "switches" or transitions in the given binary string.  
- Start with the first character and iterate through the string.  
- Each time the character changes (from '0' to '1' or '1' to '0'), increment a counter.  
- After processing the string, if the first character is '1', increment the counter once more.  
- This final count represents the number of segments or switches needed.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
