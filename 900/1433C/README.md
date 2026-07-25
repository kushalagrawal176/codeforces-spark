# Problem Number - 1433C Dominant Piranha

**Problem Link:** [https://codeforces.com/problemset/problem/1433/C](https://codeforces.com/problemset/problem/1433/C)

---

## Topics
- Greedy
- Two Pointers
- Implementation

## Constraints
- 1 ≤ `t` ≤ $2 \cdot 10^4$ (number of test cases)
- 2 ≤ `n` ≤ $3 \cdot 10^5$ (size of the array)
- 1 ≤ `a[i]` ≤ $10^9$ (sizes of the piranhas)
- Sum of `n` over all test cases does not exceed $3 \cdot 10^5$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A piranha can only grow if it eats an adjacent piranha that is strictly smaller than itself.
- If all piranhas have the same size, no piranha can eat another, so it's impossible, and the answer is `-1`.
- Otherwise, a piranha of the maximum size in the array can eventually eat all other piranhas as long as at least one of its adjacent neighbors is strictly smaller than it.
- We first find the maximum element (`maxi`) in the array.
- Then, we search for an occurrence of `maxi` that has a neighbor (`i-1` or `i+1`) strictly smaller than `maxi`. Once found, we return its 1-based index.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array to find the maximum value and then to find a valid index.
- **Space Complexity:** `O(n)` or `O(1)` auxiliary space, depending on whether we store the array elements.