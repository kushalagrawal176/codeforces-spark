# Problem Number - 1915B Not Quite Latin Square  
**Problem Link:** [https://codeforces.com/problemset/problem/1915/B](https://codeforces.com/problemset/problem/1915/B)  

---

## Topics
- Implementation
- Strings
- Simulation

## Constraints
- 1 ≤ `t` ≤ 108  
- Each string length = 3  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem gives a **3×3 Latin square** filled with letters `A`, `B`, `C`, except one cell marked with `?`.  
- A Latin square requires each row to contain all distinct letters.  
- Therefore, the row containing `?` must be completed by finding which of `A`, `B`, or `C` is missing.  

### Steps:
1. Identify the row that contains `?`.  
2. Check which of the letters `A`, `B`, `C` are already present in that row.  
3. The missing letter is the answer for that test case.  

This is straightforward because each row has exactly 3 cells and only one is missing.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since each row has only 3 characters. 
- **Space Complexity:** `O(1)`, only a few variables are used.  
