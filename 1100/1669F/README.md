# Problem Number - 1669F Eating Candies  
**Problem Link:** [https://codeforces.com/problemset/problem/1669/F](https://codeforces.com/problemset/problem/1669/F)  
---
## Topics
- Two Pointers  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ 10⁴  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Alice starts eating candies from the left, Bob from the right.  
- Each candy has a weight. Alice accumulates `a_weight`, Bob accumulates `b_weight`.  
- Whenever their accumulated weights are equal, we can update the maximum candies eaten (`cnt`).  
- Strategy:
  - Use two pointers: `alice` (left index) and `bob` (right index).  
  - Move the pointer with the smaller accumulated weight forward (Alice) or backward (Bob).  
  - If weights are equal, update the answer with total candies eaten so far.  
- This greedy two-pointer approach ensures we maximize the number of candies eaten when their sums match.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each pointer moves at most `n` steps.  
- **Space Complexity:** `O(1)`, aside from storing the input array.  
