# Problem Number - 50A Domino piling

**Problem Link:** [https://codeforces.com/problemset/problem/50/A](https://codeforces.com/problemset/problem/50/A)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- 1 ≤ m, n ≤ 16  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- You are given a board of size `m × n`.  
- Each domino covers exactly **2 squares**.  
- The task is to find the maximum number of dominos that can fit on the board without overlapping and without going outside the board.  
- Since each domino covers 2 cells, the maximum number of dominos is simply the total number of cells divided by 2.  
- Formula:  
  
`max dominos = (m * n) / 2`



## Time and Space Complexity
- **Time Complexity:** O(1), since the answer is computed directly using a formula.  
- **Space Complexity:** O(1), only constant space used.
