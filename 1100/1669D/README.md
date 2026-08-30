# Problem Number - 1669D Colorful Stamp

**Problem Link:** [https://codeforces.com/problemset/problem/1669/D](https://codeforces.com/problemset/problem/1669/D)

---

## Topics
- Greedy
- Strings
- Implementation

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n \le 10^5$ (length of the string)
- Sum of $n$ over all test cases does not exceed $2 \cdot 10^5$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether a given string of colors consisting of 'R' (Red), 'B' (Blue), and 'W' (White) can be formed using a stamp that colors any two adjacent cells simultaneously with 'R' and 'B' in some order.
- Each stamp operation requires placing both a Red and a Blue part on adjacent cells. Therefore, any contiguous segment of non-white characters (separated by 'W') must contain **both** at least one 'R' and at least one 'B'.
- If a contiguous colored segment contains only 'R's or only 'B's, it is impossible to form because the stamp always lays down both colors.
- We iterate through the string character by character, tracking whether we have seen 'R' and 'B' in the current non-white segment. When a 'W' is encountered or the string ends, we validate that if a segment had colors, it contained both types.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, as we iterate through the string of length $n$ once.
- **Space Complexity:** $\mathcal{O}(n)$ to store the input string, or $\mathcal{O}(1)$ auxiliary space for state tracking.