# Problem Number - 1370A Maximum GCD  
**Problem Link:** [https://codeforces.com/problemset/problem/1370/A](https://codeforces.com/problemset/problem/1370/A)  

---

## Topics  
- Math  
- Number Theory  
- Implementation  

---

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 2 ≤ `n` ≤ 10⁶  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The problem asks for the maximum possible GCD of any pair `(i, j)` where `1 ≤ i, j ≤ n`.  
- **Key Observation:**  
  - The maximum GCD will always be obtained when one of the numbers is `n`.  
  - The best candidate pair is `(n, n/2)`, since `GCD(n, n/2) = n/2`.  
  - Therefore, the answer for each test case is simply `n/2`.  

- **Example:**  
  - For `n = 10`:  
    - Pair `(10, 5)` → GCD = 5.  
    - No other pair can give a larger GCD.  
    - Answer = 5.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since the answer is directly computed as `n/2`.  
- **Space Complexity:** `O(1)`, only constant space used.  
