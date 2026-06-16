# Problem Number - 1968C Assembly via Remainders

**Problem Link:** [https://codeforces.com/problemset/problem/1968/C](https://codeforces.com/problemset/problem/1968/C)

---

## Topics
- Constructive Algorithms
- Number Theory
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 2 ≤ `n` ≤ 500 (array size)
- 1 ≤ `xᵢ` ≤ 500 (given remainders)
- 1 ≤ `aᵢ` ≤ 10⁹ (constructed array elements)
- Sum of `n` across all test cases ≤ 2 × 10⁵
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array **x₂, x₃, …, xₙ** where each element represents the remainder of division:  
  **xᵢ = aᵢ mod aᵢ₋₁** for 2 ≤ `i` ≤ `n`.
- The task is to construct any valid array **a₁, a₂, …, aₙ** that satisfies the conditions.
- Key observation:  
  - If we pick a sufficiently large starting value for **a₁** (e.g., 501), then we can construct the sequence by setting:  
    **aᵢ = aᵢ₋₁ + xᵢ**.  
  - This works because `aᵢ mod aᵢ₋₁ = xᵢ` holds true when `aᵢ = aᵢ₋₁ + xᵢ`.  
    Example: If aᵢ₋₁ = 5 and xᵢ = 2, then aᵢ = 7 → 7 mod 5 = 2.
- Thus, the construction is straightforward:  
  - Start with a fixed **a₁ = 501** (or any number > max(xᵢ)).  
  - Iteratively compute each next element as the sum of the previous element and the given remainder.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the given remainders once.  
- **Space Complexity:** `O(1)`, printing the constructed array directly.