# Problem Number - 1768B Quick Sort

**Problem Link:** [https://codeforces.com/problemset/problem/1768/B](https://codeforces.com/problemset/problem/1768/B)

---

## Topics
- Greedy
- Math
- Sortings

## Constraints
- $1 ≤ t ≤ 10^4$ (number of test cases)
- $2 ≤ n ≤ 10^5$
- $1 ≤ k ≤ n$
- $1 ≤ p_i ≤ n$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum number of operations to sort a permutation of numbers from 1 to `n`. In one operation, we can pick `k` elements and place them at the end of the array in their relative sorted order.
- To minimize the operations, we want to keep as many elements already correctly positioned as a sorted subsequence starting from `1`, `2`, ..., up to some value `count`.
- We iterate through the array and check if the current element matches `count + 1`. If it does, we increment `count` because this element is already part of the optimal sorted chain that doesn't need to be moved.
- The remaining elements that need to be repositioned total `n - count`. Since we can move up to `k` elements in a single operation, the minimum number of operations required is `⌈(n - count) / k⌉`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for iterating through the permutation of size `n`.
- **Space Complexity:** $O(1)$, as we process elements on the fly without storing the entire array.