# Problem Number - 1365A Matrix Game

**Problem Link:** [https://codeforces.com/problemset/problem/1365/A](https://codeforces.com/problemset/problem/1365/A)

---

## Topics
- Games
- Greedy
- Implementation

## Constraints
- $1 ≤ t ≤ 50$ (Number of test cases)
- $1 ≤ n, m ≤ 50$ (Dimensions of the matrix)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- This is a turn-based game played on an $n \times m$ matrix. A player can place a '1' in a cell $(i, j)$ if and only if there is no '1' already in the $i$-th row and no '1' already in the $j$-th column.
- The game ends when no such move can be made.
- Since each move consumes exactly one available row and one available column, the total number of moves possible is limited by the number of empty rows and empty columns.
- Let `ur` be the count of rows that contain no '1's, and `uc` be the count of columns that contain no '1's.
- The maximum number of moves that can be made is `min(ur, uc)`.
- If the total number of moves is odd, the first player (Ashish) wins. If even, the second player (Vivek) wins.

## Time and Space Complexity
- **Time Complexity:** $O(n \times m)$ per test case, as we must iterate through the matrix to identify occupied rows and columns.
- **Space Complexity:** $O(n + m)$, to store the sets (or boolean arrays) representing the occupied rows and columns.