# Problem Number - 1708B Difference of GCDs  

**Problem Link:** [https://codeforces.com/problemset/problem/1708/B](https://codeforces.com/problemset/problem/1708/B)  

---

## Topics
- Number Theory  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴
- 1 ≤ `n` ≤ 10⁵
- 1 ≤ `l` ≤ `r` ≤ 10⁹ 
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to construct an array `a` of size `n` such that for each index `i` (1-based), the element `a[i]` lies in the range `[l, r]` and **gcd(a[i], i) are all distinct**.  
- To achieve this, for each `i` from 1 to `n`, we try to find the smallest multiple of `i` that is greater than or equal to `l`.  
  - If `l % i == 0`, then `l` itself is valid.  
  - Otherwise, the next multiple is `(l / i + 1) * i`.  
- If this value exceeds `r`, then it is impossible to construct the array, and the answer is `"NO"`.  
- If all values are valid, we print `"YES"` followed by the constructed array.  

This greedy approach works because each index `i` is independent, and we only need to ensure divisibility and range constraints.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through all indices from 1 to `n`.  
- **Space Complexity:** `O(n)`, for storing the constructed array.  
