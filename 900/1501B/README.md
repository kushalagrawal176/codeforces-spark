# Problem 1501B - Napoleon Cake

**Problem Link:** [https://codeforces.com/problemset/problem/1501/B](https://codeforces.com/problemset/problem/1501/B)

---

## Topics
- Implementation
- Greedy
- Data Structures (or a backward propagation technique)

## Constraints
- $1 ≤ t ≤ 20000$ (Number of test cases)
- $1 ≤ n ≤ 2\cdot10^5$ 
- $0 ≤ a[i] ≤ n$
- Sum of `n` over all test cases does not exceed $2\cdot10^5$
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem describes making a Napoleon cake with `n` layers, where each layer `i` adds `a[i]` soaked cream layers *downward* (i.e., covering layers from `i` down to `max(1, i - a[i] + 1)`).
- To solve this efficiently, we can iterate backward from the last layer ($n-1$) down to the first layer ($0$).
- We maintain a variable `point` (representing the remaining cream coverage influence from higher layers).
- At each layer `p`, we update `point = max(point, a[p])`. 
- If `point > 0`, it means the current layer is soaked with cream, so we set `a[p] = 1`, and then decrement `point` by `1` as its effective range moves down. If `point == 0`, the layer remains unsoaked (`a[p] = 0`).
- This backward tracking ensures each layer correctly captures the maximum overlapping cream coverage in $O(n)$ time per test case.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, since we iterate through the array of size `n` a single time backwards.
- **Space Complexity:** $O(n)$ to store the array elements.