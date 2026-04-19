# Problem Number - 2196A Game with a Fraction

**Problem Link:** [https://codeforces.com/problemset/problem/2196/A](https://codeforces.com/problemset/problem/2196/A)

---

## Topics
- Math
- Implementation
- Game Theory

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `p`, `q` ≤ 10¹⁸
- Time limit per test: 2 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem is a simple decision game between Alice and Bob based on two integers `p` and `q`.
- Alice wins if either:
  - `3 * p < 2 * q`, meaning the fraction `p / q` is "too small", or
  - `p >= q`, meaning the fraction is greater than or equal to 1.
- Otherwise, Bob wins.
- This boils down to checking two conditions and printing the winner accordingly.

### Step-by-step reasoning:
1. Read the number of test cases `t`.
2. For each test case, read integers `p` and `q`.
3. Apply the condition:
   - If `3 * p < 2 * q` or `p >= q`, output `"Alice"`.
   - Else, output `"Bob"`.
4. No complex math or loops are required beyond iterating through test cases.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since each test case requires constant-time checks.
- **Space Complexity:** `O(1)`, as only a few variables are used.
