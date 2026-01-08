# Problem Number - 26A Almost Prime  
**Problem Link:** [https://codeforces.com/problemset/problem/26/A](https://codeforces.com/problemset/problem/26/A)  

---

## Topics
- Number Theory  
- Prime Factorization  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 3000  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- An `"almost prime"` is defined as a number that has **exactly two distinct prime divisors**.  
- For example:  
  - 6 = 2 × 3 → almost prime  
  - 18 = 2 × 3² → almost prime (two distinct primes)  
  - 30 = 2 × 3 × 5 → not almost prime (three distinct primes).  
- Approach:  
  - Iterate through all numbers from 2 to `n`.  
  - For each number, perform prime factorization and count distinct prime divisors.  
  - If the count equals 2, increment the answer.  
- This brute-force approach works within constraints since `n ≤ 3000`.  

## Time and Space Complexity
- **Time Complexity:** `O(n × √n)`, since factorization of each number up to `n` is performed.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  
