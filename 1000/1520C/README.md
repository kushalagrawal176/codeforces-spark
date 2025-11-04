# Problem Number - 1520C Not Adjacent Matrix
**Problem Link:** [https://codeforces.com/problemset/problem/1520/C](https://codeforces.com/problemset/problem/1520/C)

---

## Topics

1. Implementation  
2. Greedy  
3. Matrix Construction

## Constraints

1. Number of test cases: 1 ≤ t ≤ 100
2. Matrix size: 1 ≤ n ≤ 100

## Intuition / Approach

1. The task is to construct an `n x n` matrix using numbers from 1 to `n^2` such that no two adjacent cells (sharing a side) contain consecutive integers.  
2. For `n = 1`, the matrix is trivially valid.  
3. For `n = 2`, it's impossible to construct such a matrix, so return `-1`.  
4. For `n >= 3`, a valid strategy is to separate the numbers into two groups:
   - First, place all odd numbers from 1 to `n^2`.
   - Then, place all even numbers from 1 to `n^2`.
5. Fill the matrix row-wise using this combined list. This ensures that adjacent cells are unlikely to contain consecutive numbers.  
6. This greedy approach avoids placing consecutive numbers next to each other and satisfies the problem constraints.

---

## Time and Space Complexity

- **Time Complexity:** O(n²) (to generate and fill the matrix)  
- **Space Complexity:** O(n²) (if we store values in the matrix) or O(1) (when directly printing the values)
