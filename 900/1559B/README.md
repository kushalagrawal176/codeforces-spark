# Problem Number - 1559/B - Mocha and Red and Blue

**Problem Link:** [https://codeforces.com/problemset/problem/1559/B](https://codeforces.com/problemset/problem/1559/B)

---

## Topics
- Dynamic Programming
- Greedy
- Strings

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $1 \le n \le 100$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to fill in the missing characters (`?`) in a string of colors ('R' and 'B') such that the number of adjacent pairs with the same color is minimized.
- If the string contains at least one known color ('R' or 'B'), we can greedily propagate known characters to adjacent `?` positions alternatingly (e.g., if a position is 'R', its neighbor `?` becomes 'B', and so on).
- We can iteratively replace patterns like `?R`, `R?`, `?B`, `B?`, etc., until all `?` adjacent to known characters are resolved.
- If the string consists entirely of `?`, we can arbitrarily start with any color (e.g., 'B') for the first character and alternate the rest.

## Time and Space Complexity
- **Time Complexity:** $O(n^2)$ in the worst case using string replacement iterations, or $O(n)$ with a linear two-pointer / DP approach.
- **Space Complexity:** $O(n)$ to store the string.