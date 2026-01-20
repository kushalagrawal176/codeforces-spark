# Problem Number - 1352B Same Parity Summands  
**Problem Link:** [https://codeforces.com/problemset/problem/1352/B](https://codeforces.com/problemset/problem/1352/B)  

---

## Topics
- Implementation  
- Math  
- Constructive Algorithms  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 10⁹ (target sum and number of summands)  
- 1 ≤ `k` ≤ 100 (target sum and number of summands)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We need to determine if it’s possible to represent `n` as the sum of `k` positive integers, all having the **same parity** (all odd or all even).  
- Two constructive strategies work:  
  1. **All odd summands:**  
     - If `n ≥ k` and `(n - k)` is even, we can use `k-1` ones and the last number as `n - (k-1)`.  
  2. **All even summands:**  
     - If `n ≥ 2k` and `(n - 2k)` is even, we can use `k-1` twos and the last number as `n - 2(k-1)`.  
- If neither condition holds, it’s impossible to construct such a sequence.  

- This approach ensures that:  
  - The sum equals `n`.  
  - All numbers are positive.  
  - All numbers share the same parity.  

## Time and Space Complexity
- **Time Complexity:** `O(k)` per test case (for printing the sequence).  
- **Space Complexity:** `O(1)`, aside from storing the sequence temporarily.  
