# Problem Number - 1560A Dislike of Threes  
**Problem Link:** [https://codeforces.com/problemset/problem/1560/A](https://codeforces.com/problemset/problem/1560/A)  

---

## Topics  
- Implementation  
- Math  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `k` ≤ 1000 (position in the sequence)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem defines a sequence of positive integers that **do not** satisfy either of these conditions:  
  - Divisible by 3  
  - Ends with digit 3  
- We need to find the `k`-th element of this sequence for each test case.  

### Steps:  
1. Construct the sequence by iterating through natural numbers and skipping those that are divisible by 3 or end with 3.  
2. For each test case, output the `k`-th valid number.  
3. Since constraints are small (k ≤ 1000), we can precompute the sequence up to the required length and directly access the `k`-th element.  

### Example:  
- Sequence starts as: 1, 2, 4, 5, 7, 8, 10, 11, 14, ...  
- For k = 7 → Answer is 10.  

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(k)` per test case if computed directly by simulation.  
  - `O(1)` per query if precomputed once up to 1000 elements.  
- **Space Complexity:** `O(k)` for storing the sequence (or `O(1000)` = `O(1)` in worst case).  
