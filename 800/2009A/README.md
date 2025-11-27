# Problem Number - 2009A Minimize!  
**Problem Link:** [https://codeforces.com/problemset/problem/2009/A](https://codeforces.com/problemset/problem/2009/A)  

---

## Topics  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 55 (number of test cases)  
- 1 ≤ `a` ≤ `b` ≤ 10 (positions on the line)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem is straightforward: given two integers `a` and `b` representing positions on a line, we need to calculate the distance between them.  
- Since `a < b`, the distance is simply `b - a`.  
- For each test case, output the result.  

### Steps:  
1. Read the number of test cases `t`.  
2. For each test case, read integers `a` and `b`.  
3. Compute `b - a`.  
4. Print the result.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only subtraction is performed.  
- **Space Complexity:** `O(1)`, no extra space required.  
