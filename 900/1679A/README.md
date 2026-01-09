# Problem Number - 1679A AvtoBus  
**Problem Link:** [https://codeforces.com/problemset/problem/1679/A](https://codeforces.com/problemset/problem/1679/A)  

---

## Topics  
- Implementation  
- Math  
- Greedy 
- Number Theory 

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 10¹⁸ (total number of wheels)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given `n` wheels, and buses can only have **4 wheels** or **6 wheels**.  
- The task is to determine the **minimum** and **maximum** number of buses possible.  

### Key Observations:  
1. If `n` is odd or less than 4, it is impossible to form buses → output `-1`.  
2. **Maximum buses:** achieved by using as many 4-wheel buses as possible → `n / 4`.  
3. **Minimum buses:** achieved by using as many 6-wheel buses as possible, but we may need to adjust to ensure divisibility.  
   - Formula: `(n + 4) / 6` ensures the smallest number of buses that can exactly use up all wheels.  

Thus, the solution is:  
- If `(n % 2 == 1 || n < 4)` → print `-1`.  
- Else → print `(n + 4) / 6` and `n / 4`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only arithmetic checks are performed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
