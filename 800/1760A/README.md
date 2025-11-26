# Problem Number - 1760A Medium Number  
**Problem Link:** [https://codeforces.com/problemset/problem/1760/A](https://codeforces.com/problemset/problem/1760/A)  

---

## Topics  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 6840 (number of test cases)  
- 1 ≤ `a`, `b`, `c` ≤ 20 (the three integers given in each test case)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks to find the **medium number** among three integers.  
- The medium number is the one that is neither the maximum nor the minimum.  
- Approach:  
  - Read three integers `a`, `b`, `c`.  
  - Compute the sum of the three numbers.  
  - Subtract the maximum and minimum values from the sum.  
  - The remaining value is the medium number.  
- This method avoids sorting and directly gives the answer in O(1) time.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only a few comparisons and arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, only constant space is used for variables.  
