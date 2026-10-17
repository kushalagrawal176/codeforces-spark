# Problem 1494A - ABC String

**Problem Link:** [https://codeforces.com/problemset/problem/1494/A](https://codeforces.com/problemset/problem/1494/A)

---

## Topics
- Strings
- Brute Force
- Bitmask / Implementation

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- Length of string $s$ is between 2 and 50, and is always even.
- The string consists of characters 'A', 'B', and 'C'.
- Time limit per test: 2 seconds
- Memory limit per test: 512 megabytes

## Intuition / Approach
- The problem asks whether a given string $s$ consisting of characters 'A', 'B', and 'C' can be transformed into a regular bracket sequence by replacing each character with either an opening bracket `(` or a closing bracket `)`.
- Since there are 3 unique characters ('A', 'B', and 'C') and each can map to either `(` (+1) or `)` (-1), there are $2^3 = 8$ possible mapping combinations.
- We can iterate through all 8 possible configurations using a bitmask from `0` to `7`. For each configuration, we check whether mapping the characters accordingly yields a valid bracket sequence (i.e., running balance never drops below zero, and the final balance equals zero).
- If any of the 8 configurations results in a valid bracket sequence, we output "YES"; otherwise, after checking all possibilities, we output "NO".

## Time and Space Complexity
- **Time Complexity:** $O(8 \times N) = O(N)$, where $N$ is the length of the string, because we check 8 different mapping options and iterate through the string of length $N$ for each option.
- **Space Complexity:** $O(1)$, as only a few variables are used for tracking sums and flags.