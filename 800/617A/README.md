# Problem Number - 617A Elephant  

**Problem Link:** [https://codeforces.com/problemset/problem/617/A](https://codeforces.com/problemset/problem/617/A)  

---

## Topics
- Implementation  
- Math  
- Greedy  

---

## Constraints
- 1 ≤ `n` ≤ 1,000,000  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The elephant starts at position `0` and wants to reach position `n`.  
- In one step, the elephant can move forward by **1, 2, 3, 4, or 5 units**.  
- To minimize the number of steps, the elephant should always take the largest possible step (5 units).  
- Therefore, the minimum number of steps is the ceiling of `n / 5`.  

### Approach:
- If `n` is divisible by 5, then exactly `n / 5` steps are needed.  
- Otherwise, the elephant will need one extra step for the remainder, so the answer is `n / 5 + 1`.  

This is a direct application of integer division and ceiling logic.  

---

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only a division and modulus operation are performed.  
- **Space Complexity:** `O(1)`, only constant space is used for variables.  