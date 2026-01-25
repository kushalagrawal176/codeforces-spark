# Problem Number - 520B Two Buttons  
**Problem Link:** [https://codeforces.com/problemset/problem/520/B](https://codeforces.com/problemset/problem/520/B)  

---

## Topics
- Greedy  
- Implementation  
- Math  

## Constraints
- 1 ≤ `n`, `m` ≤ 10⁴  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of operations to transform integer `n` into integer `m`.  
- Allowed operations:  
  1. Multiply the current number by 2.  
  2. Subtract 1 from the current number.  
- A direct BFS approach is possible, but a **greedy reverse strategy** is more efficient:  
  - Instead of starting from `n` and trying to reach `m`, we start from `m` and try to reduce it to `n`.  
  - If `m` is even, the best move is to divide it by 2 (reverse of multiplication).  
  - If `m` is odd, the best move is to increment it by 1 (reverse of subtraction).  
  - Each operation reduces `m` closer to `n`.  
- Once `m ≤ n`, the only way to reach `n` is by subtracting `(n - m)`.  
- This greedy approach ensures minimal steps because dividing by 2 when possible is always optimal compared to subtracting repeatedly.  

## Time and Space Complexity
- **Time Complexity:** `O(log m)`, since we repeatedly halve `m` until it becomes less than or equal to `n`.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  
