# Problem Number - 1559A Mocha and Math  
**Problem Link:** [https://codeforces.com/problemset/problem/1559/A](https://codeforces.com/problemset/problem/1559/A)  

---

## Topics
- Bit Manipulation  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 100 (number of integers per test case)  
- 0 ≤ `a[i]` ≤ 10⁹ (value of each integer)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to compute the result of applying the **bitwise AND** operation across all integers in each test case.  
- Recall:  
  - Bitwise AND keeps a bit as `1` only if it is `1` in all numbers.  
  - Therefore, the final result is the intersection of all bits set across the given numbers.  
- Approach:  
  1. Read the first number and initialize it as `ans`.  
  2. For each subsequent number, update `ans = ans & number`.  
  3. After processing all numbers, output `ans`.  
- This works because the AND operation is associative and commutative, so the order doesn’t matter.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we perform one AND operation per number.  
- **Space Complexity:** `O(1)`, only a single accumulator variable is used.  
