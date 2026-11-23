# Problem Number - 439A Devu, the Singer and Churu, the Joker

**Problem Link:** [https://codeforces.com/problemset/problem/439/A](https://codeforces.com/problemset/problem/439/A)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- $1 ≤ n ≤ 100$
- $1 ≤ t_i ≤ 100$
- $1 ≤ d ≤ 10000$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Devu wants to sing `n` songs with durations `t_1, t_2, ..., t_n` within a total event duration of `d` minutes, and Churu tells 5-minute jokes.
- Between every pair of consecutive songs (`n - 1` gaps), Churu must tell at least two 5-minute jokes (10 minutes per gap), requiring at least `sum(t) + 10 * (n - 1)` minutes in total.
- If `sum(t) + 10 * (n - 1) > d`, it is impossible to fit all songs and mandatory jokes within `d` minutes, so the answer is `-1`.
- Otherwise, all songs take `sum(t)` minutes, leaving `d - sum(t)` minutes for jokes (including any extra jokes after the last song). Dividing by 5 gives the maximum number of jokes Churu can tell: `(d - sum(t)) / 5`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, to read the `n` song durations and compute their sum.
- **Space Complexity:** $O(1)$, only constant extra space is used.