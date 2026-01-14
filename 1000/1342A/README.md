# Problem Number - 1342A Road To Zero  
**Problem Link:** [https://codeforces.com/problemset/problem/1342/A](https://codeforces.com/problemset/problem/1342/A)  

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 100  
- 0 ≤ `x`, `y` ≤ 10⁹  
- 1 ≤ `a`, `b` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum cost to reduce two integers `x` and `y` to zero.  
- Two types of operations are allowed:  
  1. Decrease either `x` or `y` by 1 at cost `a`.  
  2. Decrease both `x` and `y` by 1 simultaneously at cost `b`.  

- Key observation:  
  - If `b < 2a`, then using the second operation (decrease both together) is beneficial.  
  - Otherwise, it’s cheaper to use the first operation individually.  

- Strategy:  
  - First, reduce both numbers together as much as possible using the cheaper option (`min(b, 2a)`).  
  - Then, reduce the remaining difference using single operations at cost `a`.  

- Formula:  
  - Let `minVal = min(x, y)` and `diff = |x - y|`.  
  - Total cost = `minVal * min(b, 2a) + diff * a`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, only constant space is used.  
