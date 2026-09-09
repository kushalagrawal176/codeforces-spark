# Problem Number - 1631B Fun with Even Subarrays

**Problem Link:** [https://codeforces.com/problemset/problem/1631/B](https://codeforces.com/problemset/problem/1631/B)

---

## Topics
- Greedy
- Implementation

## Constraints
- $1 ≤ t ≤ 2 × 10⁴$ (Number of test cases)
- $1 ≤ n ≤ 2 × 10⁵$ (Length of the array)
- $1 ≤ a_i ≤ n$ (elements of the array)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum number of operations to make all elements of the array equal. In one operation, we can choose an even-length subarray and overwrite its first half with its second half.
- To minimize the operations, we should work backwards from the end of the array. The final array must consist entirely of elements equal to the last element of the array (`a[n-1]`).
- We can maintain a suffix of identical elements matching `a[n-1]` (let its current length be `len`). 
- We scan backwards from the first element immediately preceding this suffix. As long as elements match `a[n-1]`, we expand our suffix length.
- Once we encounter an element that does **not** match `a[n-1]`, we must perform an operation. We choose a subarray of length `2 * len` ending at or covering this mismatch, which doubles our matched suffix size in a single operation.
- We repeat this process until the entire array is covered (i.e., the suffix length reaches `n`).

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per testcase, as each element is processed a constant number of times.
- **Space Complexity:** $O(n)$ to store the array elements.