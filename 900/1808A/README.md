# Problem Number - 1808A Lucky Numbers

**Problem Link:** [https://codeforces.com/problemset/problem/1808/A](https://codeforces.com/problemset/problem/1808/A)

---

## Topics
- Brute Force
- Implementation
- Number Theory

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le l \le r \le 10^6$
- Time limit per test: 1.0 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A "lucky" number in this context is defined as a number where the difference between its maximum digit and its minimum digit is as large as possible.
- For a given range $[l, r]$, we need to find the number that maximizes the "luckiness" (i.e., $\max(\text{digits}) - \min(\text{digits})$).
- Since $r - l$ is typically small in the worst cases (or since numbers with a difference of 9 like numbers containing '9' and '0' can be found quickly), we can iterate through the numbers from $l$ to $r$. 
- Optimization: In practice, if we encounter a number whose luckiness is 9, we can immediately break early because 9 is the absolute maximum possible difference between any two digits in a decimal number.
- Furthermore, since the gap between numbers that achieve a high luckiness score in any range is small (at most around 100 numbers), iterating or bounded searching is extremely efficient.

## Time and Space Complexity
- **Time Complexity:** $O((r - l) \times \log_{10}(r))$ in the worst case, but practically much faster due to the early break condition when luckiness equals 9 (often bounded within checking at most 100 elements per test case).
- **Space Complexity:** $O(1)$, as only a few scalar variables are used to keep track of digits and maximum differences.