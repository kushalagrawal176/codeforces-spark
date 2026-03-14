# Problem Number - 2130B Pathless

**Problem Link:** [https://codeforces.com/problemset/problem/2130/B](https://codeforces.com/problemset/problem/2130/B)

---

## Topics
- Graphs
- Implementation
- Simulation
- Constructive Algorithms

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)
- 3 ≤ `n` ≤ 50 (array length)
- 0 ≤ `s` ≤ 1000 (target sum)
- Array elements: `0`, `1`, or `2`
- Array always contains at least one `0`, one `1`, and one `2`
- **Time limit per test:** 1 second  
- **Memory limit:** 256 megabytes  

---

## Intuition / Approach
- Alice starts at index `1` and must reach index `n` by moving step-by-step (left or right).  
- Along her path, the sum of visited elements must equal `s`.  
- Bob’s goal is to rearrange the array so that **no valid path exists** for Alice to achieve the target sum.  
- Key observations:
  - Alice’s path always includes both endpoints (`a1` and `an`).
  - If the total sum of the array is much larger than `s`, Alice can loop back and forth to accumulate values.
  - To block Alice, Bob must arrange the array so that **no sequence of consecutive moves** can yield exactly `s`.  
- The constructive solution:
  - Compute the sum of all elements.
  - If `s == sum` or `s > sum + 1`, Alice can always succeed → output `-1`.
  - Otherwise, rearrange the array in a way that breaks possible paths (e.g., group all `0`s first, then `2`s, then `1`s). This prevents Alice from forming the required sum.

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we count elements and rearrange.  
- **Space Complexity:** `O(1)`, only counters for `0`, `1`, and `2` are needed.  