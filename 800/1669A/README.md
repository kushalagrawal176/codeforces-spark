# Problem Number - 1669A Division?  
**Problem Link:** [https://codeforces.com/problemset/problem/1669/A](https://codeforces.com/problemset/problem/1669/A)  

---

## Topics
- Implementation  
- Conditional Logic  

## Constraints
- 1 ≤ `t` ≤ 10000 (number of test cases)  
- -5000 ≤ `n` ≤ 5000 (rating value)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine the **division category** of a participant based on their rating.  
- The divisions are defined as:  
  - Division 4: rating ≤ 1399  
  - Division 3: 1400 ≤ rating ≤ 1599  
  - Division 2: 1600 ≤ rating ≤ 1899  
  - Division 1: rating ≥ 1900  
- For each test case:  
  1. Read the rating `n`.  
  2. Use simple conditional checks (`if-else`) to determine which division the rating falls into.  
  3. Print the corresponding division.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, for each test case since each test case requires a constant number of comparisons.  
- **Space Complexity:** `O(1)`, only constant space is used for variables.  