# Problem Number - 2155A El fucho

**Problem Link:** [https://codeforces.com/problemset/problem/2155/A](https://codeforces.com/problemset/problem/2155/A)

---

## Topics
- Implementation
- Math
- Simulation
- Greedy

## Constraints
- 1 ≤ `t` ≤ 100
- 2 ≤ `n` ≤ 500
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem describes a game where we repeatedly pair up players until only one remains.
- Each round:
  - We form `n/2` pairs, contributing `2 × (n/2)` to the total score.
  - The number of players reduces to `n/2 + (n % 2)`.
- **Simulation Approach (Solution 1):**
  - Keep simulating until only one player remains.
  - Accumulate the score at each step.
- **Mathematical Formula (Solution 2):**
  - It can be proven that the total score is always `2n - 2`.
  - This avoids simulation and gives a direct O(1) solution.

Thus, both approaches yield the same result, but the formula is optimal.

## Time and Space Complexity
- **Simulation Approach:**
  - **Time Complexity:** `O(log n)`, since `n` halves each round.
  - **Space Complexity:** `O(1)`, only counters used.
- **Formula Approach:**
  - **Time Complexity:** `O(1)`, direct computation.
  - **Space Complexity:** `O(1)`.
