# Problem Number - 1697B Promo

**Problem Link:** [https://codeforces.com/problemset/problem/1697/B](https://codeforces.com/problemset/problem/1697/B)

---

## Topics
- Sorting
- Greedy
- Prefix Sum

## Constraints
- $1 ≤ n, q ≤ 2 × 10^5$
- $1 ≤ a_i ≤ 10^6$
- $1 ≤ y ≤ x ≤ n$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the maximum possible total cost of items we can get for free, given multiple queries where we buy $x$ items and get the cheapest $y$ items out of those $x$ items for free.
- To maximize the value of the free items, we should pick the $x$ most expensive items overall. Among these $x$ items, the $y$ cheapest ones will be free.
- Therefore, we first sort the array of item prices in non-decreasing order.
- Using a prefix sum array allows us to quickly calculate the sum of any contiguous range in $O(1)$ time.
- For each query $(x, y)$, the $x$ items chosen correspond to a suffix of the sorted array, and the $y$ cheapest among them will form a subsegment at the beginning of that suffix. We use the prefix sum array to retrieve this sum efficiently.

## Time and Space Complexity
- **Time Complexity:** $O(n \log n + q)$, for sorting the array initially and then answering each of the $q$ queries in $O(1)$ time using prefix sums.
- **Space Complexity:** $O(n)$, for storing the element array and the prefix sum array.