# Problem Number - 1862B Sequence Game  
**Problem Link:** [https://codeforces.com/problemset/problem/1862/B](https://codeforces.com/problemset/problem/1862/B)  

---

## Topics  
- Arrays  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `n` ≤ 2⋅10^5  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem gives an array `a` of length `n`.  
- We need to construct a new array `b` based on the following rule:  
  - Start with the first element of `a`.  
  - For each subsequent element `a[i]`:  
    - If `a[i]` is greater than or equal to `a[i-1]`, append `a[i]` once to `b`.  
    - If `a[i]` is smaller than `a[i-1]`, append `a[i]` twice to `b`.  
- This ensures that the new array `b` reflects the "merging" process described in the problem.  
- Finally, output the size of `b` and the elements of `b`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once.  
- **Space Complexity:** `O(n)`, for storing the new array `b`.  
