# Problem Number - 1328A Divisibility Problem  
**Problem Link:** [https://codeforces.com/problemset/problem/1328/A](https://codeforces.com/problemset/problem/1328/A)  

---

## Topics  
- Math  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `a`, `b` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to find the minimum number that needs to be added to `a` so that it becomes divisible by `b`.  
- If `a` is already divisible by `b` (`a % b == 0`), then the answer is `0`.  
- Otherwise, we need to add enough to reach the next multiple of `b`.  
- The next multiple of `b` after `a` is `((a / b) + 1) * b`.  
- Therefore, the required addition is:  
  

`Answer = ((a / b) + 1) * b - a`

  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since we only perform arithmetic operations.  
- **Space Complexity:** `O(1)`, constant space usage.  
