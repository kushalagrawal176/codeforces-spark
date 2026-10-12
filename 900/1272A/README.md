# Problem Number - 1272A Three Friends

**Problem Link:** [https://codeforces.com/problemset/problem/1272/A](https://codeforces.com/problemset/problem/1272/A)

---

## Topics
- Math
- Greedy
- Brute Force
- Sortings

## Constraints
- $1 \le q \le 1000$ (number of test cases)
- $1 \le a, b, c \le 10^9$ (initial positions of the first, second and third friend)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Three friends are standing at integer positions $a$, $b$, and $c$ on a coordinate line.
- Each friend can either move 1 unit to the left, move 1 unit to the right, or stay in place.
- The pairwise distance between the three friends is defined as:
  $$\text{Total Distance} = |a - b| + |a - c| + |b - c|$$
- We want to minimize this total pairwise distance after each friend independently chooses one of their 3 movement options (moves $-1$, $0$, or $+1$).
- **Mathematical Insight:**
  - Notice that $|a - b| + |a - c| + |b - c|$ is equivalent to $2 \times (\max(a, b, c) - \min(a, b, c))$.
  - By moving the minimum coordinate towards the right ($+1$) and the maximum coordinate towards the left ($-1$), we can reduce the overall spread $(\text{max} - \text{min})$ by at most 2 units.
  - Since the spread decreases by at most 2, the pairwise distance decreases by at most $2 \times 2 = 4$ units.
  - Therefore, the minimal distance is $\max(0, \text{Initial Distance} - 4)$.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(1)$ per test case.
- **Space Complexity:** $\mathcal{O}(1)$, as only constant extra space is used.