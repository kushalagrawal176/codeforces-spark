# Problem Number - 149A Business trip  
**Problem Link:** [https://codeforces.com/problemset/problem/149/A](https://codeforces.com/problemset/problem/149/A)  

---

## Topics
- Greedy  
- Sorting  
- Implementation  

## Constraints
- 0 ≤ `k` ≤ 100 (desired growth in centimeters)  
- Each of the `12 integers` (monthly growth) is between `0` and `100`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given the desired growth `k` and the growth values for each of the 12 months.  
- The task is to determine the minimum number of months needed to reach at least `k` centimeters of growth.  
- Approach:  
  1. Sort the monthly growth values in ascending order.  
  2. Start from the largest growth values (end of the sorted list) and keep adding them until the sum ≥ `k`.  
  3. Count how many months were used.  
  4. If the sum never reaches `k`, output `-1`.  
  5. If `k = 0`, output `0` immediately (no months needed).  

## Time and Space Complexity
- **Time Complexity:** `O(12 log 12)` ≈ `O(1)`, since sorting 12 elements is constant time.  
- **Space Complexity:** `O(1)`, only a fixed-size array/vector is used.  
