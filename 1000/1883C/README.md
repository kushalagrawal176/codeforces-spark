# Problem Number - 1883C Raspberries  
**Problem Link:** [https://codeforces.com/problemset/problem/1883/C](https://codeforces.com/problemset/problem/1883/C)  

---

## Topics
- Greedy  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 2 ≤ `n` ≤ 10⁵  
- 2 ≤ `k` ≤ 5  
- 1 ≤ `a[i]` ≤ 10  
- Sum of `n` over all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of increments required to make at least one element divisible by `k`.  
- For each element `val`, the cost is `(val % k == 0) ? 0 : k - (val % k)`.  
- Track the minimum cost across all elements.  
- Special case when `k = 4`:  
  - Having at least two even numbers can reduce the cost further.  
  - Therefore, compute `res = min(res, max(0, 2 - evenCount))`.  

- The greedy approach ensures we always pick the smallest adjustment needed.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each element is processed once.  
- **Space Complexity:** `O(1)`, only constant space is used for counters and minimum tracking.  
