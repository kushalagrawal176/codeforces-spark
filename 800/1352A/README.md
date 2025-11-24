# Problem Number - 1352A Sum of Round Numbers

**Problem Link:** [https://codeforces.com/problemset/problem/1352/A](https://codeforces.com/problemset/problem/1352/A)

---

## Topics
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)
- 1 ≤ `n` ≤ 10^4 (number to be decomposed)
- Time limit per test: 1 second
- Memory limit: 256 megabytes

## Intuition / Approach
- The problem asks us to decompose a given integer `n` into a sum of "round numbers."  
- A round number is defined as a number with exactly one non-zero digit (like 400, 90, 5).
- To solve this, we process each digit of `n`:
  - If the digit is non-zero, we form a round number by multiplying the digit with its place value (10^i).
  - Collect all such round numbers.
- Finally, output the count of round numbers and the list itself.
- Example:  
  - Input: `n = 5009`  
  - Digits: 5 (thousands), 0 (hundreds), 0 (tens), 9 (ones)  
  - Round numbers: 5000, 9  
  - Output: 2 round numbers → `5000 9`

## Time and Space Complexity
- **Time Complexity:** `O(d)`, where `d` is the number of digits in `n` (at most 10). Very efficient.  
- **Space Complexity:** `O(d)`, for storing the round numbers.
