# Problem Number - 2084B MIN = GCD

**Problem Link:** [https://codeforces.com/problemset/problem/2084/B](https://codeforces.com/problemset/problem/2084/B)

---

## Topics
- Number Theory
- GCD
- Implementation
- Sorting

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 2 ≤ `n` ≤ 10⁵ (array length per test case)
- 1 ≤ `a[i]` ≤ 10¹⁸ (array elements)
- Sum of n across all test cases ≤ 10⁵
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether we can rearrange the array such that there exists an index `i` where:
    **min(a1, a2, ..., ai) = gcd(a(i+1), a(i+2), ..., an)**
- Key observations:
  - The minimum element `mn` must be placed in the **left part** (otherwise the equality cannot hold).
  - For the right part, we need the GCD to equal `mn`. This is only possible if all chosen elements are **multiples of `mn`**.
  - Thus, the strategy is:
    1. Sort the array.
    2. Take the smallest element `a[0]` as `mn`.
    3. Compute the GCD of all elements divisible by `mn` (excluding one occurrence of `mn`).
    4. If this GCD equals `mn`, the answer is **YES**, otherwise **NO**.

- This works because:
  - Adding more multiples of `mn` to the right side cannot increase the GCD beyond `mn`.
  - If the GCD of those multiples reduces to `mn`, the condition is satisfied.

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting: `O(n log n)`  
  - GCD computation: `O(n log(max(a[i])))`  
- **Space Complexity:** `O(n)` for storing the array.