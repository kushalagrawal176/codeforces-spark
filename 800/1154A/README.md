# Problem Number - 1154A Restoring Three Numbers  
**Problem Link:** [https://codeforces.com/problemset/problem/1154/A](https://codeforces.com/problemset/problem/1154/A)  

---

## Topics
- Implementation  
- Math  

## Constraints
- Input consists of 4 integers, each between 2 and 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given 4 integers which represent the sums of three unknown numbers `x`, `y`, and `z`.  
- Among these 4 integers, the **largest one** must be `x + y + z` (the sum of all three numbers).  
- The other three integers represent `x + y`, `y + z`, and `x + z`.  
- To restore the original numbers:  
  - Subtract each of the smaller sums from the largest sum.  
  - This gives the values of `x`, `y`, and `z`.  
- Example: If the inputs are `3 6 5 4`, the largest is `6`. Then:  
  - `x = 6 - 5 = 1`  
  - `y = 6 - 4 = 2`  
  - `z = 6 - 3 = 3`  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, only arithmetic operations and comparisons.  
- **Space Complexity:** `O(1)`, constant space usage.  
