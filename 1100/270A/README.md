# Problem Number - 270A Fancy Fence  
**Problem Link:** [https://codeforces.com/problemset/problem/270/A](https://codeforces.com/problemset/problem/270/A)  
---
## Topics
- Geometry
- Math
- Implementation

## Constraints
- 1 ≤ `t` ≤ 180  
- 1 ≤ `n` ≤ 180  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether a regular polygon can be constructed with each interior angle equal to `n`.  
- For a polygon with `k` sides, the interior angle is given by: `Interior Angle = ((k - 2) * 180) / k`  
- Rearranging, the number of sides is:  `k = 360 / (180 - n)` 
- If `k` is an integer, then such a polygon exists → print `"YES"`.  
- Otherwise, print `"NO"`.  
- The solution is straightforward: check if `360 % (180 - n) == 0`.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since each test case is checked in constant time.  
- **Space Complexity:** `O(1)`, only constant extra space is used.  
