# Problem Number - 1709B Also Try Minecraft

**Problem Link:** [https://codeforces.com/problemset/problem/1709/B](https://codeforces.com/problemset/problem/1709/B)

---

## Topics
- Data Structures
- Prefix Sums
- Implementation

## Constraints
- $2 ≤ n ≤ 10^5$ (number of columns)
- $1 ≤ m ≤ 10^5$ (number of quests)
- $1 ≤ aᵢ ≤ 10^9$ (height of column)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- You are given `n` columns with heights `a₁, a₂, ..., aₙ` and `m` queries `(l, r)`. Moving from a higher column to a lower adjacent column deals fall damage equal to the height difference (`max(0, height_prev - height_curr)`), while moving to an equal or taller column deals `0` damage.
- Because `l` can be less than `r` (moving left to right) or greater than `r` (moving right to left), we handle both directions independently using precomputed cumulative damage arrays:
  - **Prefix array (`pre`):** `pre[i]` stores the total fall damage accumulated when walking from column `1` to column `i` (`i` from `2` to `n`). For `l < r`, the answer is `pre[r] - pre[l]`.
  - **Suffix array (`suff`):** `suff[i]` stores the total fall damage accumulated when walking backward from column `n` to column `i` (`i` from `n - 1` down to `1`). For `l > r`, the answer is `suff[r] - suff[l]`.
- Use 64-bit integers (`long` in Java / `long long` in C++) for cumulative sums because total fall damage can exceed a 32-bit signed integer.

## Time and Space Complexity
- **Time Complexity:** $O(n + m)$, to build the prefix and suffix arrays in $O(n)$ and answer each of the `m` queries in $O(1)$.
- **Space Complexity:** $O(n)$, for storing the column heights along with the prefix and suffix sum arrays.