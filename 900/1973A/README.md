# Problem Number - 1973A Chess For Three

**Problem Link:** [https://codeforces.com/problemset/problem/1973/A](https://codeforces.com/problemset/problem/1973/A)

---

## Topics
- Greedy
- Math
- Implementation

## Constraints
- $1 \le t \le 500$ (Number of test cases)
- $0 \le a, b, c \le 30$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Three players play a game where each game awards points (either a draw gives 1 point to each of the two players, or a win gives 2 points to the winner and 0 to the loser). This means every game played contributes a total of 2 points to the sum of scores $(a + b + c)$.
- If the total sum of scores $(a + b + c)$ is **odd**, it is impossible for all games to be valid because every game increases the total sum by 2 (an even number). In this case, output `-1`.
- If the sum is even, the maximum possible number of games is bounded by two conditions:
  1. Total games cannot exceed $(a + b + c) / 2$, since each game adds 2 points.
  2. Total games cannot exceed $a + b$, because player $c$ can only participate in games where they play against $a$ or $b$. Thus, $c$ can play at most $a + b$ games (alternating or pairing up).
- Taking the minimum of these two constraints gives the maximum number of games: $\min((a + b + c) / 2, a + b)$.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, as it only requires basic arithmetic operations.
- **Space Complexity:** $O(1)$, using only a few variables for input and calculation.