# Problem Number - 1525B Permutation Sort

**Problem Link:** [https://codeforces.com/problemset/problem/1525/B](https://codeforces.com/problemset/problem/1525/B)

---

## Topics
- Greedy
- Constructive Algorithms
- Sortings
- Implementation

## Constraints
- $1 ≤ t ≤ 2000$ (number of test cases)
- $3 ≤ n ≤ 50$ (number of elements in the permutation)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Given a permutation of `1` to `n`, one operation lets you choose a subarray of length at most `n - 1` and sort it in ascending order.
- **0 operations:** The permutation is already sorted (`a[i] == i + 1` for all `0 ≤ i < n`).
- **1 operation:** Either `1` is already at the front (`a[0] == 1`) or `n` is already at the back (`a[n - 1] == n`). You can sort the remaining `n - 1` elements (from index `1` to `n - 1`, or `0` to `n - 2`) in a single operation.
- **2 operations:** Otherwise, the answer is at most `2`. You can first move `1` to index `0` or `n` to index `n - 1` by sorting a subarray of length `≤ n - 1` containing it, and then sort the remaining `n - 1` elements in a second operation. (Note: even if `a[0] == n` and `a[n - 1] == 1`, sorting `[0..n-2]` puts `n` at `n - 1`, and sorting `[1..n-1]` puts `1` at `0` and finishes sorting in **2** moves, not 3.)

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case to check if the array is sorted and inspect the boundary elements.
- **Space Complexity:** $O(n)$ to store the permutation (or $O(1)$ extra space if checked while reading).