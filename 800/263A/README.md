# Problem Number - 263A Beautiful Matrix

**Problem Link:** [https://codeforces.com/problemset/problem/263/A](https://codeforces.com/problemset/problem/263/A)

---

## Topics
- Implementation
- Math

## Constraints
- The matrix size is fixed: 5 × 5  
- Exactly one cell contains the number `1`, all others contain `0`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- You are given a `5 × 5` matrix with exactly one `1` and the rest `0`s.  
- The task is to move the `1` to the center of the matrix (position `(3,3)` in 1-based indexing).  
- Each move consists of swapping the `1` with an adjacent element (up, down, left, or right).  
- The minimum number of moves required is equal to the **Manhattan distance** between the current position of `1` and the center `(3,3)`.  
- Formula:  
  `moves = |row - 3| + |col - 3|`

## Time and Space Complexity
- **Time Complexity:** O(1), since we only scan a fixed 5 × 5 matrix and compute the distance.  
- **Space Complexity:** O(1), only constant space used.
