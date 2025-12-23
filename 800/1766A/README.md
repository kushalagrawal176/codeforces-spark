# Problem Number - 1766A Extremely Round  
**Problem Link:** [https://codeforces.com/problemset/problem/1766/A](https://codeforces.com/problemset/problem/1766/A)  

---

## Topics  
- Math  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `n` ≤ 999999  
- Time limit per test: 3 second  
- Memory limit: 512 megabytes  

## Intuition / Approach  
- The problem asks us to count how many "extremely round" numbers are less than or equal to a given number `n`.  
- An `"extremely round"` number is defined as a number with only one non-zero digit (like 1, 2, …, 9, 10, 20, …, 90, 100, 200, …).  
- To solve this efficiently, notice that:  
  - For every digit length smaller than `n`, there are exactly 9 extremely round numbers (1–9, 10–90, 100–900, etc.).  
  - For the digit length equal to `n`, the count depends on the first digit of `n`.  
- Thus, the formula becomes:  
  - `(number of digits in n - 1) * 9 + (first digit of n)`  
- This formula directly gives the count of extremely round numbers ≤ `n`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since we only compute based on string length and first digit.  
- **Space Complexity:** `O(1)`, as only a few variables are used.  