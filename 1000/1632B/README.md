# Problem Number - 1632B Roof Construction

**Problem Link:** [https://codeforces.com/problemset/problem/1632/B](https://codeforces.com/problemset/problem/1632/B)

---

## Topics
- Bitmasks
- Constructive Algorithms
- Math

## Constraints
- $1 \le t \le 10^4$
- $2 \le n \le 2 \cdot 10^5$
- $\sum n \le 2 \cdot 10^5$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find a permutation of numbers from $0$ to $n-1$ such that the maximum bitwise XOR ($\oplus$) between any two adjacent elements is minimized.
- Let $k$ be the highest power of 2 that is strictly less than $n$ (i.e., the most significant bit of $n-1$). 
- Any permutation must transition between a number less than $k$ and a number greater than or equal to $k$ at least once. 
- The minimum possible value for this transition's XOR is $k$ itself, which happens when we transition between $k-1$ and $k$. Since $k$ is a power of 2, the most significant bit of $k$ is set, and the most significant bit of $k-1$ is not set, resulting in $(k-1) \oplus k = 2k - 1$, which is not minimal. However, if we transition between $0$ and $k$, the XOR is $0 \oplus k = k$.
- To ensure no other transition exceeds $k$, we can split the permutation into two monotonically arranged halves:
  1. A descending sequence from $k-1$ down to $0$.
  2. An ascending sequence from $k$ up to $n-1$.
- This guarantees that the transition between the two halves is $0 \to k$ (with a cost of $k$), and all other adjacent elements will have an XOR strictly less than $k$.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, as we iterate through the numbers from $0$ to $n-1$ exactly once to print them.
- **Space Complexity:** $\mathcal{O}(1)$ auxiliary space, since the permutation is printed directly on the fly without storing it in memory.