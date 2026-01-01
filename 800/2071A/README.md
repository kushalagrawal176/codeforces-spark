# Problem Number - 2071A The Play Never Ends  
**Problem Link:** [https://codeforces.com/problemset/problem/2071/A](https://codeforces.com/problemset/problem/2071/A)  

---

## Topics  
- Implementation  
- Modular Arithmetic  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `k` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine whether the given number `n` satisfies a specific modular condition.  
- Observation:  
  - If `n % 3 == 1`, then the answer is `"YES"`.  
  - Otherwise, the answer is `"NO"`.  
- This is because the game condition is only met when the remainder of `n` divided by 3 equals 1.  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case, read the integer `n`.  
3. Compute `n % 3`.  
   - If the result is 1, print `"YES"`.  
   - Otherwise, print `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only a modulo operation is performed.  
- **Space Complexity:** `O(1)`, no extra memory used.  
