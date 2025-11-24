# Problem Number - 155A I_love_%username%

**Problem Link:** [https://codeforces.com/problemset/problem/155/A](https://codeforces.com/problemset/problem/155/A)

---

## Topics
- Implementation
- Simulation

## Constraints
- 1 ≤ `n` ≤ 1000 (number of contests)
- 1 ≤ `score` ≤ 10000 (contest scores)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to count the number of times a contestant surprises the coach by achieving either:
  - A new maximum score (better than all previous scores).
  - A new minimum score (worse than all previous scores).
- Steps:
  1. Read the number of contests `n` and the sequence of scores.
  2. Initialize `maxScore` and `minScore` with the first score.
  3. Iterate through the remaining scores:
     - If the score is greater than `maxScore`, increment the counter and update `maxScore`.
     - If the score is less than `minScore`, increment the counter and update `minScore`.
  4. At the end, output the counter.
- Example:  
  - Input: `4` contests → scores: `100 50 200 150`  
  - Contest 2: 50 < 100 → new minimum → count = 1  
  - Contest 3: 200 > 100 → new maximum → count = 2  
  - Contest 4: 150 is not a new min or max → count remains 2  
  - Output: `2`

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through all scores once.  
- **Space Complexity:** `O(1)`, only a few variables are used.
