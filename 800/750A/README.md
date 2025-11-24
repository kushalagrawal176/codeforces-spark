# Problem Number - 750A New Year and Hurry

**Problem Link:** [https://codeforces.com/problemset/problem/750/A](https://codeforces.com/problemset/problem/750/A)

---

## Topics
- Implementation
- Math
- Greedy

## Constraints
- 1 ≤ `n` ≤ 10 (number of problems)
- 1 ≤ `k` ≤ 240 (minutes already spent before the contest)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The contest lasts 240 minutes in total.
- Each problem `i` takes `5 * i` minutes to solve.
- Polycarp spends `k` minutes before the contest, leaving `240 - k` minutes for solving problems.
- We need to find the maximum number of problems he can solve within the remaining time.
- Approach:
  1. Calculate the available time: `240 - k`.
  2. The total time to solve the first `m` problems is `5 * (1 + 2 + ... + m) = 5 * m * (m + 1) / 2`.
  3. Find the largest `m ≤ n` such that `5 * m * (m + 1) / 2 ≤ 240 - k`.
  4. Output `m`.
- Example:  
  - Input: `10 30`  
  - Available time = `210` minutes.  
  - Maximum `m` satisfying `5 * m * (m + 1) / 2 ≤ 210` is `9`.  
  - Output: `9`.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we may check each problem sequentially.  
- **Space Complexity:** `O(1)`, only a few variables are used.
