# Problem Number - 1780B GCD Partition

**Problem Link:** [https://codeforces.com/problemset/problem/1780/B](https://codeforces.com/problemset/problem/1780/B)

---

## Topics
- Number Theory
- Math
- Greedy
- Prefix Sum

## Constraints
- $1 ≤ t ≤ 10^4$ (number of test cases)
- $2 ≤ n ≤ 2 × 10^5$ (length of array)
- $1 ≤ a[i] ≤ 10^9$ (elements of array)
- Sum of $n$ over all test cases doesn't exceed $2 × 10^5$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array of integers and we need to partition the array into multiple contiguous subarrays such that the sum of the Greatest Common Divisor (GCD) of all the individual subarray sums is maximized.
- However, the problem statement simplifies: we actually get the maximum possible GCD when we split the array into *two* non-empty contiguous parts (prefix and suffix). Splitting into more parts can only decrease or keep the GCD same, because the GCD of more elements is smaller than or equal to the GCD of their sub-sums.
- Thus, the problem reduces to finding a cut point `i` from `0` to `n-2` such that the GCD of the prefix sum (`arr[0...i]`) and the remaining suffix sum (`arr[i+1...n-1]`) is maximized.
- We can precompute the total sum of the array. Then, while iterating through the array to form the prefix sum incrementally, we can compute the suffix sum as `total_sum - prefix_sum` in O(1) time and find the maximum GCD across all possible partition points.

## Time and Space Complexity
- **Time Complexity:** $O(n log(sum))$, where `n` is the size of the array and `log(sum)` is the time taken to compute the GCD of the prefix and suffix sums. Across all test cases, it runs efficiently within the 1-second time limit.
- **Space Complexity:** $O(n)$ to store the array elements, or $O(1)$ auxiliary space if accumulated on the fly.