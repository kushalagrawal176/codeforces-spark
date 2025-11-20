# Problem Number - 977A Wrong Subtraction  
**Problem Link:** [https://codeforces.com/problemset/problem/977/A](https://codeforces.com/problemset/problem/977/A)  

---

## Topics
- Implementation
- Simulation
- Math

## Constraints
- 2 ≤ `n` ≤ 10^9  
- 1 ≤ `k` ≤ 50  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to perform exactly `k` operations on the integer `n`.  
- Each operation follows these rules:
  - If the last digit of `n` is non-zero, subtract 1.  
  - If the last digit of `n` is zero, divide `n` by 10.  
- Since `k` is at most 50, we can directly simulate the process without worrying about efficiency.  
- After applying the operations sequentially, the final value of `n` is printed.  

### Example Walkthrough
Input:  512 4

Steps:  
- 512 → 511 (subtract 1)  
- 511 → 510 (subtract 1)  
- 510 → 51 (divide by 10)  
- 51 → 50 (subtract 1)  

Output:  50


## Time and Space Complexity
- **Time Complexity:** `O(k)`, since we perform at most 50 operations.  
- **Space Complexity:** `O(1)`, only constant space is used.  
