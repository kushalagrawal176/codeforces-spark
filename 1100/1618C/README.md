# Problem Number - 1618C Paint the Array  
**Problem Link:** [https://codeforces.com/problemset/problem/1618/C](https://codeforces.com/problemset/problem/1618/C)  

---

## Topics
- Number Theory  
- GCD  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 2 ≤ `n` ≤ 200 (array size)  
- 1 ≤ `a[i]` ≤ 10¹⁸ (array elements)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to find a positive integer `d` such that:
  - All elements at even indices are divisible by `d`.  
  - All elements at odd indices are **not** divisible by `d`.  
  - Or vice versa (odd indices divisible, even indices not divisible).  

- To solve this:
  1. Compute the **GCD of all even-indexed elements** (`g_even`).  
  2. Compute the **GCD of all odd-indexed elements** (`g_odd`).  
  3. Check validity:
     - If `g_even` divides any odd-indexed element, it is invalid.  
     - If `g_odd` divides any even-indexed element, it is invalid.  
  4. The answer is whichever valid GCD exists (if both are valid, take the larger).  
  5. If neither is valid, the answer is `0`.  

- This works because the GCD ensures divisibility across one group, and the validation step ensures exclusivity across the other group.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (to compute GCDs and validate). 

- **Space Complexity:**  
  - `O(n)` for storing the array.  
  - `O(1)` extra space for GCD calculations and checks.  
  - Overall `O(n)`