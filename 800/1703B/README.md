# Problem Number - 1703B ICPC Balloons  
**Problem Link:** [https://codeforces.com/problemset/problem/1703/B](https://codeforces.com/problemset/problem/1703/B)  

---

## Topics
- Implementation
- Frequency Counting

## Constraints
- 1 ≤ `t` ≤ 100 
- 1 ≤ `n` ≤ 50  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a contest where balloons are given for solving problems.  
- Each problem is represented by a character in a string.  
- **Rule:**  
  - If a problem is solved for the first time, it requires **2 balloons** (one for solving, one extra for being new).  
  - If the problem has been solved before, it requires **1 balloon**.  
- Therefore, the solution involves:  
  1. Tracking whether a problem has appeared before using a frequency array or set.  
  2. Iterating through the string:  
     - If the problem is new → add 2 to the count.  
     - If already solved → add 1 to the count.  
- This ensures we count balloons correctly for all problems in the contest string.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the string once.  
- **Space Complexity:** `O(26)` = `O(1)`, for storing frequency of uppercase letters.  
