# Problem Number - 1374B Multiply by 2, divide by 6  
**Problem Link:** [https://codeforces.com/problemset/problem/1374/B](https://codeforces.com/problemset/problem/1374/B)  

---

## Topics
- Implementation  
- Math  
- Number Theory  

## Constraints
- 1 ≤ `t` ≤ 2 ⋅ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of operations to transform a given integer `n` into 1 using only two operations:  
  - Multiply by 2  
  - Divide by 6 (only if divisible by 6)  
- Key insight:  
  - Multiplying by 2 increases the power of 2 in the prime factorization.  
  - Dividing by 6 decreases both the power of 2 and the power of 3.  
- To reach 1, the number must eventually be reduced to only factors of 3 (since multiplying by 2 helps balance divisibility by 6).  
- Steps:  
  1. Count the powers of 2 (`cnt2`) and powers of 3 (`cnt3`) in the prime factorization of `n`.  
  2. If after removing all 2s and 3s, `n` is not 1 → impossible (answer = -1).  
  3. If `cnt2 > cnt3` → impossible (answer = -1), because we cannot remove extra 2s without enough 3s.  
  4. Otherwise, the minimum operations = `(cnt3 - cnt2) + cnt3`.  
     - `(cnt3 - cnt2)` multiplications by 2 to balance divisibility.  
     - `cnt3` divisions by 6 to reduce to 1.  

## Time and Space Complexity
- **Time Complexity:** `O(log n)`, since we repeatedly divide by 2 and 3 to count factors.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  
