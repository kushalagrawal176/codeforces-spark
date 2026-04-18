# Problem Number - 2209C Find the Zero

**Problem Link:** [https://codeforces.com/problemset/problem/2209/B](https://codeforces.com/problemset/problem/2209/B)

---

## Topics
- Interactive Problems
- Implementation
- Conditional Logic

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)
- 2 ≤ `n` ≤ 10⁴ (size of sequence)
- Time limit per test: 2 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- This is an **interactive problem**, meaning the program must query the judge and respond based on inputs.
- The goal is to identify the position of the zero in a sequence using queries of the form `? i j`.
- Strategy:
  - Iterate through pairs `(i, i+1)` for odd indices starting from 3, querying the judge.
  - If the response is `1`, update the candidate index `idx`.
  - Perform additional queries `? 1 3` and `? 1 4` to refine the candidate index.
  - Finally, if no candidate index is found, output `! 2`; otherwise, output `! idx`.
- This ensures the zero’s position is correctly identified through minimal queries.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through pairs up to `2n`.
- **Space Complexity:** `O(1)`, as only a few variables are used to track the candidate index and responses.
