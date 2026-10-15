# Problem Number - 1749B Death's Blessing

**Problem Link:** [https://codeforces.com/problemset/problem/1749/B](https://codeforces.com/problemset/problem/1749/B)

---

## Topics
- Greedy
- Sorting
- Math

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n \le 2 \cdot 10^5$ (number of monsters)
- $1 \le a_i \le 10^9$ (inital health of corresponding monsters)
- $0 \le b_i \le 10^9$ (strength of spell)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given $n$ monsters, where each monster has a health value $a_i$ and a spell increase value $b_i$.
- Whenever a monster is killed, its health is added to its neighbors, which costs 1 unit of time per health transferred, plus we spend $a_i$ to kill the monster itself.
- To minimize the total time (cost), notice that every monster's health $a_i$ must eventually be processed and contributed to the total sum. Thus, the sum of all health values $\sum a_i$ is a fixed base cost.
- The spells $b_i$ add health to neighbors. When we eliminate a monster, its spell value $b_i$ is added to its remaining neighbor's health. To minimize the extra health added, we should try to avoid adding the largest $b_i$ values.
- Specifically, the monster with the maximum $b_i$ value can be left until the very last operation, meaning its spell value never needs to be transferred to any other surviving monster.
- Therefore, the minimum total time required is:
  $$\text{Total Time} = \sum_{i=1}^{n} a_i + \sum_{i=1}^{n} b_i - \max(b_i)$$
- In other words, we sum up all $a_i$ and all $b_i$, and then subtract the maximum $b_i$ from the total.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, for computing the sum of array $a$, sum of array $b$, and finding the maximum value in array $b$ in a single pass.
- **Space Complexity:** $O(n)$ (or $O(1)$ if inputs are processed on the fly) to store the arrays or running sums.