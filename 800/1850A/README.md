# Problem Number - 1850A To My Critics  
**Problem Link:** [https://codeforces.com/problemset/problem/1850/A](https://codeforces.com/problemset/problem/1850/A)  

---

## Topics  
- Implementation  
- Math  
- Brute Force  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 0 ≤ `a`, `b`, `c` ≤ 9 (values given in each test case)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem gives three integers `a`, `b`, and `c`.  
- We need to check if **any pair sum** among `(a + b)`, `(b + c)`, `(c + a)` is greater than or equal to 10.  
- If at least one pair satisfies this condition, print `"YES"`. Otherwise, print `"NO"`.  

### Steps:  
1. Read the number of test cases `t`.  
2. For each test case, read integers `a`, `b`, and `c`.  
3. Check the three possible pair sums:  
   - `(a + b)`  
   - `(b + c)`  
   - `(c + a)`  
4. If any of them is ≥ 10, output `"YES"`. Otherwise, output `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only three sums are checked.  
- **Space Complexity:** `O(1)`, no extra space required.  
