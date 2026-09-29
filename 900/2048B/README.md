# Problem 2048/B - Kevin and Permutation

**Problem Link:** [https://codeforces.com/problemset/problem/2048/B](https://codeforces.com/problemset/problem/2048/B)

---

## Topics
- Constructive Algorithms
- Greedy
- Permutations
- Math

## Constraints
- $1 ≤ t ≤ 1000$
- $1 ≤ k ≤ n ≤ 10^5$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to construct a permutation of numbers from 1 to n such that the sum of the minimums of all subarrays of length k is maximized.
- To maximize the minimum elements appearing in every window of size k, we want smaller elements to appear as infrequently as possible or to be grouped densely together so that they overlap within the k-sized windows.
- Conversely, placing the largest available elements at intervals of size k ensures that each window of length k captures one of these large numbers, significantly boosting the minimum values.
- We can use a two-pointer approach: maintain a pointer `j` starting from `n` downwards for the large numbers and `i` starting from `1` upwards for the small numbers. By placing `k-1` large elements followed by the smallest available element, we can optimally space out the values to maximize the sum of minimums.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, since we iterate through elements from 1 to n using two pointers.
- **Space Complexity:** $O(1)$ auxiliary space, as the construction is done on the fly using standard I/O.