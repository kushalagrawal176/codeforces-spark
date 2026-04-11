# Problem Number - 2199A Game

**Problem Link:**  
https://codeforces.com/problemset/problem/2199/A

---

## Topics
- Greedy
- Implementation
- Math

---

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `k` ≤ 50  
- 0 ≤ `a1`, `b1`, `a2`, `b2` ≤ `k`  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

---

## Intuition / Approach

- Each test case represents a comparison between two players:
  - Player A has values `(a1, a2)`
  - Player B has values `(b1, b2)`
- You are allowed to increase Player A’s total by at most `k`.

---

### Key Observations

- Let:
  - `sum1 = a1 + a2`
  - `sum2 = b1 + b2`

- The goal is to determine whether Player A can **win or tie** against Player B after distributing at most `k` extra points.

---

### Case Analysis

1. **If `sum1 > sum2 + k`**
   - Even after giving maximum advantage to B, A is already too large in a losing configuration.
   - **Answer: NO**

2. **If `sum1 + k < sum2`**
   - Even after using all `k`, A cannot catch up.
   - **Answer: YES**

3. **If totals can be made equal (`sum1 == sum2 + k` or `sum1 + k == sum2`)**
   - Now we must compare individual components:
     - If `a1 > b1` **and** `a2 > b2`, A strictly dominates → bad case
     - Otherwise, A can still succeed
   - **Answer depends on pairwise comparison**

4. **Otherwise**
   - A can always adjust using `k` to reach a favorable configuration
   - **Answer: YES**

---

## Final Logic

- Compare sums with allowance `k`
- Handle edge cases when sums align exactly
- Check pairwise dominance only in equality cases

---

## Time and Space Complexity

- **Time Complexity:** `O(1)`  
  - Each test case is processed in constant time  

- **Space Complexity:** `O(1)`  
  - Only a few variables are used per test case  

---

## Notes

- The problem mainly revolves around **careful condition handling** rather than complex algorithms.
- Edge cases occur when totals are exactly equal after applying `k`, requiring deeper comparison.