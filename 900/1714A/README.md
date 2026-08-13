# Problem Number - 1714A Everyone Loves to Sleep

**Problem Link:** [https://codeforces.com/problemset/problem/1714/A](https://codeforces.com/problemset/problem/1714/A)

---

## Topics
- Implementation
- Math
- Greedy

## Constraints
- $1 ≤ t ≤ 100$ (Number of test cases)
- $1 ≤ n ≤ 10$ (Number of alarms)
- $0 ≤ H < 24, 0 ≤ M < 60$ (Sleep time and alarm times)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the minimum sleep time Vasya loses given a set of alarm clocks and his initial go-to-sleep time.
- First, convert all times (both sleep time and alarm times) into total minutes from midnight ($00:00$), which ranges from $0$ to $1439$ ($24 \times 60 = 1440$ minutes in a day).
- For each alarm, compute the difference (wait time) in minutes until it rings:
  - If the alarm time is greater than or equal to the current sleep time, the alarm goes off on the same day: `wait = alarm - current`.
  - If the alarm time is earlier than the current sleep time, it means the alarm rings the next day: `wait = (1440 - current) + alarm`.
- Track the minimum wait time across all provided alarms.
- Finally, convert the minimum wait time back into hours (`minwait / 60`) and minutes (`minwait % 60`).

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per testcase, where `n` is the number of alarms, since we iterate through each alarm once.
- **Space Complexity:** $O(1)$, as we only use a few variables to store current times and minimum wait calculations.