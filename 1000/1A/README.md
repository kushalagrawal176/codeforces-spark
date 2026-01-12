# Problem Number - 1A Theatre Square  
**Problem Link:** [https://codeforces.com/problemset/problem/1/A](https://codeforces.com/problemset/problem/1/A)  

---

## Topics  
- Math  
- Implementation  

## Constraints  
- 1 ≤ `m`, `n`, `a` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks for the minimum number of square tiles of size `a × a` required to cover a rectangular area of size `m × n`.  
- To cover the rectangle, we need to compute how many tiles fit along the length and width.  
- Since partial tiles are not allowed, we use the ceiling function:  `tiles = ((m + a - 1) / a) * ((n + a - 1) / a)`  
- This ensures that even if the rectangle dimensions are not multiples of `a`, we account for the extra tile needed.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, constant space usage.  
