# Problem Number - 1303A Erasing Zeroes  
**Problem Link:** [https://codeforces.com/problemset/problem/1303/A](https://codeforces.com/problemset/problem/1303/A)  
---

## Topics
- Implementation  
- Strings  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `|s|` ≤ 100 (length of the string)  
- String consists of characters `'0'` and `'1'` only  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of zeroes that need to be erased so that all `1`s in the string become contiguous.  
- Key idea:  
  1. Count the total number of `1`s in the string.  
  2. Traverse the string from left to right.  
  3. Each time we encounter a `0` that lies between at least one `1` on the left and one `1` on the right, we increment the count of zeroes to erase.  
- This ensures we only count zeroes that are "between" `1`s, not those outside the first and last `1`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string twice (once to count `1`s, once to count zeroes between them).  
- **Space Complexity:** `O(1)`, only counters are used.  
