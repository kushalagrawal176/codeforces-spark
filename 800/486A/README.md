# Problem Number - 486A Calculating Function  
**Problem Link:** [https://codeforces.com/problemset/problem/486/A](https://codeforces.com/problemset/problem/486/A)  

---

## Topics  
- Implementation  
- Math  
- Number Theory  

## Constraints  
- 1 ≤ `n` ≤ 10^15  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem defines a function `f(n)` as the sum:  
  

$f(n) = -1 + 2 - 3 + 4 - 5 + ....... + ( - 1)^n.n


  
  where odd numbers are subtracted and even numbers are added.  
- Observing the pattern:  
  - If `n` is even, the sum is `n/2`.  
  - If `n` is odd, the sum is `-(n+1)/2`.  
- This is because pairs `(2k-1, 2k)` contribute `+1` to the sum, and the parity of `n` determines the final result.  

### Approach:  
- Read `n`.  
- If `n` is even, output `n/2`.  
- If `n` is odd, output `-(n+1)/2`.  

This avoids iterating through all numbers up to `n`, which is crucial since `n` can be as large as 10^15.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, direct formula evaluation.  
- **Space Complexity:** `O(1)`, only constant space used.  
