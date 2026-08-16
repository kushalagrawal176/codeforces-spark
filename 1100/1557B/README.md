# Problem Number - 1557B Moamen and k-subarrays 

**Problem Link:** [https://codeforces.com/problemset/problem/1557/B](https://codeforces.com/problemset/problem/1557/B)

---

## Topics
- Greedy
- Sorting

## Constraints
- $1 \le t \le 10^3$ (number of test cases)
- $1 \le n \le 10^5$ (sum of $n$ over all test cases does not exceed $2 \cdot 10^5$)
- $1 \le k \le n$
- $0 \le a_i \le 10^9$
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array of $n$ integers and need to determine if we can split the array into at most $k$ subarrays such that when these subarrays are concatenated in some order, the final array becomes sorted in non-decreasing order.
- To minimize the number of subarrays needed, we should keep elements that are consecutive in the sorted version of the array together in the same subarray.
- First, store the elements alongside their original indices or map each element to its original position using a sorted map/structure.
- When the elements are sorted by their values, count how many elements immediately follow their original adjacent position (i.e., the original index of the current element in the sorted sequence is exactly 1 greater than the index of the previous element in the sorted sequence). Each such transition means we can merge them into a single continuous subarray.
- If the number of resulting subarrays is $\le k$, then it is possible, so the answer is **YES**; otherwise, it is **NO**.

## Time and Space Complexity
- **Time Complexity:** $O(n \log n)$ due to sorting the elements.
- **Space Complexity:** $O(n)$ to store the array elements and their respective original indices.