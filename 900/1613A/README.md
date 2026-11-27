# Problem Number - 1613A Long Comparison

**Problem Link:** [https://codeforces.com/problemset/problem/1613/A](https://codeforces.com/problemset/problem/1613/A)

---

## Topics
- Implementation
- Math

## Constraints
- $1 ≤ t ≤ 10^4$ (number of testcases)
- $1 ≤ x1, x2 ≤ 10^6$
- $0 ≤ p1, p2 ≤ 10^6$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Each number is given in compressed scientific-like form as `x` followed by `p` zeros, representing `x × 10^p`. Because `p` can be up to 10^6, constructing the full integer strings or evaluating `10^p` directly is impractical.
- The total number of digits in `x × 10^p` is `len(x) + p`, where `len(x)` is the number of decimal digits in `x`.
- If `len(x1) + p1 > len(x2) + p2`, the first number has strictly more digits and is greater (`>`). Similarly, if `len(x1) + p1 < len(x2) + p2`, the second number is greater (`<`).
- If `len(x1) + p1 == len(x2) + p2`, both numbers have the exact same total number of digits. We can pad the shorter base (`x1` or `x2`) with trailing zeros so both bases have equal length, then compare them lexicographically (or numerically) to output `>`, `<`, or `=`.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case (since `x1, x2 ≤ 10^6`, each number has at most 7 digits).
- **Space Complexity:** $O(1)$, only constant extra space is used.