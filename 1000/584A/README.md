# Problem Number - 584A Olesya and Rodion  
**Problem Link:** [https://codeforces.com/problemset/problem/584/A](https://codeforces.com/problemset/problem/584/A)  

---

## Topics  
- Strings  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `n` ≤ 100 (desired length of the number)  
- 2 ≤ `t` ≤ 10 (given number string, treated as integer but used as string in solution)  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The task is to construct a number of length exactly `n` that is divisible by `t`.  
- If the length of `t` is greater than `n`, it’s impossible to construct such a number → output `-1`.  
- Otherwise, print `t` followed by enough zeros to make the total length equal to `n`.  
- This works because appending zeros to `t` preserves divisibility by `t` while extending the length.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we may need to append up to `n` zeros.  
- **Space Complexity:** `O(1)`, only constant extra space is used.  
