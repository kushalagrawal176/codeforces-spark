# Problem Number - 2181H Honey Cake  

**Problem Link:** [https://codeforces.com/problemset/problem/2181/H](https://codeforces.com/problemset/problem/2181/H)  

---

## Topics
- Number Theory  
- GCD / LCM  
- Implementation  

---

## Constraints
- 1 ≤ `w`, `h`, `d` ≤ 10⁹ 
- 1 ≤ `n` ≤ 10⁹
- Time limit per test: 3 seconds  
- Memory limit per test: 1024 megabytes  

---

## Intuition / Approach
- The problem involves dividing a cake of dimensions `w × h × d` into exactly `n` equal pieces.  
- To achieve this, we need to check if `n` can be factorized consistently across the three dimensions.  
- The approach is:
  1. Start with `cnt = n`.  
  2. Compute `a = gcd(w, cnt)`, then divide `cnt` by `a`.  
  3. Compute `b = gcd(h, cnt)`, then divide `cnt` by `b`.  
  4. Compute `c = gcd(d, cnt)`, then divide `cnt` by `c`.  
  5. If after these steps `cnt != 1`, it means `n` cannot be distributed evenly → output `-1`.  
  6. Otherwise, the answer is `(a - 1, b - 1, c - 1)`, representing the cuts along each dimension.  

This ensures that the cake is divided into exactly `n` equal parts, or reports impossibility.  

---

## Time and Space Complexity
- **Time Complexity:** `O(log(min(w, h, d, n)))` due to gcd computations.  
- **Space Complexity:** `O(1)`, only constant extra space used.  