# Problem Number - 2028A Alice's Adventures in "Chess"

**Problem Link:** [https://codeforces.com/problemset/problem/2028/A](https://codeforces.com/problemset/problem/2028/A)

---

## Topics
- Implementation
- Simulation
- Brute Force

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $1 \le n \le 10$
- $-10 \le a, b \le 10$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem simulates Alice's movement on an infinite 2D grid starting from $(0, 0)$ following a repeating pattern of directions given by a string of length $n$ ('N', 'S', 'E', 'W').
- Since $n$ is very small and coordinates $a, b$ are also within a small range, the path repeats its net movement periodically. 
- A straightforward simulation for a sufficient number of steps (e.g., repeating the pattern enough times, such as 300 iterations, which covers multiple full cycles) is sufficient to check if Alice ever lands precisely on the target cell $(a, b)$.
- At each step, we update Alice's coordinates based on the current direction character and check if $(x, y) == (a, b)$.

## Time and Space Complexity
- **Time Complexity:** $O(n \times \text{limit})$, where the limit is the number of simulated steps (e.g., 300), which runs well within the 1-second time limit per test case.
- **Space Complexity:** $O(n)$ to store the movement string.