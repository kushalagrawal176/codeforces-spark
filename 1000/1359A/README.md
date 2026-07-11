# Problem Number - 1359A Berland Poker

**Problem Link:** [https://codeforces.com/problemset/problem/1359/A](https://codeforces.com/problemset/problem/1359/A)

---

## Topics
- Greedy
- Math

## Constraints
- $1 \le t \le 500$ (Number of test cases)
- $2 \le n \le 50$, $0 \le m \le n$, $2 \le k \le n$
- It is guaranteed that $n$ is divisible by $k$.
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to maximize the difference between the maximum number of jokers held by a single player and the maximum number of jokers held by any of the remaining players.
- To maximize this difference, we should greedily give as many jokers as possible to the winner. Each player receives exactly $\frac{n}{k}$ cards. Therefore, the winner can hold at most $\max\_jokers = \min\left(m, \frac{n}{k}\right)$ jokers.
- After giving the winner their jokers, we have $m - \max\_jokers$ remaining jokers.
- To minimize the highest number of jokers held by any other player, we must distribute these remaining jokers as evenly as possible among the other $k - 1$ players. 
- The maximum number of jokers any other player will get is $\lceil \frac{m - \max\_jokers}{k - 1} \rceil$. In integer arithmetic, this can be efficiently calculated as $\lfloor \frac{(m - \max\_jokers) + (k - 1) - 1}{k - 1} \rfloor$.
- The final answer is the difference between the winner's jokers and this second maximum.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per testcase.
- **Space Complexity:** $O(1)$ as we only use a few variables to store input and perform constant-time calculations.