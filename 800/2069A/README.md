# Problem Number - 2069A Was there an Array?  
**Problem Link:** [https://codeforces.com/problemset/problem/2069/A](https://codeforces.com/problemset/problem/2069/A)  
---
## Topics
- Implementation  
- Strings / Arrays  
- Pattern Checking  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 3 ≤ `n` ≤ 100  
- Input consists of `n-2` integers (0 or 1)  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem provides `n-2` elements of a binary array and asks whether such an array could exist under certain rules.  
- The key condition: the subsequence `1 0 1` must **not** appear in the given array.  
- Approach:  
  1. Read the array of length `n-2`.  
  2. Iterate through the array and check every consecutive triplet.  
  3. If any triplet equals `1 0 1`, mark the array as invalid.  
  4. If no such triplet exists, the array is valid.  
- Output **YES** if valid, otherwise **NO**.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we scan through the array once.  
- **Space Complexity:** `O(n)`, for storing the array.  
