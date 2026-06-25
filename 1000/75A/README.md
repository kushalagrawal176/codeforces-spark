# Problem Number - 75A Life Without Zeros

**Problem Link:** [https://codeforces.com/problemset/problem/75/A](https://codeforces.com/problemset/problem/75/A)

---

## Topics
- Implementation
- Math
- String Manipulation

---

## Constraints
- Input integers `a` and `b` are positive and can be up to 10⁹ (since they fit within standard integer range).
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks whether removing all zeros from two integers `a` and `b`, and then summing them, gives the same result as removing zeros from their sum `(a + b)`.
- Steps:
  1. Compute `c = a + b`.
  2. Define a helper function `removeZero(n)` that removes all zero digits from `n`.
     - Iterate through digits of `n`.
     - Skip zeros, reconstruct the number without them.
  3. Compare `removeZero(a) + removeZero(b)` with `removeZero(c)`.
  4. If equal, print `"YES"`, otherwise `"NO"`.

This works because the problem essentially checks whether the digit-wise removal of zeros preserves the addition operation.

---

## Time and Space Complexity
- **Time Complexity:** `O(d)`, where `d` is the number of digits in the input numbers (at most 10 for 32-bit integers). Effectively constant time.  
- **Space Complexity:** `O(1)`, since only a few integer variables are used.  