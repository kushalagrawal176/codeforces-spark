# Problem Number 1354A - Alarm Clock

**Problem Link:** [https://codeforces.com/problemset/problem/1354/A](https://codeforces.com/problemset/problem/1354/A)

---

## Topics
- Math
- Implementation

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- $1 ≤ a, b, c, d ≤ 10^9$
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Polycarp needs to sleep for a total of `a` minutes. His first alarm rings at minute `b`.
- **Case 1:** If `b >= a`, Polycarp gets enough sleep on the very first alarm, so the answer is simply `b`.
- **Case 2:** If `b < a` and `c <= d`, Polycarp will never be able to make up the remaining sleep because each snooze cycle takes `c` minutes but yields at most `c - d ≤ 0` minutes of additional sleep. Thus, it is impossible, and we output `-1`.
- **Case 3:** If `b < a` and `c > d`, he needs an additional `a - b` minutes of sleep. Each snooze cycle takes `c` minutes and provides `c - d` minutes of actual sleep.
- The number of snooze cycles required is calculated via ceiling division: `(a - b + (c - d) - 1) / (c - d)`.
- The total time taken is then `b + needed_cycles * c`.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, calculated using a direct $O(1)$ mathematical formula.
- **Space Complexity:** $O(1)$, using only a few variables for computation.