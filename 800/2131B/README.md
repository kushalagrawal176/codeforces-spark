# Problem Number - 2131B Alternating Series

**Problem Link:** [https://codeforces.com/problemset/problem/2131/B](https://codeforces.com/problemset/problem/2131/B)

---

## Topics
- Implementation  
- Constructive Algorithms  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 500  
- 2 ≤ `n` ≤ 2 ⋅ 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to construct an array of length `n` that satisfies the alternating series condition described in the problem.  
    - **product of adjacent elements is < 0**
    - **for all subarrays of size at least 2 sum of all elements is positive**
    - **resultant array should be lexicographically smallest**
- The construction pattern is straightforward:
  - Fill pairs of elements as `[-1, 3]`.  
  - If `n` is odd, the last element is `-1`.  
  - If `n` is even, the last element is `2`.  
- This ensures the alternating sum property holds for all test cases.  
- The solution is purely constructive: no need for complex calculations, just follow the pattern.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once to assign values.  
- **Space Complexity:** `O(n)`, for storing the constructed array.
