# Problem Number - 2093B Expensive Number

**Problem Link:** [https://codeforces.com/problemset/problem/2093/B](https://codeforces.com/problemset/problem/2093/B)

---

## Topics
- Greedy
- Math
- String Processing

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)
- 1 ≤ `|s|` ≤ 10¹⁰⁰ (number without leading zeros)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The cost of a number is defined as:  $\text{cost}(n) = \dfrac{n}{\text{sum of digits of } n}$
- We are allowed to remove digits **(without reordering)** to **minimize** the cost.  
- Key observation:  
  - **Minimum possible cost will always be 1**
  - Removing **trailing zeros** increases the numerator (since the number remains large) while keeping the denominator small.  
  - The optimal strategy is to remove all, except one, non-zero digits and all trailing zeros.  
  - This causes the cost to be minimum
- The solution boils down to counting:
  - **cnt** = number of non-zero digits in the string.  
  - **zero** = number of trailing zeros before the last non-zero digit.  
  - `-1` so that one non-zero digit exists
- The answer is given by:  $\text{result} = cnt + zero - 1$

  This formula ensures we maximize the ratio by balancing numerator size and denominator minimization.

## Time and Space Complexity
- **Time Complexity:** `O(|s|)` per test case, since we scan the string once from the end.  
- **Space Complexity:** `O(1)`, only counters are used.

