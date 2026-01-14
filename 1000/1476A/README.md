# Problem Number - 1476A K-divisible Sum  
**Problem Link:** [https://codeforces.com/problemset/problem/1476/A](https://codeforces.com/problemset/problem/1476/A)  

---

## Topics
- Math  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n`, `k` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of integers (all equal to `n`) required so that their sum is divisible by `k`.  
- Key idea:  
  - We want the smallest multiple of `k` that is greater than or equal to `n`.  
  - Let `a = ceil(n / k)`. Then `sum = a × k` is the smallest multiple of `k` ≥ `n`.  
  - The answer is `ceil(sum / n)`.  
- This ensures that the total sum formed by repeating `n` is divisible by `k`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, only constant space is used.  
