# Problem Number - 69A Young Physicist  
**Problem Link:** [https://codeforces.com/problemset/problem/69/A](https://codeforces.com/problemset/problem/69/A)  

---

## Topics  
- Implementation  
- Math   

## Constraints  
- 1 ≤ `n` ≤ 100 (number of forces)  
- Each force component (`x`, `y`, `z`) is an integer between -100 and 100  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether the given set of forces acting on a point results in equilibrium.  
- A point is in equilibrium if the **sum of all forces in each direction (x, y, z)** is equal to zero.  
- Approach:  
  1. Initialize sums for x, y, and z as zero.  
  2. For each force vector `(a, b, c)`, add its components to the respective sums.  
  3. After processing all vectors, check if `x == 0`, `y == 0`, and `z == 0`.  
  4. If all are zero, print `"YES"`; otherwise, print `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for iterating through all force vectors.  
- **Space Complexity:** `O(1)`, only constant space used for accumulation.  
