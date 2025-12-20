# Problem Number - 1539C Stable Groups

**Problem Link:**  
https://codeforces.com/problemset/problem/1539/C

---

## Topics
- Greedy
- Sorting
- Math

---

## Constraints
- 1 ≤ `n` ≤ 2 × 10⁵  
- 0 ≤ `k` ≤ 10¹⁸  
- 1 ≤ `x` ≤ 10¹⁸  
- 1 ≤ `aᵢ` ≤ 10¹⁸  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes

---

## Intuition / Approach

- You are given `n` integers representing levels.
- A **stable group** is defined such that the difference between any two consecutive elements (after sorting) is at most `x`.
- If the difference between two adjacent sorted elements is greater than `x`, they **must belong to different groups** unless we insert additional elements.
- You are allowed to insert at most `k` new elements anywhere to reduce these gaps.

### Key Observations

- First, **sort the array** to easily observe gaps between adjacent elements.
- Any gap `diff = a[i] - a[i-1]` where `diff > x` creates a new group.
- To merge such a gap, we need to insert extra elements so that the maximum difference becomes ≤ `x`.

### How many elements are needed to fix a gap?

For a gap `diff`:
    `needed = (diff - 1) / x`

This gives the minimum number of elements required to break the gap into smaller parts of size ≤ `x`.

### Greedy Strategy

- Compute how many elements are needed for each invalid gap.
- Sort these required values.
- Use the available `k` to fix the **smallest gaps first**, because fixing one gap reduces the number of groups by 1.
- Stop when `k` is insufficient to fix the next gap.

---

## Time and Space Complexity

- **Time Complexity:** `O(n log n)` Sorting the array and sorting the gaps.
- **Space Complexity:** `O(n)` Extra space used to store gaps.