# Problem Number - 1857B Maximum Rounding

**Problem Link:** [https://codeforces.com/problemset/problem/1857/B](https://codeforces.com/problemset/problem/1857/B)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- The total length of strings across all test cases is typically $\le 2 \cdot 10^5$.
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The goal is to maximize a number by choosing a position and rounding the digits to the right of it. Rounding at a position $i$ means if the digit at $i$ is $\ge 5$, the digit at $i-1$ is incremented, and all digits from $i$ onwards become 0.
- Since we want the *maximum* possible result, we should process the number from right to left.
- Whenever we encounter a digit $\ge 5$, we increment the digit to its left. This might trigger a chain reaction of carries.
- We maintain the leftmost index where a rounding operation occurred. All digits at or to the right of this index effectively become '0' in the final result.
- We prepend a '0' to the number initially to handle the edge case where the rounding carries over the most significant digit (e.g., 99 rounded becomes 100).

## Time and Space Complexity
- **Time Complexity:** $O(n)$, where $n$ is the number of digits in the string, as we iterate through the digits.
- **Space Complexity:** $O(n)$ to store the digits of the number as a string.