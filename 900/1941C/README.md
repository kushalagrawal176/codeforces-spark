# Problem Number - 1941C Rudolf and the Ugly String  
**Problem Link:** [https://codeforces.com/problemset/problem/1941/C](https://codeforces.com/problemset/problem/1941/C)  

---

## Topics
- Strings  
- Implementation  
- Pattern Matching  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10⁶  
- Sum of n across all test cases ≤ 10⁶  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to count how many times the substrings `"map"` or `"pie"` appear in the given string.  
- These substrings are considered "ugly" and must be counted.  
- Approach:  
  - Traverse the string from left to right.  
  - At each position, extract the substring of length 3.  
  - If it matches `"map"` or `"pie"`, increment the counter and skip ahead by 2 positions (to avoid overlapping counts).  
- This greedy skipping ensures that overlapping substrings are not double-counted.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only constant space used for counters and temporary substrings.  
