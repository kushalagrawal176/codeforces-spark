# Problem Number 1771A - Hossam and Combinatorics

**Problem Link:** [https://codeforces.com/problemset/problem/1771/A](https://codeforces.com/problemset/problem/1771/A)

---

## Topics
- Combinatorics
- Sorting
- Implementation
- Math

## Constraints
- $1 \le t \le 100$ (Number of test cases)
- $2 \le n \le 10^5$ (Number of elements in the array)
- $1 \le a_i \le 10^5$ (Elements of the array)
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the number of pairs $(i, j)$ with $i \neq j$ such that the absolute difference $|a_i - a_j|$ is **maximized**.
- The maximum possible absolute difference in any array is always achieved between its minimum element and its maximum element: `max(a) - min(a)`.
- **Case 1: All elements are equal.** 
  - If all elements in the array are the same, the maximum difference is `0`. 
  - Any pair of distinct indices $(i, j)$ will give this difference. Thus, the total number of pairs is $n \times (n - 1)$.
- **Case 2: All elements are not equal.**
  - The maximum difference is strictly greater than `0`. To achieve this maximum difference, we must pair a minimum element with a maximum element.
  - Count how many times the minimum element (`a[0]` after sorting) and the maximum element (`a[n-1]` after sorting) appear in the array.
  - The number of valid pairs is `count(min) × count(max) × 2` (multiplied by 2 because order matters: choosing min then max, or max then min).

## Time and Space Complexity
- **Time Complexity:** $O(n \log n)$ due to sorting the array of size $n$ (can also be optimized to $O(n)$ by finding min and max in a single pass).
- **Space Complexity:** $O(n)$ to store the array elements (or $O(1)$ auxiliary space if sorted in-place).