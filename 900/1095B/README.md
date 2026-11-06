# Problem Number - 1095B Array Stabilization

**Problem Link:** [https://codeforces.com/problemset/problem/1095/B](https://codeforces.com/problemset/problem/1095/B)

---

## Topics
- Sorting
- Greedy
- Constructive Algorithms

## Constraints
- $2 \le n \le 10^5$
- Elements of the array are between $1$ and $10^5$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem defines the "instability" of an array as the difference between its maximum and minimum elements: $\max(a) - \min(a)$.
- We are allowed to remove **at most one** element from the array to minimize this instability.
- When an array is sorted in non-decreasing order:
  - The maximum element is at the end ($a[n-1]$) and the minimum is at the beginning ($a[0]$).
- Removing an element can only affect either the maximum or the minimum value:
  1. If we remove the largest element ($a[n-1]$), the new maximum becomes the second-to-last element ($a[n-2]$), and the minimum remains $a[0]$. The instability becomes $a[n-2] - a[0]$.
  2. If we remove the smallest element ($a[0]$), the maximum remains $a[n-1]$, and the new minimum becomes the second element ($a[1]$). The instability becomes $a[n-1] - a[1]$.
- Therefore, after sorting the array, the minimum possible instability is the minimum of these two choices: $\min(a[n-2] - a[0], a[n-1] - a[1])$. 
- (Note: If $n = 2$, removing any element leaves a single element, which has an instability of 0, handled correctly by the logic since $a[0] - a[0] = 0$).

## Time and Space Complexity
- **Time Complexity:** $O(n \log n)$, due to sorting the array of size $n$.
- **Space Complexity:** $O(n)$ (or $O(1)$ if sorted in-place), to store the array elements.