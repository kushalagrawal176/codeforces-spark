# Problem Number - 1921C Sending Messages

**Problem Link:** [https://codeforces.com/problemset/problem/1921/C](https://codeforces.com/problemset/problem/1921/C)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- $1 ≤ t ≤ 10^4$ (number of test cases)
- $1 ≤ n ≤ 2 × 10^5$ (number of moments messages are sent)
- $1 ≤ f, a, b ≤ 10^{18}$ (initial phone charge, cost per unit time, cost of turning off and on)
- $0 < m_1 < m_2 < \dots < m_n ≤ 10^{18}$ (moments in time)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether a phone can stay powered on while sending messages at specific moments $m_1, m_2, \dots, m_n$, starting with a charge $f$. At time 0, the phone has full charge $f$.
- For each message sent at moment $m_i$, the phone has been idle since the previous moment $m_{i-1}$ (with $m_0 = 0$).
- We have two choices for each interval:
  1. **Keep the phone on:** The charge consumed is $(m_i - m_{i-1}) \times a$.
  2. **Turn the phone off and on:** A flat charge of $b$ is consumed regardless of the time elapsed.
- To maximize the remaining battery, we greedily choose the minimum cost between keeping the phone on and turning it off and on for every interval: $\min((m_i - m_{i-1}) \times a, b)$.
- We sum these minimum costs up for all $n$ moments. If the total consumed charge is strictly less than the initial charge $f$ (i.e., `sum < f`), the phone survives, and the answer is **YES**. Otherwise, it's **NO**.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for iterating through the array of moments. 
- **Space Complexity:** $O(n)$ to store the moments array, or $O(1)$ auxiliary space if the inputs are processed on the fly.