# Problem Number - 1692A Marathon  
**Problem Link:** [https://codeforces.com/problemset/problem/1692/A](https://codeforces.com/problemset/problem/1692/A)  

---

## Topics
- Implementation  
- Conditional Logic  

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 0 ≤ `a`, `b`, `c`, `d` ≤ 10^4 (marathon completion times)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives the completion times of four participants in a marathon.  
- The first participant’s time is `a`, and the other three are `b`, `c`, and `d`.  
- We need to count how many of the other participants finished faster than the first participant.  
- Approach:  
  1. Read the four integers.  
  2. Compare `a` with each of `b`, `c`, and `d`.  
  3. Increment a counter for each case where `a` is greater than the competitor’s time.  
  4. Print the counter as the result.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only three comparisons are made.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
