# 1758B - XOR = Average

**Problem Link:** [https://codeforces.com/problemset/problem/1758/B](https://codeforces.com/problemset/problem/1758/B)

---

## Topics
- Constructive Algorithms
- Bitmasks
- Math

## Constraints
- $1 ≤ n ≤ 10^5$ (Sum of n over all test cases ≤ 10^5)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires constructing an array of length n such that the bitwise XOR sum of all elements equals their arithmetic average.
- If n is odd, we can simply fill the array with all 2s. The XOR sum of an odd number of identical elements (like 2) is 2, and their average is (2 × n) / n = 2, satisfying the condition.
- If n is even, we can start with the elements `1` and `3` (whose XOR sum is 1 ⊕ 3 = 2 and sum is 4), and fill the remaining n - 2 positions with `2`s.
- The total XOR sum will be (1 ⊕ 3) ⊕ (2 ⊕ 2 ⊕ ... ⊕ 2) = 2 ⊕ 0 = 2, and the total sum will be 1 + 3 + 2 × (n - 2) = 2n, resulting in an average of (2n) / n = 2.
- Thus, the XOR sum equals the average in both cases.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for printing the array elements.
- **Space Complexity:** $O(1)$, as only constant auxiliary space is used.