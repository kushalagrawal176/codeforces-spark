# Problem Number - 2179C Blackslex and Number Theory

**Problem Link:** [https://codeforces.com/problemset/problem/2179/C](https://codeforces.com/problemset/problem/2179/C)

---

## Topics
- Number Theory  
- Modular Arithmetic  
- Implementation  
- Sorting  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (array size per test case)  
- 1 ≤ `aᵢ` ≤ 10⁹ (all values are distinct)  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given an array `a` of distinct integers.  
- Operation: choose index `i` and integer `x ≥ k`, then set `a[i] = a[i] mod x`.  
- Goal: make all elements of the array identical.  
- We need to find the **maximum possible k** such that it is possible to achieve equality.

### Key Observations:
1. For all elements to become equal, the modulus operation must allow reduction of larger numbers down to the smallest.  
2. The critical values are the **minimum element** and the **difference between the two smallest elements**.  
   - If `k` is larger than the smallest element, then that element cannot be reduced further.  
   - If `k` is larger than the difference between the two smallest elements, then the reduction cannot align them.  
3. Therefore, the answer is: `max(a[0], a[1] - a[0])`  
   where `a[0]` and `a[1]` are the smallest and second smallest elements after sorting.

### Steps:
- Sort the array.  
- Compute `max(a[0], a[1] - a[0])`.  
- Print the result for each test case.

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting each array: `O(n log n)`.  
  - Since sum of n ≤ 2 × 10⁵, this is efficient.  
- **Space Complexity:** `O(n)` for storing the array.  