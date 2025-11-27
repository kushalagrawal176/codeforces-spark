# Problem Number - 472A Design Tutorial: Learn from Math  
**Problem Link:** [https://codeforces.com/problemset/problem/472/A](https://codeforces.com/problemset/problem/472/A)  

---

## Topics  
- Implementation  
- Math  
- Number Theory  

## Constraints  
- 12 ≤ `n` ≤ 10^6  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks us to represent a given integer `n` (where `n ≥ 12`) as the sum of two composite numbers.  
- Composite numbers are integers greater than 1 that are not prime.  
- A simple constructive approach works here:  
  - If `n` is even, we can choose `4` and `n - 4`. Both are composite when `n ≥ 12`.  
  - If `n` is odd, we can choose `9` and `n - 9`. Both are composite when `n ≥ 13`.  
- This guarantees a valid solution without needing to check primality for multiple numbers.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since we directly construct the answer without iteration.  
- **Space Complexity:** `O(1)`, only constant space is used.  
