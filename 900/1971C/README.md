# Problem Number - 1971C Clock and Strings  
**Problem Link:** [https://codeforces.com/problemset/problem/1971/C](https://codeforces.com/problemset/problem/1971/C)  

---

## Topics
- Implementation  
- Geometry on Circle  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 5940  
- 1 ≤ `a`, `b`, `c`, `d` ≤ 12  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem involves a clock with 12 positions labeled 1 to 12.  
- We are given two pairs of integers `(a, b)` and `(c, d)`, representing endpoints of two strings tied between clock positions.  
- The task is to determine if the two strings intersect inside the clock.  
- Approach:  
  - Normalize each pair so that the first element is always greater than the second (swap if necessary).  
  - Then check if one string’s endpoints lie strictly between the other string’s endpoints.  
  - If this condition holds, the strings intersect; otherwise, they do not.  
- This works because the circle is symmetric, and the intersection depends only on relative ordering of endpoints.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only comparisons are performed.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  
