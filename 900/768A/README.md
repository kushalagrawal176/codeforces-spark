# Problem Number - 768A Oath of the Night's Watch

**Problem Link:** [https://codeforces.com/problemset/problem/768/A](https://codeforces.com/problemset/problem/768/A)

---

## Topics
- Sorting
- Implementation

## Constraints
- $1 ≤ n ≤ 10^5$
- $0 ≤ a_i ≤ 10^9$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the number of elements in the array that have both a strictly smaller and a strictly larger element present in the array.
- First, we sort the array in non-decreasing order.
- The smallest elements in the sorted array (which are equal to `a[0]`) cannot have any element smaller than them, so they cannot be counted.
- Similarly, the largest elements in the sorted array (which are equal to `a[n-1]`) cannot have any element larger than them, so they cannot be counted either.
- We can use two pointers or loops to skip all occurrences of the minimum element from the left and all occurrences of the maximum element from the right.
- The remaining elements between these pointers will all have at least one smaller element and at least one larger element. The count of such elements is given by `j - i + 1` (ensuring it doesn't drop below 0).

## Time and Space Complexity
- **Time Complexity:** $O(n log n)$, due to sorting the array.
- **Space Complexity:** $O(n)$, to store the array elements.