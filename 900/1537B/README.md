# Problem Number - 1537B Bad Boy  
**Problem Link:** [https://codeforces.com/problemset/problem/1537/B](https://codeforces.com/problemset/problem/1537/B)  

---

## Topics
- Implementation  
- Geometry on Grid  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `a`, `b` ≤ 10⁹  
- 1 ≤ `c` ≤ `a`  
- 1 ≤ `d` ≤ `b`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a rectangular grid of size `a × b`.  
- A "bad boy" is initially at position `(c, d)`. We need to place two guards at opposite corners of the rectangle to maximize the distance between them and the bad boy.  
- Observation: The maximum distance is always achieved by choosing the corners `(1, 1)` and `(a, b)`.  
- This is because these two corners are diagonally opposite and guarantee the largest possible separation regardless of the bad boy’s position.  
- Thus, the solution is simply to output `1 1 a b` for every test case.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since the answer is directly computed without iteration.  
- **Space Complexity:** `O(1)`, only constant space used.  
