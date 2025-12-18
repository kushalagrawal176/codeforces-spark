# Problem Number - 1845A Forbidden Integer  
**Problem Link:** [https://codeforces.com/problemset/problem/1845/A](https://codeforces.com/problemset/problem/1845/A)  

---

## Topics  
- Greedy  
- Implementation  
- Math  
- Number Theory

## Constraints  
- 1 ≤ `t` ≤ 100  
- 1 ≤ `x` ≤ `k` ≤ `n` ≤ 100 
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to represent the integer `n` as a sum of positive integers not equal to `x`, with each integer ≤ `k`.  
- If `x != 1`, the simplest solution is to use `n` ones, since `1` is allowed.  
- If `x == 1`, then `1` cannot be used:  
  - If `k == 1`, no solution exists because only `1` is available but forbidden.  
  - If `k == 2` and `n` is odd, no solution exists because only `2`s can be used, and they cannot sum to an odd number.  
  - Otherwise, a solution exists:  
    - If `n` is even, use `n/2` twos.  
    - If `n` is odd, use `(n-3)/2` twos and one `3` to make the sum equal to `n`.  
- This greedy construction ensures a valid decomposition whenever possible.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we may output up to `n` numbers in the worst case.  
- **Space Complexity:** `O(1)`, only a few variables are used for computation.  
