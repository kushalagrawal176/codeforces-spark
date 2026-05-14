# Problem Number - 2149C MEX rose

**Problem Link:** [https://codeforces.com/problemset/problem/2149/C](https://codeforces.com/problemset/problem/2149/C)

---

## Topics
- Implementation
- Greedy
- Arrays

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2 × 10⁵ (array length)
- 0 ≤ `k` ≤ `n`
- 0 ≤ `aᵢ` ≤ `n`
- Sum of `n` across all test cases ≤ 2 × 10⁵
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The task is to make the **MEX of the array equal to k** using the minimum number of operations.
- Recall: **MEX(a)** is the smallest non-negative integer not present in the array.
- To achieve `MEX(a) = k`, two conditions must hold:
  1. All integers from `0` to `k-1` must appear in the array.
  2. The integer `k` must **not** appear in the array.
- Operations allowed: Replace any element with an integer in `[0, n]`.

### Steps:
1. Count the frequency of each number in the array.
2. For numbers `0` to `k-1`:
   - If any are missing, each missing number requires one operation.
   - Let `op` = number of missing values in `[0, k-1]`.
3. For number `k`:
   - If it appears `freq[k]` times, we must remove all occurrences (each removal is one operation).
4. The minimum operations required = **max(op, freq[k])**.
   - Because if `op` is larger, we must add missing numbers.
   - If `freq[k]` is larger, we must remove extra `k`s.

This greedy approach ensures the array satisfies both conditions with minimal changes.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (counting frequencies and checking conditions).
- **Space Complexity:** `O(n)` for frequency array.