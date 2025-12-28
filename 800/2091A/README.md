# Problem Number - 2091A Olympiad Date  
**Problem Link:** [https://codeforces.com/problemset/problem/2091/A](https://codeforces.com/problemset/problem/2091/A)  
---

## Topics
- Implementation  
- Simulation  
- Arrays  

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 20 (number of integers in the sequence)  
- 0 ≤ `a[i]` ≤ 9 (values in the sequence)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem requires checking how many elements of the sequence must be read until all required numbers for the "Olympiad Date" are collected.  
- The required numbers are: three `0`s, one `1`, two `2`s, one `3`, and one `5`.  
- We simulate reading the sequence from left to right, decrementing counters for each required number when encountered.  
- Once all counters reach zero or below, we record the position (index + 1) where the requirement is satisfied.  
- If the sequence ends without fulfilling all requirements, the answer is `0`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the sequence once.  
- **Space Complexity:** `O(1)`, only counters and a few variables are used.  
