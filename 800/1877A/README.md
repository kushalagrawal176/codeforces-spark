# Problem Number - 1877A Goals of Victory

**Problem Link:** [https://codeforces.com/problemset/problem/1877/A](https://codeforces.com/problemset/problem/1877/A)

---

## Topics
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 500  
- 2 ≤ `n` ≤ 100  
- -100 ≤ `a[i]` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives `n-1` integers and asks us to determine the missing last integer such that the sum of all `n` integers equals `0`.  
- Key observations:
  - Let the given numbers be `a1, a2, ..., a(n-1)`.  
  - Their sum is `S = a1 + a2 + ... + a(n-1)`.  
  - To make the total sum equal to `0`, the missing number must be `-S`.  
- Steps:
  1. Read `n`.  
  2. Compute the sum of the first `n-1` integers.  
  3. Output `-sum` as the missing integer.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we sum up `n-1` integers.  
- **Space Complexity:** `O(1)`, only constant space is used for accumulation.  
