# Problem Number - 2209A Flip Flops

**Problem Link:** [https://codeforces.com/problemset/problem/2209/A](https://codeforces.com/problemset/problem/2209/A)

---

## Topics
- Implementation
- Arrays
- Sorting
- Greedy Approach

## Constraints
- 1 ≤ `t` ≤ 500 (number of test cases)
- 1 ≤ `n` ≤ 100 (size of array)
- Array elements and variables `c`, `k` can be large, so `long long` in C++ / `long` in Java is used
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires updating a value `c` based on the array elements and an additional resource `k`.
- Steps:
  - Sort the array `a`.
  - For each element `a[i]`:
    - If `a[i] <= c`:
      - If `k > 0`, calculate `mini = c - a[i]`.
      - Add `a[i] + min(k, mini)` to `c` and reduce `k` by `min(k, mini)`.
      - Otherwise, simply add `a[i]` to `c`.
- This greedy approach ensures that `c` grows optimally by leveraging both the array values and the available resource `k`.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case, due to sorting the array.
- **Space Complexity:** `O(n)`, for storing the array of size `n`.
