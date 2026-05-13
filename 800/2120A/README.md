# Problem Number - 2120A Square of Rectangles

**Problem Link:** [https://codeforces.com/problemset/problem/2120/A](https://codeforces.com/problemset/problem/2120/A)

---

## Topics
- Geometry
- Implementation
- Brute Force 

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `side lengths` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether three given rectangles can be arranged to form a perfect square.  
- Each rectangle is defined by its length and breadth. We can rotate rectangles, so orientation doesn’t matter.  
- The key idea is to check possible configurations:
  1. **All aligned vertically or horizontally**: If all lengths are equal and the sum of breadths equals that length, or vice versa.  
  2. **Two stacked + one filling the rest**: If two rectangles share the same breadth and their combined length equals the length of the third rectangle, and the third rectangle’s breadth matches the sum of the other two.  
  3. **Symmetric cases**: Similar checks when swapping length and breadth roles.  
- By brute forcing these conditions, we can determine if the rectangles can form a square.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a fixed set of conditions are checked.  
- **Space Complexity:** `O(1)`, no extra storage required.  
