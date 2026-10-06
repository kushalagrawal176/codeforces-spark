# Problem Number - 2232B Cake Leveling

**Problem Link:** [https://codeforces.com/problemset/problem/2232/B](https://codeforces.com/problemset/problem/2232/B)

---

## Topics
- Greedy
- Binary Search
- Implementation
- Math

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $2 \le n \le 2 \cdot 10^5$ (length of Alice's cake)
- $1 \le a_i \le 10^9$ (height of frosting at i-th position)
- Sum of $n$ over all test cases is at most $2 \cdot 10^5$
- Time limit per test: 1.5 seconds (typical)
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to process elements incrementally from index `1` to `n`.
- For each step `i`, we accumulate the sum of input values up to that point (`a`).
- We then compute the current average or floor value via `cur = a / i`.
- We keep track of the minimum value of `cur` encountered so far (`sol = min(sol, cur)`) and output it for each prefix length `i`.
- This running calculation allows us to answer each prefix efficiently in real-time as elements stream in.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, since we iterate through the array of size `n` once.
- **Space Complexity:** $O(1)$, as only a few scalar variables are used to accumulate the sum and track the minimum solution.