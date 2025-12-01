# Problem Number - 1872D Plus Minus Permutation

**Problem Link:** [https://codeforces.com/problemset/problem/1872/D](https://codeforces.com/problemset/problem/1872/D)

---

## Topics
- Number Theory
- Math
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)
- 1 ≤ `n` ≤ 10^9
- 1 ≤ `x`, `y` ≤ n
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to maximize the sum of numbers divisible by `x` and minimize the sum of numbers divisible by `y` within the range `[1, n]`.
- Numbers divisible by both `x` and `y` (i.e., divisible by `lcm(x, y)`) should be excluded from both counts to avoid double counting.
- Let:
  - `n1 = count of numbers divisible by x but not y`
  - `n2 = count of numbers divisible by y but not x`
- To maximize the sum for `x`, we take the **largest `n1` numbers** from `1..n`.
- To minimize the sum for `y`, we take the **smallest `n2` numbers** from `1..n`.
- The formula becomes:
  - `sum1 = sum of largest n1 numbers = (n1*(n1+1))/2 + (n-n1)*n1`
  - `sum2 = sum of smallest n2 numbers = (n2*(n2+1))/2`
- The answer is `sum1 - sum2`.

## Time and Space Complexity
- **Time Complexity:** `O(log(min(x, y)))` per test case.
- **Space Complexity:** `O(1)`, only constant space used for variables.
