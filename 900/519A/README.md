# Problem Number - 519A A and B and Chess

**Problem Link:** [https://codeforces.com/problemset/problem/519/A](https://codeforces.com/problemset/problem/519/A)

---

## Topics
- Implementation
- Strings

## Constraints
- The board consists of an 8x8 grid of characters.
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires simulating a chess game score evaluation based on standard piece values: Queen (9), Rook (5), Bishop (3), Knight (3), Pawn (1), and King (0).
- White pieces are represented by uppercase letters (`Q`, `R`, `B`, `N`, `P`, `K`), while Black pieces are represented by lowercase letters (`q`, `r`, `b`, `n`, `p`, `k`).
- We iterate through all 8 rows of the input string grid, check each character, map it to its respective value, and accumulate the scores separately for white (`w`) and black (`b`).
- Finally, we compare the total scores to determine if White wins, Black wins, or if it results in a Draw.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ (since the board size is fixed at 8 × 8 = 64 characters).
- **Space Complexity:** $O(1)$, using a constant amount of memory to track scores and map pieces.