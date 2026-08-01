# Problem Number - 276A Lunch Rush
**Problem Link:** [https://codeforces.com/problemset/problem/276/A](https://codeforces.com/problemset/problem/276/A)

---

## Topics
- Implementation

## Constraints
- 1 ≤ `n` ≤ 10⁴
- 1 ≤ `k` ≤ 10⁹
- 1 ≤ `fᵢ`, `tᵢ` ≤ 10⁹
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given $n$ restaurants, each with a fun value $f_i$ and time required $t_i$, along with a maximum available time $k$.
- For each restaurant $i$, the joy obtained depends on whether the time $t_i$ exceeds $k$:
  - If $t_i > k$, the restaurant takes longer than $k$ minutes, reducing the joy to $f_i - (t_i - k)$.
  - If $t_i \le k$, the joy is simply $f_i$.
- We iterate through all $n$ restaurants, compute the joy for each using conditional evaluation `t > k ? f - (t - k) : f`, and keep track of the maximum joy encountered.
- Note that joy can be negative, so the maximum joy variable should be initialized to a sufficiently small value (e.g., `INT_MIN` or $-10^{18}$).

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$, as we process each restaurant's parameters in $\mathcal{O}(1)$ time in a single loop.
- **Space Complexity:** $\mathcal{O}(1)$, requiring only a constant amount of extra memory to maintain the current maximum joy.