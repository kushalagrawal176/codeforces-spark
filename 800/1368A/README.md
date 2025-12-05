# Problem Number - 1368A C+=  

**Problem Link:** [https://codeforces.com/problemset/problem/1368/A](https://codeforces.com/problemset/problem/1368/A)  

---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `a`, `b` ≤ `n` ≤ 10^9  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem asks us to determine the minimum number of operations required until either `a` or `b` becomes greater than `n`.  
- Operation: choose the smaller of the two numbers and add the larger one to it.  
- Steps to solve:  
  1. Start with given values `a`, `b`, and `n`.  
  2. While both `a` and `b` are ≤ `n`:  
     - If `a < b`, update `a = a + b`.  
     - Else, update `b = a + b`.  
     - Increment the operation counter.  
  3. Once either `a` or `b` exceeds `n`, stop and output the counter.  

- This greedy approach works because always adding the larger number to the smaller one maximizes growth and minimizes the number of steps.  

## Time and Space Complexity
- **Time Complexity:** `O(k)`, where `k` is the number of operations until one number exceeds `n`. In practice, this is small because values grow quickly.  
- **Space Complexity:** `O(1)`, only constant space is used for variables.  
