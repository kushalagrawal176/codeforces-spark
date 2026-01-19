# Problem Number - 1352C K-th Not Divisible by n  
**Problem Link:** [https://codeforces.com/problemset/problem/1352/C](https://codeforces.com/problemset/problem/1352/C)  

---

## Topics
- Binary Search  
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 2 ≤ `n` ≤ 10⁹ (divisor)  
- 1 ≤ `k` ≤ 10⁹ (k-th position)  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to find the k-th positive integer that is **not divisible by n**.  
- Direct simulation is inefficient for large `n` and `k`.  
- Instead, use binary search:  
  - For a given number `mid`, the count of numbers ≤ `mid` that are not divisible by `n` is `mid - (mid / n)`.  
  - If this count is at least `k`, move left (reduce `high`).  
  - Otherwise, move right (increase `low`).  
- The smallest number satisfying the condition is the answer.  

## Time and Space Complexity
- **Time Complexity:** `O(log(n * k))`, due to binary search over the range `[1, n*k]`.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  
