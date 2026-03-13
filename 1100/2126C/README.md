# Problem Number - 2126C I Will Definitely Make It

**Problem Link:** [https://codeforces.com/problemset/problem/2126/C](https://codeforces.com/problemset/problem/2126/C)

---

## Topics
- Graphs
- Greedy
- Sorting
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `k` ≤ `n` ≤ 10⁵ (number of towers and starting tower index)
- 1 ≤ `hᵢ` ≤ 10⁹ (tower heights)
- Sum of n across all test cases ≤ 10⁵
- **Time limit per test:** 1 second  
- **Memory limit per test:** 256 megabytes  

---

## Intuition / Approach
- You start at tower `k` with height `h[k]`. The water level begins at 1 and rises by 1 unit per second.
- If the water level ever exceeds the height of the tower you are on, you perish.
- You can teleport between towers, but teleportation takes `|h[i] - h[j]|` seconds. During teleportation, you remain on the starting tower until arrival.
- The goal is to determine if you can reach **any tower of maximum height** before drowning.

### Key Observations:
1. **Critical tower height:** The tower at index `k` determines your survival time. You can survive `h[k]` seconds before drowning.
2. **Teleport feasibility:** To move from tower `i` to tower `j`, the difference in heights `|h[i] - h[j]|` must not exceed the current tower’s height, otherwise you drown mid-teleport.
3. **Sorted heights strategy:** If you sort the tower heights, starting from your tower’s height, you must be able to move step by step to taller towers without encountering a gap larger than your starting tower’s height.
4. **Greedy check:** After sorting, find the position of `h[k]`. If every consecutive difference from that position up to the maximum tower is ≤ `h[k]`, then the answer is **YES**; otherwise **NO**.

---

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting each test case: `O(n log n)`  
  - Linear scan for differences: `O(n)`  
  - Overall: `O(n log n)` per test case, but efficient due to constraint sum(n) ≤ 10⁵.
- **Space Complexity:** `O(n)` for storing tower heights.