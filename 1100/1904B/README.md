# Problem 1904B - Collecting Game

**Problem Link:** [https://codeforces.com/problemset/problem/1904/B](https://codeforces.com/problemset/problem/1904/B)

---

## Topics
- Sorting
- Greedy
- Prefix Sums
- Two Pointers / Binary Search (Implicit via monotonic properties)

## Constraints
- $1 \le t \le 5000$ (number of test cases)
- $1 \le n \le 10^5$ (sum of $n$ over all test cases $\le 2 \cdot 10^5$)
- $1 \le a_i \le 10^9$
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find, for each element in the array, how many total elements can be collected if we start with that element's value and greedily absorb all smaller or equal available elements whose values are less than or equal to our current running sum.
- **Sorting & Original Indices:** First, store the elements along with their original indices, then sort the array in ascending order. This allows us to process elements sequentially from smaller to larger values.
- **Prefix Sums:** Compute the prefix sums of the sorted array. If our current cumulative sum up to index $i$ is greater than or equal to the value of the next element at index $i + 1$, we can absorb that element (and transitively all elements before it) and expand our reach.
- **Greedy Check:** Working backwards from the second-to-last element down to the first, we can check if the prefix sum at the current index can reach the next element. If it does, the maximum elements reachable from the current element will be the same as the maximum elements reachable from the next element. Otherwise, it is simply the current index itself.
- Finally, map the results back to their respective original indices.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n \log n)$ due to sorting the array of size $n$, followed by a linear scan $\mathcal{O}(n)$ to compute prefix sums and determine answers.
- **Space Complexity:** $\mathcal{O}(n)$ to store the array elements, original indices, prefix sums, and result vectors.