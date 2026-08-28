# Problem Number - 1933C Turtle Fingers: Count the Values of k

**Problem Link:** [https://codeforces.com/problemset/problem/1933/C](https://codeforces.com/problemset/problem/1933/C)

---

## Topics
- Number Theory
- Brute Force
- Math

## Constraints
- $1 \le t \le 10^4$ (test cases)
- $2 \le a, b \le 100$
- $1 \le l \le 10^6$
- Time limit per test: 5 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires finding the number of distinct positive integers $k$ such that $l = k \cdot a^x \cdot b^y$ for some non-negative integers $x$ and $y$.
- Rearranging the equation, $k = \frac{l}{a^x \cdot b^y}$, which implies that $k$ must be a divisor of $l$, and $\frac{l}{k}$ must be of the form $a^x \cdot b^y$.
- We can iterate over all possible non-negative powers of $a$ (i.e., $a^x$) as long as $a^x$ divides $l$ (or up to $\le l$), and similarly for powers of $b$ ($b^y$).
- For each valid combination of $a^x$ and $b^y$, their product $lc = a^x \cdot b^y$ is checked to see if it divides $l$. If $l \pmod{lc} == 0$, then $k = \frac{l}{lc}$ is a valid value.
- Storing these values in a `set` automatically handles duplicates and gives the count of unique values of $k$.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(\log_a l \cdot \log_b l)$, since $a, b \ge 2$, the number of possible powers for $x$ and $y$ is bounded by $\log_a l$ and $\log_b l$ respectively.
- **Space Complexity:** $\mathcal{O}(\log_a l \cdot \log_b l)$ in the worst case to store the unique values of $k$ in the set.