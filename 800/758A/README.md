# Problem Number - 758A Holiday Of Equality  
**Problem Link:** [https://codeforces.com/problemset/problem/758/A](https://codeforces.com/problemset/problem/758/A)  

---

## Topics  
- Implementation  
- Math  
- Greedy  

## Constraints  
- 1 ≤ `n` ≤ 100 (number of citizens)  
- 0 ≤ `a[i]` ≤ 10^6 (wealth of each citizen)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks for the total number of coins needed to make all citizens have equal wealth.  
- Approach:  
  - Find the maximum wealth among all citizens.  
  - For each citizen, calculate the difference between the maximum wealth and their current wealth.  
  - Sum up all these differences.  
  - This sum represents the total number of coins required to equalize everyone's wealth.  
- This works because the only way to equalize is to increase the wealth of poorer citizens up to the richest citizen’s level.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for iterating through all citizens to compute the sum.  
- **Space Complexity:** `O(1)`, aside from storing the input array.  
