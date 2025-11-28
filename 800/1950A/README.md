# Problem Number - 1950A Stair, Peak or Neither?  

**Problem Link:** [https://codeforces.com/problemset/problem/1950/A](https://codeforces.com/problemset/problem/1950/A)  

---

## Topics  
- Implementation  
- Conditional Logic  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 0 ≤ `a`, `b`, `c` ≤ 9 (values of the three integers)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to classify three integers `a`, `b`, and `c` into one of three categories:  
  - **STAIR**: if the sequence is strictly increasing (`a < b < c`).  
  - **PEAK**: if the middle element is greater than both neighbors (`a < b > c`).  
  - **NONE**: if neither of the above conditions is satisfied.  
- Steps:  
  1. Read the number of test cases `t`.  
  2. For each test case, read integers `a`, `b`, and `c`.  
  3. Apply conditional checks:  
     - If `a < b && b < c`, output `"STAIR"`.  
     - Else if `a < b && b > c`, output `"PEAK"`.  
     - Otherwise, output `"NONE"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since each test case requires constant time operations.  
- **Space Complexity:** `O(1)`, only a few variables are used regardless of input size.  
