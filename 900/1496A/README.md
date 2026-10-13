# Problem Number - 1496A Split it!

**Problem Link:** [https://codeforces.com/problemset/problem/1496/A](https://codeforces.com/problemset/problem/1496/A)

---

## Topics
- Greedy
- Strings

## Constraints
- $1 ≤ t ≤ 1000$ (Number of test cases)
- $2 ≤ n ≤ 100$ (length of string)
- $0 ≤ k ≤ n/2$ (parameter)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether a given string $s$ of length $n$ can be split into $2k + 1$ parts such that $s = A_1 A_2 \dots A_k A_{k+1} A_k^R \dots A_2^R A_1^R$, where $A^R$ denotes the reversed string of $A$, and each $A_i$ is non-empty.
- This configuration implies that the prefix of length $k$ must be equal to the reverse of the suffix of length $k$. In other words, $s[0 \dots k-1]$ must match the reverse of $s[n-k \dots n-1]$, which means $s[i] == s[n-1-i]$ for all $0 \le i < k$.
- Additionally, because there must be at least $2k + 1$ distinct non-empty segments, the middle segment must also be non-empty, meaning $2k < n$.
- Therefore, the answer is "YES" if and only if the first $k$ characters form a palindrome-like mirror image with the last $k$ characters, and $2k < n$. Otherwise, the answer is "NO".

## Time and Space Complexity
- **Time Complexity:** $O(k)$ per testcase, since we check up to $k$ characters from both ends. Given $k \le n \le 100$, this takes well under the time limit.
- **Space Complexity:** $O(n)$ to store the string $s$ per test case.