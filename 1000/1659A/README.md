# Problem Number - 1659A Red Versus Blue

**Problem Link:** [https://codeforces.com/problemset/problem/1659/A](https://codeforces.com/problemset/problem/1659/A)

---

## Topics
- Constructive Algorithms
- Math
- Greedy

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- $n, r, b$ (length of string, count of 'R', count of 'B'): 
- $3 \le n \le 100$
- $b < r$
- $r + b = n$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The goal is to distribute $r$ red cards ('R') and $b$ blue cards ('B') such that the maximum consecutive streak of 'R' is minimized.
- Since we want to minimize the maximum contiguous streak of 'R', we should use 'B' as separators. $b$ blue cards will divide the red cards into $b + 1$ groups.
- To make the maximum group size as small as possible, we should distribute the red cards as evenly as possible among these $b + 1$ groups.
- By dividing $r$ by $b + 1$, we find:
  - The base size of each group: $k = \lfloor \frac{r}{b + 1} \rfloor$
  - The number of groups that need to have an extra 'R' (size $k + 1$) to distribute the remainder: $m = r \pmod{b + 1}$
- We then reconstruct the string by printing $k + 1$ 'R's for the first $m$ groups, and $k$ 'R's for the remaining $(b + 1 - m)$ groups, placing a single 'B' between each consecutive group.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, as we iterate exactly $n$ times to print/construct the string of length $n$.
- **Space Complexity:** $\mathcal{O}(1)$ auxiliary space if we print the characters directly, or $\mathcal{O}(n)$ if we construct the output string before printing.