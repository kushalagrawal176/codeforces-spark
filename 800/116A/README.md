# Problem Number - 116A Tram  
**Problem Link:** [https://codeforces.com/problemset/problem/116/A](https://codeforces.com/problemset/problem/116/A)  

---

## Topics
- Implementation
- Simulation
- Math

## Constraints
- 2 ≤ `n` ≤ 1000  
- 0 ≤ `a`, `b` ≤ 1000  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a tram with `n` stops. At each stop:
  - `a` passengers exit.
  - `b` passengers enter.
- We need to determine the **minimum tram capacity** required so that it can hold all passengers at any time.
- Approach:
  - Maintain a variable `pass` to track the current number of passengers.
  - At each stop, update `pass = pass - a + b`.
  - Track the maximum value of `pass` across all stops using a variable `maxi`.
  - The answer is simply `maxi`, which represents the maximum number of passengers present at any point.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through all stops once.  
- **Space Complexity:** `O(1)`, only constant space is used for tracking passengers and maximum.
