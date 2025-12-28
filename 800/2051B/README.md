# Problem Number - 2051B Journey  
**Problem Link:** [https://codeforces.com/problemset/problem/2051/B](https://codeforces.com/problemset/problem/2051/B)  
---

## Topics
- Implementation  
- Greedy  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 10^9 (total distance to travel)  
- 1 ≤ `a`, `b`, `c` ≤ 10^6 (daily travel capacities)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The journey consists of repeating cycles of 3 days, where on each day the traveler covers distances `a`, `b`, and `c` respectively.  
- In one full cycle, the traveler covers `(a + b + c)` units of distance in exactly 3 days.  
- To compute the total days needed:  
  1. First, calculate how many full cycles fit into `n`. This gives `(n / (a + b + c)) * 3` days.  
  2. Then, handle the remainder `n % (a + b + c)` by simulating day-by-day travel until the remaining distance is covered.  
- This greedy simulation ensures we only add extra days when necessary.   

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we compute cycles directly and simulate at most 3 extra days.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
