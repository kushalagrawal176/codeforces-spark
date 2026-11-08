# Problem Number - 1467A Wizard of Orz

**Problem Link:** [https://codeforces.com/problemset/problem/1467/A](https://codeforces.com/problemset/problem/1467/A)

---

## Topics
- Greedy
- Constructive Algorithms
- Math

## Constraints
- $1 ≤ t ≤ 100$ (number of test cases)
- $1 ≤ n ≤ 2 \cdot 10^5$ (length of the string)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the maximum possible number we can form on the screen of length `n` by choosing an optimal starting position and stopping at the optimal time during the first second.
- For `n = 1`, the only possible digit we can leave on the screen is `9`.
- For `n ≥ 2`, we can always choose to start at the second panel (0-indexed position 1), which starts at digit `8`. In the first second, we can change it to `9`. Simultaneously, the first panel (position 0) becomes `8` because it cycles backwards.
- Thus, the first few digits of the optimal number always start with `9`, followed by `8`, `9`, `0`, `1`, `2`, `3`, `4`, `5`, `6`, and so on, repeating in a cyclic pattern modulo 10 starting from `8`.
- Specifically, the first digit is always `9`, and for the remaining `n - 1` positions, the $i$-th digit (0-indexed) is given by $(8 + i) \pmod{10}$.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, to print the `n` digits.
- **Space Complexity:** $O(1)$, as we generate and print the characters on the fly without storing the entire string.