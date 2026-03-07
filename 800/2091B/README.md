# Problem Number - 2091B Team Training  

**Problem Link:** [https://codeforces.com/problemset/problem/2091/B](https://codeforces.com/problemset/problem/2091/B)  

---

## Topics
- Greedy  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `x` ≤ 10⁹  
- 1 ≤ `aᵢ` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks us to maximize the number of teams that can be formed such that the **sum of skill levels in a team is at least `x`**.  
- Each team can consist of any number of participants, but once a participant is used, they cannot be reused.  
- A greedy approach works here:
  - Sort the skill levels in **descending order**.  
  - Start grouping participants one by one, keeping track of the current team size `j`.  
  - If the strongest remaining participant multiplied by the team size (`arr[i] * j`) is at least `x`, then a valid team is formed.  
  - Reset the counter `j` and continue with the next participants.  
- This ensures we maximize the number of teams because we always try to form a team as early as possible with the strongest available participants.  

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting takes `O(n log n)`.  
  - Iterating through the array takes `O(n)`.  
  - For each test case, total complexity is `O(n log n)`.  
- **Space Complexity:**  
  - `O(n)` for storing skill levels.  