# Problem Number - 118B Present from Lena  
**Problem Link:** [https://codeforces.com/problemset/problem/118/B](https://codeforces.com/problemset/problem/118/B)

---

## Topics

- Implementation  
- Pattern Printing  
- Math

## Constraints

- 2 ≤ n ≤ 9  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes

## Intuition / Approach

- The problem requires printing a symmetric rhombus pattern using digits from 0 to `n`.
- The pattern consists of `2n + 1` lines, where the middle line contains the full sequence from `0` to `n` and back to `0`.
- Each line is centered with appropriate leading spaces, and the digits increase from `0` up to a peak value and then decrease symmetrically.
- For line `i` (where `i` ranges from `0` to `2n`), the peak digit is `n - abs(i - n)`.
- The number of leading spaces is `2 * abs(i - n)`, and the digits are printed with single spaces between them.
- The approach involves:
  - Calculating the peak digit for each line.
  - Printing leading spaces.
  - Printing digits from `0` to peak and back to `0`.

## Time and Space Complexity

- **Time Complexity:**  O(n²), due to nested loops for printing each line and its digits.  
- **Space Complexity:** O(1), as no extra space is used beyond variables for iteration.