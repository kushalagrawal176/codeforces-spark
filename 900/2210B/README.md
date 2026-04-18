# Problem Number - 2210B Simply Sitting on Chairs

**Problem Link:** [https://codeforces.com/problemset/problem/2210/B](https://codeforces.com/problemset/problem/2210/B)

---

## Topics
- Implementation
- Arrays
- Conditional Logic

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2⋅10⁵ (number of chairs)
- Each element of array `a` is an integer representing a chair index
- Time limit per test: 1.5 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires counting how many chairs satisfy a certain condition.
- For each test case:
  - Read the array `a` of size `n`.
  - For each chair `i`, check if `a[i] >= a[a[i] - 1]`.
  - If the condition holds, increment the counter.
- Finally, print the count for each test case.
- The logic ensures that each chair’s value is compared with the value at its referenced position, capturing the required condition.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once.
- **Space Complexity:** `O(n)`, for storing the array of chair indices.
