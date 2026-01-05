# Problem Number - 224A Parallelepiped  
**Problem Link:** [https://codeforces.com/problemset/problem/224/A](https://codeforces.com/problemset/problem/224/A)  

---

## Topics  
- Geometry  
- Math  
- Implementation  

## Constraints  
- Input: three integers `a`, `b`, `c` (areas of three pairwise adjacent faces of a parallelepiped)  
- 1 ≤ `a`, `b`, `c` ≤ 10⁴  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given the areas of three adjacent faces of a parallelepiped:  
  - `a = x × y`  
  - `b = y × z`  
  - `c = x × z`  
  where `x`, `y`, and `z` are the side lengths.  
- From these equations, we can deduce the side lengths:  
  - `x = sqrt((a × c) / b)`  
  - `y = a / x`  
  - `z = c / x`  
- Once the side lengths are known, the task is to compute the **sum of all edges** of the parallelepiped.  
- Since each edge length appears 4 times in the total perimeter, the answer is:  
  - `4 × (x + y + z)`  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, as the solution involves only a few arithmetic operations and square root calculation.  
- **Space Complexity:** `O(1)`, only constant space is used for storing variables.  
