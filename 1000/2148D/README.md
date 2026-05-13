# Problem Number - 2148D Destruction of the Dandelion Fields

**Problem Link:** [https://codeforces.com/problemset/problem/2148/D](https://codeforces.com/problemset/problem/2148/D)

---

## Topics
- Greedy
- Sorting
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2 × 10⁵ (number of fields per test case)
- 1 ≤ `aᵢ` ≤ 10⁹ (dandelions in each field)
- Sum of `n` across all test cases ≤ 2 × 10⁵
- Time limit per test: 2 seconds
- Memory limit: 256 megabytes

---

## Intuition / Approach
- Farmer John’s lawnmower toggles its state whenever he visits a field with an **odd** number of dandelions.
- If the lawnmower is **on**, it cuts all dandelions in the field; if **off**, it cuts none.
- To maximize the total dandelions cut:
  1. **Even fields:** Always add their dandelions to the total since they don’t affect the toggle state.
  2. **Odd fields:** The order matters. Visiting an odd field toggles the mower. To maximize cuts, we want the mower to stay **on** as much as possible.
  3. The optimal strategy is to take the **largest half of odd fields** (rounded up) and add their dandelions to the total along with all even fields.
     - This ensures the mower is turned on early and remains on for the maximum number of high-value odd fields.
- If there are **no odd fields**, the mower never turns on, and the answer is 0.

---

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n log n)` per test case due to sorting odd fields.
- **Space Complexity:**  
  - `O(n)` for storing odd fields.  
  - Constant extra space for sums and counters.