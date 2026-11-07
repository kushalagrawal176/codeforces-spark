# Problem Number 1779B - MKnez's ConstructiveForces Task

**Problem Link:** [https://codeforces.com/problemset/problem/1779/B](https://codeforces.com/problemset/problem/1779/B)

---

## Topics
- Constructive Algorithms
- Math
- Greedy

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $2 \le n \le 1000$ (length of array)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires constructing an array of length $n$ such that the sum of any two adjacent elements is equal to a constant value, and all elements are non-zero integers.
- If $n = 3$, it is impossible to satisfy the condition, so we output "NO".
- If $n$ is even, we can alternate elements between `-1` and `1` (e.g., `-1, 1, -1, 1, ...`). The sum of any two adjacent elements will consistently be `0`.
- If $n$ is odd, we can set $x = n / 2$ and $y = x - 1$, and alternate elements between $y$ and $-x$ (e.g., for $n=5$, $x=2, y=1$, the sequence is `1, -2, 1, -2, 1`). The sum of any two adjacent elements will consistently be $y + (-x) = -1$.
- For all valid $n$ ($n \neq 3$), we output "YES" followed by the generated sequence.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per testcase, for generating and printing the sequence of length $n$.
- **Space Complexity:** $O(1)$, as only constant extra space is used.