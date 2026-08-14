# Problem Number - 1342B Binary Period

**Problem Link:** [https://codeforces.com/problemset/problem/1342/B](https://codeforces.com/problemset/problem/1342/B)

---

## Topics
- Strings
- Greedy
- Constructive Algorithms

## Constraints
- $1 \le T \le 100$ (number of test cases)
- $1 \le t \le 100$ (length of the string for each test case)
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find a new string $t$ of length $2|s|$ (or any suitable length, though repeating `01` works cleanly) which has a period of 1 (meaning all adjacent characters are different) and contains $s$ as a subsequence.
- **Case 1 (All characters are the same):** If all characters in the string $s$ are identical (either all `0`s or all `1`s), then no alternating pattern is needed. We can just output $s$ itself, because it already has a period of 1.
- **Case 2 (Contains both `0` and `1`):** If the string contains both `0` and `1`, we can construct a new string by repeating the pattern `"01"` length times (i.e., $|s|$ times). This alternating string `"0101...01"` of length $2|s|$ will naturally contain any binary string of length $|s|$ as a subsequence while maintaining a strict period of 1.

## Time and Space Complexity
- **Time Complexity:** $O(|s|)$ per test case, to check if all characters are the same and to construct the result string.
- **Space Complexity:** $O(|s|)$, to store the input string and the generated output string.