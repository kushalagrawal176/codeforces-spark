# Problem 2042B - Game with Colored Marbles

**Problem Link:** [https://codeforces.com/problemset/problem/2042/B](https://codeforces.com/problemset/problem/2042/B)

---

## Topics
- Greedy
- Game Theory
- Sorting
- Constructive Algorithms

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- $1 \le n \le 1000$ (sum of $n$ over all test cases does not exceed $2000$)
- Time limit per test: 2 seconds
- Memory limit per test: 512 megabytes

## Intuition / Approach
- The game involves two players removing marbles of different colors based on specific rules to maximize their score.
- Colors that appear exactly once (`frequency = 1`) are uniquely advantageous because if a player chooses to claim such a color exclusively, the opponent cannot contest it, giving a guaranteed score of 2 points per pair (or 1 point if odd).
- Colors that appear multiple times (`frequency > 1`) can be used strategically, contributing 1 point each to the final score since they are shared or safely added.
- By counting frequencies:
  - Let `p` be the number of colors with a frequency of 1.
  - Let `q` be the number of colors with a frequency greater than 1.
- The total score can be optimally calculated using the formula: `ans = q + 2 * (p / 2 + p % 2)`, distributing the unique elements efficiently between the turns.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for counting the frequencies of the marbles using a frequency array or hash map.
- **Space Complexity:** $O(n)$, to store the frequency array of size $n + 1$.