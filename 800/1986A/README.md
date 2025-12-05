# Problem Number - 1986A X Axis  

**Problem Link:** [https://codeforces.com/problemset/problem/1986/A](https://codeforces.com/problemset/problem/1986/A)  

---

## Topics
- Implementation  
- Brute Force  
- Math  
- Geometry

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `a`, `b`, `c` ≤ 10 (input integers)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to minimize the total distance when aligning three integers `a`, `b`, and `c` to a common point `i`.  
- The distance is defined as:  
  `dist = |i - a| + |i - b| + |i - c|`  
- To solve:  
  1. Find the minimum and maximum among the three numbers.  
  2. Iterate through all possible points `i` between `min` and `max`.  
  3. For each `i`, compute the total distance.  
  4. Track the minimum distance across all choices of `i`.  
- This brute force approach works efficiently because the range between `min` and `max` is small (at most 100).  

## Time and Space Complexity
- **Time Complexity:** `O(maxi - mini)`, which is at most `O(10)`. Effectively `constant` time per test case.  
- **Space Complexity:** `O(1)`, only a few variables are used for computation.  
