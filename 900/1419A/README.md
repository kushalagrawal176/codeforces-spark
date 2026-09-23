# Problem Number - 1419A Digit Game

**Problem Link:** [https://codeforces.com/problemset/problem/1419/A](https://codeforces.com/problemset/problem/1419/A)

---

## Topics
- Games
- Greedy
- Strings

## Constraints
- $1 ≤ t ≤ 100$ (number of test cases)
- $1 ≤ n ≤ 1000$ (length of the string)
- Time limit per test: 1.0 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem is a game played by two players, Raze (Player 1) and Breach (Player 2), on a digit string of length `n`.
- Raze tries to make the final remaining digit **odd**, while Breach tries to make it **even**.
- Raze plays on 1-based odd positions (0-based even indices), and Breach plays on 1-based even positions (0-based odd indices).
- Depending on whether `n` is odd or even, the game's outcome can be deduced by analyzing the availability of preferred digits for each player:
  - If `n` is **odd**, Raze makes the last move. Raze wins if there is at least one odd digit present at an odd position (`o > 0`); otherwise, Breach wins (output `2`).
  - If `n` is **even**, Breach makes the last move. Breach wins if there is at least one even digit present at an even position (`e > 0`); otherwise, Raze wins (output `1`).

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, since we iterate through the string of length `n` once.
- **Space Complexity:** $O(n)$ to store the string, or $O(1)$ extra space auxiliary.