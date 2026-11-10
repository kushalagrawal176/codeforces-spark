# 1326B - Maximums

**Problem Link:** [https://codeforces.com/problemset/problem/1326/B](https://codeforces.com/problemset/problem/1326/B)

---

## Topics
- Implementation
- Math
- Greedy

## Constraints
- $3 \le n \le 2 \cdot 10^5$
- $-10^9 \le b_i \le 10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array $b$ of size $n$, and we need to reconstruct the original array $a$.
- The relation given is $b_i = a_i - x_i$, where $x_i = \max(a_1, a_2, \dots, a_{i-1})$ and $x_1 = 0$.
- From this equation, we can express each element of the original array as $a_i = b_i + x_i$.
- We can maintain a running maximum variable (`max_val`) initialized to `0`. As we iterate through each element $b_i$:
  1. Calculate the current original element: $a_i = b_i + max-val$.
  2. Update the running maximum: $\text{max\_val} = \max(max-val, a_i)$.
  3. Output $a_i$.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, since we iterate through the input array of size $n$ once.
- **Space Complexity:** $O(1)$ auxiliary space, as we process and print each element on the fly without needing to store the full array.