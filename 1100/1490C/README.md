# Problem Number - 1490C Sum of Cubes  
**Problem Link:** [https://codeforces.com/problemset/problem/1490/C](https://codeforces.com/problemset/problem/1490/C)  
---
## Topics
- Number Theory  
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `a` ≤ 10¹²  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether a given number `a` can be expressed as the sum of two positive cubes:  $a = x^3 + y^3$  
- To solve this:
  - Iterate over possible values of `x` such that \(x^3 \leq a\).  
  - Compute the remainder `rem = a - x^3`.  
  - Check if `rem` is a perfect cube.  
- To check if `rem` is a cube:
  - Compute `c = cbrt(rem)` (cube root).  
  - Verify if `c^3 == rem` (or `(c+1)^3 == rem` to handle floating-point precision).  
- If such a pair exists, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(∛a)` per test case, since we iterate up to cube root of `a`.  
- **Space Complexity:** `O(1)`, only constant extra space is used.  
