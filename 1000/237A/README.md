# Problem Number - 237A Free Cash  
**Problem Link:** [https://codeforces.com/problemset/problem/237/A](https://codeforces.com/problemset/problem/237/A)  

---

## Topics
- Implementation  
- Data Structures
- Simulation

## Constraints
- 1 ≤ `n` ≤ 10⁵  
- 0 ≤ `h[i]` ≤ 23  
- 0 ≤ `m[i]` ≤ 59  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum number of customers arriving at the bank at the **same time** (same hour and minute).  
- Each customer is represented by a pair `(hour, minute)`.  
- We need to count consecutive occurrences of identical `(hour, minute)` pairs and find the maximum streak.  
- Approach:
  - Read the first `(hour, minute)` pair and initialize counters.  
  - For each subsequent customer:
    - If the time matches the previous one, increment the streak counter.  
    - Otherwise, reset the streak counter to 1.  
  - Track the maximum streak encountered during iteration.  
- The final answer is the maximum streak value.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through all customers once.  
- **Space Complexity:** `O(1)`, only a few variables are used to track counts.  
