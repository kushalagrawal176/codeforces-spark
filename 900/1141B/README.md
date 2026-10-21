# Problem Number - 1141B Maximal Continuous Rest

**Problem Link:** [https://codeforces.com/problemset/problem/1141/B](https://codeforces.com/problemset/problem/1141/B)

---

## Topics
- Implementation
- Brute Force

## Constraints
- $1 \le n \le 2 \cdot 10^5$ (number of hours per day)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the maximum number of consecutive hours Polycarp can rest (represented by `1`s) given a schedule that repeats cyclically every $n$ hours.
- Because the schedule is cyclic, a rest period can span across the end of the array and continue into the beginning.
- To handle this circular nature easily, we can iterate up to $2n$ times using the modulo operator (`i % n`). 
- We maintain a running counter (`cur`) for current consecutive `1`s and update the maximum length found so far (`max_len`). Whenever we encounter a `0`, we reset `cur` to `0`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, since we iterate through a loop of length $2n$ once.
- **Space Complexity:** $O(n)$, to store the array elements.