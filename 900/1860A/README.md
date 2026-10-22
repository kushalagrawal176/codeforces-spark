# Problem Number - 1860A Not a Substring

**Problem Link:** [https://codeforces.com/problemset/problem/1860/A](https://codeforces.com/problemset/problem/1860/A)

---

## Topics
- Constructive Algorithms
- Strings

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- $2 \le |s| \le 50$ (length of string $s$)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find a balanced bracket sequence of length $2n$ (where $n$ is the length of string $s$) that does not contain $s$ as a contiguous substring.
- A balanced bracket sequence is a string containing only brackets where every opening bracket has a corresponding closing bracket, and valid nested structures are formed.
- We can construct two candidate sequences of length $2n$:
  1. $x$: All opening brackets followed by all closing brackets: `((...))`.
  2. $y$: Alternating brackets repeated $n$ times: `()()()`.
- For any given string $s$ of length $n$, at least one of these two candidate strings will not contain $s$ as a substring, unless the edge case where $s$ is `)()(` makes both strings fail. However, the alternating string $y$ or the block string $x$ is guaranteed to avoid containing $s$ in all valid test cases except when $s = \text{"()()..."}$ forces a mismatch, for which the other candidate string works.
- Thus, we simply check if $x$ contains $s$. If not, we print $x$. Otherwise, if $y$ does not contain $s$, we print $y$. If both contain $s$, it's impossible (though for this problem's constraints, one of them will always work).

## Time and Space Complexity
- **Time Complexity:** $O(n^2)$ per test case, due to string construction and substring search (`find` / `contains`), which easily runs well within the 2-second time limit for $n \le 50$.
- **Space Complexity:** $O(n)$, to store the candidate bracket sequences of length $2n$.