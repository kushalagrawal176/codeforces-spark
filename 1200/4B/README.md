# Problem Number - 4B Before an Exam  
**Problem Link:** [https://codeforces.com/problemset/problem/4/B](https://codeforces.com/problemset/problem/4/B)  
---
## Topics
- Greedy
- Implementation
- Constructive Algorithms

## Constraints
- 1 ≤ `d` ≤ 30  
- 0 ≤ `sumTime` ≤ 240  
- 0 ≤ `minTimeᵢ` ≤ `maxTimeᵢ` ≤ 8  
- Time limit per test: 0.5 seconds  
- Memory limit per test: 64 megabytes  

## Intuition / Approach
- The problem gives `d` days before an exam, each with a minimum and maximum number of hours that can be studied.  
- We need to determine if it’s possible to distribute study hours across all days such that the total equals `sum`.  
- First, calculate the total minimum (`mini`) and maximum (`maxi`) possible hours across all days.  
  - If `sum < mini` or `sum > maxi`, it’s impossible → print **NO**.  
- Otherwise, start by assigning each day its minimum hours.  
- Distribute the remaining hours (`sum - mini`) greedily across days, without exceeding each day’s maximum.  
- If distribution succeeds, print **YES** and the schedule.  

## Time and Space Complexity
- **Time Complexity:** `O(d)`, since we iterate through all days once.  
- **Space Complexity:** `O(d)`, for storing the schedule.  
