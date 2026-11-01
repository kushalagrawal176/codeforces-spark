# 1720A - Burenka Plays with Fractions

**Problem Link:** [https://codeforces.com/problemset/problem/1720/A](https://codeforces.com/problemset/problem/1720/A)

---

## Topics
- Math
- Implementation
- Number Theory

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $0 \le a, c \le 10^9$
- $1 \le b, d \le 10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum number of operations (multiplying a fraction's numerator by an integer $k \ge 1$) to make two fractions $\frac{a}{b}$ and $\frac{c}{d}$ equal.
- By cross-multiplying, we can compare $x = a \cdot d$ and $y = b \cdot c$. Note that since $a, b, c, d$ can be up to $10^9$, their products can exceed 32-bit integer limits, so `long long` must be used.
- **0 Operations:** If $x == y$, the fractions are already equal, requiring `0` operations.
- **1 Operation:** If one cross-product is a non-zero multiple of the other (i.e., $y \% x == 0$ or $x \% y == 0$), we can multiply one of the fractions by the required factor in `1` operation.
- **2 Operations:** If neither of the above conditions is met, we can always make them equal in at most `2` operations (for instance, by multiplying each fraction's numerator by the other's cross-product component). Thus, the answer is never greater than `2`.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per testcase, as it only requires basic arithmetic operations and comparisons.
- **Space Complexity:** $O(1)$, using a constant amount of extra memory.