# Problem Number - 1775A2 - Gardener and the Capybaras (hard version)

**Problem Link:** [https://codeforces.com/problemset/problem/1775/A2](https://codeforces.com/problemset/problem/1775/A2)

---

## Topics
- Constructive Algorithms
- Strings
- Greedy

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- Length of string $s$: $3 \le |s| \le 2 \cdot 10^5$
- Sum of lengths of strings $s$ over all test cases doesn't exceed $4 \cdot 10^5$
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to split a given string $s$ into three non-empty strings $a$, $b$, and $c$ such that $s = a + b + c$, and either ($a \le b$ and $c \le b$) or ($a \ge b$ and $c \ge b$) holds true.
- Since the string consists only of characters 'a' and 'b', we can analyze the second character of the string ($s[1]$):
  - If $s[1] == \text{'b'}$: We can split the string such that $a = s[0]$, $b = s[1 \dots n-2]$, and $c = s[n-1]$. Here, $b$ starts with 'b' and since $a$ and $c$ are single characters (either 'a' or 'b'), $b$ will naturally be greater than or equal to both $a$ and $c$ lexicographically (i.e., $a \le b$ and $c \le b$).
  - If $s[1] == \text{'a'}$: We can split the string as $a = s[0]$, $b = s[1]$, and $c = s[2 \dots n-1]$. Here, $b$ is 'a'. Since $c$ starts with 'a' or 'b', and $a$ is $s[0]$ ('a'), we satisfy the condition where $b \le a$ and $b \le c$ (or equivalently $a \ge b$ and $c \ge b$).
- This allows us to construct a valid triplet in $O(1)$ time per test case after inspecting the first few characters.

## Time and Space Complexity
- **Time Complexity:** $O(|s|)$ per test case, required to read the string and slice/print parts of it.
- **Space Complexity:** $O(|s|)$ to store the string elements.