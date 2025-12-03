# Problem 731A - Night at the Museum

**Problem Link:** [https://codeforces.com/problemset/problem/731/A](https://codeforces.com/problemset/problem/731/A)

---

## Topics
- Math
- Implementation
- Greedy

## Constraints
- 1 ≤ `|s|` ≤ 100
- s consists of only lowercase English letters
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Grigoriy must print exhibit names on a circular alphabet wheel (a-z) starting from 'a'.
- For each consecutive pair of letters, calculate minimum rotations: clockwise or counterclockwise.
- Distance between chars c1 and c2 is `min(|c1-c2|, 26-|c1-c2|)` due to circular nature.
- Sum minimum distances from 'a' → s[0] → s[1] → ... → s[n-1].

## Time and Space Complexity
- **Time Complexity:** `O(n)`, single pass through string
- **Space Complexity:** `O(1)`, only storing current position
