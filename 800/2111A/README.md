# Problem Number - 2111A Energy Crystals  

**Problem Link:** [https://codeforces.com/problemset/problem/2111/A](https://codeforces.com/problemset/problem/2111/A)  

---

## Topics
- Implementation  
- Simulation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit: 512 megabytes  

## Intuition / Approach
- We are given an integer `n` representing the number of energy crystals.  
- The task is to determine the minimum number of moves needed to reduce `n` to 1 by repeatedly dividing by 2, and then compute the final formula for the answer.  

### Key Observations:
1. Each move divides `n` by 2 until it becomes 1.  
2. Count the number of divisions performed (`cnt`).  
3. The final answer is given by:  `result = (cnt + 1) * 2 + 1`
   - `(cnt + 1)` accounts for the number of steps including the final state.  
   - Multiply by 2 and add 1 as per the problem’s requirement.  

### Steps:
1. Read the number of test cases `t`.  
2. For each test case, read integer `n`.  
3. Initialize `cnt = 0`.  
4. While `n != 1`, divide `n` by 2 and increment `cnt`.  
5. Compute `(cnt + 1) * 2 + 1`.  
6. Print the result.  

This direct simulation works efficiently because dividing by 2 reduces `n` logarithmically, so the loop runs in O(log n).  

## Time and Space Complexity
- **Time Complexity:** `O(log n)` per test case, since we divide `n` by 2 until it reaches 1.  
- **Space Complexity:** `O(1)`, only a few variables are used.  