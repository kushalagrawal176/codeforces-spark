# Problem 1927C - Choose the Different Ones!

**Problem Link:** [https://codeforces.com/problemset/problem/1927/C](https://codeforces.com/problemset/problem/1927/C)

---

## Topics
- Greedy
- Hash Table
- Two Pointers / Sets

## Constraints
- $1 \le t \le 10^4$ (Number of test cases)
- $1 \le n, m \le 2 \cdot 10^5$
- $2 \le k \le 2 \cdot min(n, m)$ ($k$ is always even)
- $1 \le a_i, b_j \le 10^6$
- The sum of $n$ and the sum of $m$ over all test cases do not exceed $4 \cdot 10^5$.
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The objective is to pick exactly $k/2$ elements from array $a$ and $k/2$ elements from array $b$ such that their union contains all integers from $1$ to $k$.
- We can filter out all elements greater than $k$ immediately since they don't contribute to our goal.
- By utilizing hash sets (or frequency arrays) for both arrays, we can iterate through every number $i$ from $1$ to $k$ and check its availability:
  - If $i$ is missing from both sets, it's impossible to collect all numbers from $1$ to $k$.
  - If $i$ is only present in array $a$, we are forced to take it from $a$ (`exclusiveA++`).
  - If $i$ is only present in array $b$, we are forced to take it from $b$ (`exclusiveB++`).
  - If $i$ is present in both arrays, it goes into a pool of shared elements (`common++`).
- Finally, the selection is valid if and only if the absolute requirements for either array do not exceed the permitted allocation of $k/2$. That is, `exclusiveA <= k / 2` and `exclusiveB <= k / 2`. The `common` pool elements will seamlessly fill up the remaining spots.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n + m + k)$ per test case. Inserting elements into a hash set takes linear time on average, and iterating from $1$ to $k$ takes $\mathcal{O}(k)$ time.
- **Space Complexity:** $\mathcal{O}(n + m)$ to store the distinct elements of both arrays up to $k$ in hash sets.