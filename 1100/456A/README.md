# Problem Number - 456A Laptops  
**Problem Link:** [https://codeforces.com/problemset/problem/456/A](https://codeforces.com/problemset/problem/456/A)  
---
## Topics
- Sorting
- Implementation
- Greedy

## Constraints
- 1 ≤ `n` ≤ 10^5  
- 1 ≤ `a`, `b` ≤ `n`  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether there exists a laptop such that its **price** is strictly less than its **quality**.  
- If such a laptop exists, it means that paying more does not always guarantee better quality, so Alex will be happy.  
- Otherwise, if for all laptops the quality is not greater than the price, Alex will be disappointed.  
- The solution is straightforward:
  - Iterate through all laptops.  
  - For each laptop, check if `price < quality`.  
  - If found, print `"Happy Alex"` and terminate.  
  - If no such laptop exists, print `"Poor Alex"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we only scan through the list once.  
- **Space Complexity:** `O(1)`, only constant extra space is used.  
