# Problem Number - 1901A Line Trip

**Problem Link:** [https://codeforces.com/problemset/problem/1901/A](https://codeforces.com/problemset/problem/1901/A)

---

## Topics
- Implementation  
- Math  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 50  
- 2 ≤ `x` ≤ 1000  
- 0 < `a[i]` < x (positions of stations, strictly increasing)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the **maximum distance** the bus can travel without stopping.  
- We need to consider three possible maximum gaps:  
  1. Distance from the starting point (0) to the first station.  
  2. Maximum gap between consecutive stations.  
  3. Twice the distance from the last station to the destination `x` (since the bus can go to `x` and return).  
- The answer is simply the maximum of these three values.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we check all consecutive station gaps.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  
