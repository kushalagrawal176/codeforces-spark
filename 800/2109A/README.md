# Problem Number - 2109A It's Time To Duel  
**Problem Link:** [https://codeforces.com/problemset/problem/2109/A](https://codeforces.com/problemset/problem/2109/A)  
---
## Topics
- Implementation  
- Arrays  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 100 
- 2 ≤ `n` ≤ 100  
- Array elements are either 0 or 1  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given an array of integers (0s and 1s).  
- The task is to determine if the array configuration is valid under the rules of the duel.  
- Rules:  
  1. If there are **two consecutive zeros** (`0 0`), the configuration is invalid.  
  2. If the entire array consists only of ones (`1 1 1 ...`), the configuration is invalid.  
- Approach:  
  - Count the number of ones in the array.  
  - Traverse the array to check for consecutive zeros.  
  - If either condition is violated, output **YES** (invalid).  
  - Otherwise, output **NO** (valid).  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(n)`, for storing the array.  
