# Problem Number - 2149A Be Positive  

**Problem Link:** [https://codeforces.com/problemset/problem/2149/A](https://codeforces.com/problemset/problem/2149/A)  

---

## Topics
- Greedy  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 8 (array size per test case)  
- Array elements are only from `{ -1, 0, 1 }`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given an array consisting of values `-1`, `0`, and `1`.  
- In one operation, we can increase any element by 1.  
- The goal is to make the **product of all elements strictly positive** using the minimum number of operations.  

### Key Observations:
1. **Zeros (`0`)**:  
   - Each zero must be increased at least once to become `1`.  
   - So, every zero contributes **+1 operation**.  

2. **Negative numbers (`-1`)**:  
   - If the count of negatives is **even**, their product is already positive.  
   - If the count of negatives is **odd**, we need to fix it.  
     - One way is to convert one `-1` into `1`, which costs **2 operations** (`-1 → 0 → 1`).  

3. **Positive numbers (`1`)**:  
   - They are already fine and need no changes.  

### Formula:
- **Minimum operations = (number of zeros) + (2 if count of negatives is odd, else 0).**  

This greedy approach ensures the product becomes strictly positive with the least effort.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(1)`, only counters are used.  
