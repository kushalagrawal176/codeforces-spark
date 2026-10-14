# Problem Number - 1951A Dual Trigger

**Problem Link:** [https://codeforces.com/problemset/problem/1951/A](https://codeforces.com/problemset/problem/1951/A)

---

## Topics
- Greedy
- Strings
- Implementation

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- $2 \le n \le 50$ (number of lamps)
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given a binary string of length $n$ and can flip adjacent pairs or non-adjacent pairs depending on the problem rules, aiming to turn all characters into '0'.
- Count the total number of '1's in the string.
- If the total count of '1's is odd, it is impossible to make all elements '0', so the answer is **NO**.
- If the total count is even:
  - If the count is exactly 2 and the two '1's are adjacent (i.e., the substring `"11"` exists), we cannot clear them in a single valid operation without leaving others behind, so the answer is **NO**.
  - Otherwise, for any other even count of '1's, we can always clear them out, making the answer **YES**.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for counting the '1's and checking for adjacent pairs.
- **Space Complexity:** $O(n)$ to store the string, or $O(1)$ auxiliary space.