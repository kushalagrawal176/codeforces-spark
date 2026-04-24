# Problem Number - 2126D This Is the Last Time

**Problem Link:** [https://codeforces.com/problemset/problem/2126/D](https://codeforces.com/problemset/problem/2126/D)

---

## Topics
- Greedy
- Sorting
- Data Structures

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 10⁵ (number of casinos per test case)
- 0 ≤ `k` ≤ 10⁹ (initial coins)
- 0 ≤ `lᵢ` ≤ `realᵢ` ≤ `rᵢ` ≤ 10⁹ (casino parameters)
- The sum of all `n` across test cases ≤ 10⁵
- **Time limit per test:** 2 seconds  
- **Memory limit per test:** 256 megabytes  

## Intuition / Approach
- You start with `k` coins and can visit casinos in any order.  
- Each casino is defined by `[lᵢ, rᵢ, realᵢ]`:
  - You can only play if your current coins `x` satisfy `lᵢ ≤ x ≤ rᵢ`.
  - After playing, your coins become `realᵢ`.
- The goal is to maximize the final number of coins.

### Key Observations:
1. **Monotonicity:** It is never beneficial to go to a casino where `realᵢ ≤ current coins`. That would not increase your wealth.
2. **Greedy Strategy:** Always choose casinos that can increase your coins.  
   - Sort casinos by their `lᵢ` (entry requirement).
   - Traverse them in order, and whenever your current coins `k` fall within `[lᵢ, rᵢ]` and `realᵢ > k`, update `k = realᵢ`.
3. This ensures that you maximize coins step by step, since each valid casino can potentially “upgrade” your coin count.

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting casinos: `O(n log n)`  
  - Traversing casinos: `O(n)`  
- **Space Complexity:** `O(n)` for storing casino data.