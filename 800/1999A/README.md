# Problem Number - 1999A A+B Again? 
**Problem Link:** [https://codeforces.com/problemset/problem/1999/A](https://codeforces.com/problemset/problem/1999/A)  

---

## Topics
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 90 (number of test cases)  
- 10 ≤ `n` ≤ 99 (integer whose digits need to be summed)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to compute the **sum of digits** of a given integer `n`.  
- For each test case:  
  1. Read the integer `n`.  
  2. Extract digits one by one using modulo (`n % 10`).  
  3. Add the digit to a running sum.  
  4. Remove the last digit using integer division (`n / 10`).  
  5. Repeat until `n` becomes 0.  
- Print the final sum for each test case.  
- Example: If `n = 1234`, then sum = 1 + 2 + 3 + 4 = 10.  

## Time and Space Complexity
- **Time Complexity:** `O(d)`, where `d` is the number of digits in `n`. Since `n ≤ 10^9`, `d ≤ 10`. Effectively `O(1)` per test case.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
