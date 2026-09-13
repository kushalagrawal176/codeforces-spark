# Problem Number - 999B Reversing Encryption

**Problem Link:** [https://codeforces.com/problemset/problem/999/B](https://codeforces.com/problemset/problem/999/B)

---

## Topics
- Implementation
- Strings
- Number Theory (Divisors)

## Constraints
- $1 ≤ n ≤ 100$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem describes an encryption process where a string of length $n$ is modified by reversing its prefix of length $d$ for every divisor $d$ of $n$ in increasing order.
- To decrypt or reverse this process, we need to simulate the exact same operations or apply the reversals for every proper divisor $d$ of $n$ from $2$ to $n$.
- For each divisor $d$ that evenly divides $n$ ($n \pmod d == 0$), we reverse the substring from index $0$ to $d - 1$.
- After checking and processing all divisors up to $n$, the string will return to its original form.

## Time and Space Complexity
- **Time Complexity:** $O(n \cdot \sqrt{n})$ or $O(n^2)$ depending on how divisors are found and prefixes are reversed, which easily fits within the 1-second time limit for $n \le 100$.
- **Space Complexity:** $O(n)$ to store the string characters.