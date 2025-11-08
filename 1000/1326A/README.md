# Problem Number - 1326A Bad Ugly Numbers  
**Problem Link:** [https://codeforces.com/problemset/problem/1326/A](https://codeforces.com/problemset/problem/1326/A)

---

## Topics

- Implementation  
- Number Theory  
- Constructive Algorithms

## Constraints

- 1 ≤ t ≤ 400
- 1 ≤ n ≤ 10^5 
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes

## Intuition / Approach

- The task is to construct an *ugly number* of length `n`.  
- An ugly number is defined as a number not divisible by any of its digit.   
- For `n = 1`, it is impossible to construct such a number, so the answer is `-1`.  
- For `n > 1`, we can construct a valid number by:  
  - Starting with digit `2` (ensures divisibility by 2).  
  - Filling the remaining `n-1` digits with `3` (ensures the number is not divisible by 3).  
- Example:  
  - For `n = 2`, output `23`.  
  - For `n = 3`, output `233`.  
  - For `n = 4`, output `2333`.  

This guarantees the number is not divisible by any of its digit, hence a valid "bad ugly number."

## Time and Space Complexity

- **Time Complexity:** O(n), for constructing the string of length `n`.  
- **Space Complexity:** O(1), aside from storing the output string.  
