# Problem Number - 2122B Pile Shuffling  

**Problem Link:** [https://codeforces.com/problemset/problem/2122/B](https://codeforces.com/problemset/problem/2122/B)  

---

## Topics
- Greedy  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 ⋅ 10⁵  
- 0 ≤ `a`, `b`, `c`, `d` ≤ 10⁹  
- Sum of `n` over all test cases ≤ 2 ⋅ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Each pile is described by four integers `(a, b, c, d)` representing the number of zeros and number of one in a pile before and after.  
- The goal is to compute the minimum number of operations required to make the piles consistent.  
- Observations:  
  - If the number of ones before (`b`) is greater than after (`d`), then we must add the difference `(b - d)` plus the zeros `a` to balance.  
  - Otherwise, if the number of ones before (`a`) is greater than after (`c`), we must add `(a - c)`.  
- Summing these adjustments across all piles gives the final answer for each test case.  
- The solution is greedy: at each pile, we only need to check two conditions (`b > d` or `a > c`) and add the required difference.  

## Note
- In Java, Scanner solution will give Time Limit Exceeded, even though solution is O(n), as input is large and scanner is slow in reading.
- BufferedReader is fast in reading input and processing.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through all piles once.  
- **Space Complexity:** `O(1)`, only constant space is used for accumulation.  