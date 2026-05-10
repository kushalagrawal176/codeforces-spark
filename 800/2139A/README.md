# Problem Number - 2139A Maple and Multiplication

**Problem Link:** [https://codeforces.com/problemset/problem/2139/A](https://codeforces.com/problemset/problem/2139/A)

---

## Topics
- Geedy
- Math
- Divisibility

## Constraints
- 1 ≤ `t` ≤ 100 
- 1 ≤ `a`, `b` ≤ 1000  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine the minimum number of multiplications Maple needs to make two integers equal.
- There are three possible outcomes:
  1. **Equal Case:** If `a == b`, no multiplication is needed → **answer = 0**.
  2. **Divisible case:** If one number divides the other (`a % b == 0` or `b % a == 0`), only one multiplication is needed → **answer = 1**.
  3. **General case:** Otherwise, Maple needs at least two multiplications → **answer = 2**.
- This logic directly follows from the definition of multiplication and divisibility.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we only check equality and divisibility.  
- **Space Complexity:** `O(1)`, no extra memory used beyond variables.  
