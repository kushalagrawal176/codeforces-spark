# Problem Number - 2031B Penchick and Satay Sticks

**Problem Link:** [https://codeforces.com/problemset/problem/2031/B](https://codeforces.com/problemset/problem/2031/B)

---

## Topics
- Greedy
- Sorting
- Implementation

## Constraints
- $1 ≤ t ≤ 2 \cdot 10^5$ (number of test cases)
- $1 ≤ n ≤ 2 × 10^5$ (length of the permutation)
- $1 \le p_i \le n$ (permutation)
- Sum of $n$ over all test cases does not exceed $2 × 10^5$
- Time limit per test: 1.5 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether we can sort a permutation of numbers from 1 to $n$ by swapping adjacent elements whose values differ by exactly 1.
- Because we can only swap adjacent elements with a difference of 1, any element can effectively only move left or right by at most one position relative to its original index (it can be swapped with a neighbor if their absolute difference is 1, which means elements can shift past each other if they are adjacent in value and position).
- For each element `a` at 1-based index `i`, if its distance from its target position (i.e., `abs(a - i)`) is greater than 1, it is impossible to move it to its correct sorted position.
- Thus, the condition reduces to checking whether `abs(a_i - i) <= 1` holds for all elements in the permutation. If it holds for all elements, the answer is "YES"; otherwise, "NO".

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per testcase, since we iterate through the array of size `n` once.
- **Space Complexity:** $O(1)$ auxiliary space (or $O(n)$ if storing the input array, though it can be processed on the fly).