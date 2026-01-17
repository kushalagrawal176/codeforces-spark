# Problem Number - 1850E Cardboard for Pictures  
**Problem Link:** [https://codeforces.com/problemset/problem/1850/E](https://codeforces.com/problemset/problem/1850/E)  
---
## Topics
- Binary Search / Quadratic Equation  
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ 10⁴  
- 1 ≤ `c` ≤ 10¹⁸  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Each picture has side length `a[i]`. We want to add cardboard of width `w` around each picture.  
- The new side length becomes `(a[i] + 2w)`.  
- The total area after adding cardboard is:  `Sum (a[i] + 2w)^2`  
- We want this total area to equal `c`.  
- Expanding: `Sum (a[i]^2) + 4w * Sum(a[i]) + 4n * w^2 = c`
- This is a quadratic equation in terms of `w`.  
- Solve for `w` using the quadratic formula:  `w = ( -4 * sum + sqrt( (4 * sum)^2 + 16n * (c - sumSquare) ) ) / (8n)`  
- The answer is the integer floor of `w`.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we compute sums and solve the quadratic.  
- **Space Complexity:** `O(1)`, aside from storing the input array.  
