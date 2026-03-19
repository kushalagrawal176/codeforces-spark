# Problem Number - 2064B Variety is Discouraged

**Problem Link:** [https://codeforces.com/problemset/problem/2064/B](https://codeforces.com/problemset/problem/2064/B)

---

## Topics
- Arrays
- Greedy
- Implementation
- Frequency Counting
- Two pointers

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2 × 10⁵ (array length per test case)
- 1 ≤ `aᵢ` ≤ `n` (array elements)
- Sum of `n` across all test cases ≤ 2 × 10⁵
- Time limit per test: 1.5 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The **score** of an array is defined as:  
  `score = length of array - number of distinct elements`.
- To maximize the score, we want to **minimize the number of distinct elements** while keeping as many elements as possible.
- We are allowed to remove **at most one non-empty contiguous subarray**.
- Key observations:
  - If the array already has many duplicates, removing nothing may already yield the maximum score.
  - If some elements appear only once, removing a subarray that contains all unique elements can reduce the distinct count, thereby increasing the score.
  - Among **multiple valid subarrays**, we must choose the one that **minimizes the final array length** (shortest remaining array).
- Strategy:
  1. Count the frequency of each element.
  2. Identify positions of elements that occur only once.
  3. Removing a subarray covering all unique elements maximizes the score.
  4. If no removal improves the score, output `0`.
  5. Otherwise, output the bounds `(l, r)` of the chosen subarray.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array and count frequencies.
- **Space Complexity:** `O(n)`, for storing frequencies and array elements.