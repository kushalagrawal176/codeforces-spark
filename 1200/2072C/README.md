# Problem Number - 2072C Creating Keys for StORages Has Become My Main Skill  

**Problem Link:** [https://codeforces.com/problemset/problem/2072/C](https://codeforces.com/problemset/problem/2072/C)  

---

## Topics
- Bit Manipulation  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (length of array)  
- 0 ≤ `x` < 2³⁰ (target OR value)  
- Sum of all `n` across test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem requires constructing an array `a` of length `n` such that:  
  - **Bitwise OR of all elements = x**  
  - **MEX of the array is maximized**  

- **MEX(S)** is the smallest non-negative integer not present in the set `S`.  
- To maximize MEX, we want to include as many consecutive integers starting from 0 as possible.  
- Strategy:  
  1. Iterate through integers from `0` to `n-1`.  
  2. For each `i`, check if `(x & i) == i`.  
     - If true, we can safely include `i` in the array without breaking the OR condition.  
     - Otherwise, fallback to using `x`.  
  3. Ensure that the final OR of all chosen elements equals `x`.  
  4. This greedy construction guarantees the OR condition while maximizing the MEX.   

## Time and Space Complexity
- **Time Complexity:** O(n) per test case, since we iterate through all `n` elements.  
- **Space Complexity:** O(n) for storing the output array.  