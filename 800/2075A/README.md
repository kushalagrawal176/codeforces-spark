# Problem Number - 2075A To Zero  
**Problem Link:** [https://codeforces.com/problemset/problem/2075/A](https://codeforces.com/problemset/problem/2075/A)  

---

## Topics  
- Implementation  
- Math  
- Greedy / Modular Arithmetic  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 3 ≤ `k` ≤ `n` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach  
- We are asked to determine the minimum number of operations required to reduce `n` to zero under specific rules.  
- Observation:  
  - If `n` is **odd**, we must first subtract `k` once (to make it even).  
    - After that, we can reduce `n` in chunks of `(k - 1)`.  
    - If there is a remainder after division, one more operation is needed.  
  - If `n` is **even**, we directly divide it into chunks of `(k - 1)`.  
    - Again, if there is a remainder, one more operation is required.  
- Formula:  
  - For odd `n`: `cnt = 1 + (n - k) / (k - 1) + (remainder ? 1 : 0)`  
  - For even `n`: `cnt = n / (k - 1) + (remainder ? 1 : 0)`  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case, read integers `n` and `k`.  
3. If `n` is odd:  
   - Subtract `k` once, increment count.  
   - Divide the remaining by `(k - 1)`.  
   - Add one more if there’s a remainder.  
4. If `n` is even:  
   - Divide directly by `(k - 1)`.  
   - Add one more if there’s a remainder.  
5. Print the result.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, no extra memory used.  
