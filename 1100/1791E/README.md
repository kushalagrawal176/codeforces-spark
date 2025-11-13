# Problem Number - 1791E Negatives and Positives

**Problem Link:** [https://codeforces.com/problemset/problem/1791/E](https://codeforces.com/problemset/problem/1791/E)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- 1 ≤ t ≤ 1000 (number of test cases)
- 2 ≤ n ≤ 2 × 10⁵ (array size per test case)
- -10⁹ ≤ a[i] ≤ 10⁹ (array elements)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to maximize the sum of the array after applying any number of operations where we can flip the sign of **two elements simultaneously**.
- Key observations:
  - Flipping two negatives makes them positive, which increases the sum.
  - Flipping two positives makes them negative, which decreases the sum (not optimal).
  - Flipping one negative and one positive just swaps their signs, leaving the sum unchanged.
- Therefore, the optimal strategy is:
  - Convert as many negatives as possible into positives.
  - If the number of negatives is **odd**, one negative will remain. To minimize the loss, we should leave the smallest absolute value element as negative.
  - If the number of negatives is **even**, then all negatives can be converted to positives and sum will be maximum.
- Steps:
  1. Count the number of negative elements.
  2. Compute the sum of absolute values of all elements.
  3. If the count of negatives is odd, subtract twice the smallest absolute value from the sum (since one element must remain negative).
- This greedy approach ensures the maximum possible sum.

## Time and Space Complexity
- **Time Complexity:** O(n) per test case, since we iterate through the array once.
- **Space Complexity:** O(1), only constant extra space used for counters and tracking minimum absolute value.
