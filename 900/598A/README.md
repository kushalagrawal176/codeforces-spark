# Problem Number - 598A Tricky Sum

**Problem Link:** [https://codeforces.com/problemset/problem/598/A](https://codeforces.com/problemset/problem/598/A)

---

## Topics
- Math
- Implementation

## Constraints
- $1 ≤ t ≤ 100$ (number of test cases)
- $1 ≤ n ≤ 10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the sum of all numbers from 1 to `n`, but with all powers of 2 subtracted rather than added.
- First, calculate the total sum of numbers from 1 to `n` using the standard mathematical formula: `n * (n + 1) / 2`.
- Next, iterate through all powers of 2 less than or equal to `n` (i.e., 1, 2, 4, 8, ...). 
- Since these powers of 2 were initially added into our total sum, we need to subtract them twice: once to remove their positive contribution, and once more to account for the subtraction requirement. Thus, we subtract `2 * i` for each power of 2.

## Time and Space Complexity
- **Time Complexity:** `O(log n)` per test case, since the loop runs for each power of 2 up to `n`.
- **Space Complexity:** `O(1)`, as only a few variables are used to store the sum and loop state.