# Problem Number - 1463A Dungeon  
**Problem Link:** [https://codeforces.com/problemset/problem/1463/A](https://codeforces.com/problemset/problem/1463/A)  

---

## Topics  
- Implementation  
- Math  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `a`, `b`, `c` ≤ 10⁸ (initial health of the three heroes)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach 
The dungeon requires the three heroes to fight together in rounds. 
- In **each round**, the dungeon consumes **9 units of health in total** (3 units per hero). 
- Therefore, the **total health** of all heroes combined must be divisible by 9, otherwise it is impossible to split the health evenly across rounds. 
- Even if the total is divisible by 9, each hero must individually have enough health to contribute their fair share. That fair share is `sum / 9`, because the total number of rounds possible is `sum / 9`, and each hero must survive through all of them.

### Step-by-step reasoning:  
- Compute `sum = a + b + c`.  
- Check if `sum % 9 == 0`.  
- Let `required = sum / 9`.  
- Verify if `a >= required`, `b >= required`, and `c >= required`.  
- If all checks pass → print **YES**, else → print **NO**.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only arithmetic checks are performed.  
- **Space Complexity:** `O(1)`, no extra memory used beyond variables.  
