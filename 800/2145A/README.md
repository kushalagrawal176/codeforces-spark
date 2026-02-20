# Problem Number - 2145A Candies for Nephews  

**Problem Link:** [https://codeforces.com/problemset/problem/2145/A](https://codeforces.com/problemset/problem/2145/A)  

---

## Topics
- Implementation  
- Modular Arithmetic  
- Math  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 100 (candies count)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks how many additional candies must be added to make the total divisible by 3.  
- If `n % 3 == 0`, then no extra candies are needed.  
- Otherwise, the answer is `3 - (n % 3)`, which represents the smallest number of candies required to reach the next multiple of 3.  

This simple modular arithmetic check ensures the solution is efficient.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only one modulo operation is performed.  
- **Space Complexity:** `O(1)`, no extra memory used.  
