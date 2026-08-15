# Problem Number - 1820B JoJo's Incredible Adventures

**Problem Link:** [https://codeforces.com/problemset/problem/1820/B](https://codeforces.com/problemset/problem/1820/B)

---

## Topics
- Implementation
- Strings
- Two Pointers
- Math

## Constraints
- $1 \le t \le 2 \times 10^4$ (Number of test cases)
- $1 \le |s| \le 2 \times 10^5$ (Sum of lengths of strings over all test cases does not exceed $2 \times 10^5$)
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the maximum possible area of a subrectangle containing only `1`s on an $n \times n$ grid constructed by shifting the binary string $s$ cyclically.
- If the string contains no `0`s (i.e., all `1`s), the maximum area is $n \times n$.
- If there are `0`s, we can concatenate the string with itself ($s + s$) to handle the circular nature and find the maximum contiguous block of `1`s, let's call its length $m$.
- A contiguous block of length $m$ of `1`s in the expanded string corresponds to a diagonal chain of `1`s in the grid.
- The maximum area of a rectangle that can be formed from a contiguous segment of length $m$ can be maximized by choosing dimensions $h$ and $w$ such that $h + w = m + 1$ (or split evenly), maximizing the product $h \times w$.
- Mathematically, if the maximum consecutive ones is $m$, we can split it into $a = \lfloor m / 2 \rfloor$, and the maximum area becomes $(m - a) \times (1 + a)$.

## Time and Space Complexity
- **Time Complexity:** $O(|s|)$ per test case, as we iterate through the duplicated string of length $2|s|$ once to find the maximum contiguous length of `1`s.
- **Space Complexity:** $O(|s|)$ to store the duplicated string for each test case.