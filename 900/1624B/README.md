# Problem Number - 1624B Make AP  
**Problem Link:** [https://codeforces.com/problemset/problem/1624/B](https://codeforces.com/problemset/problem/1624/B)  

---

## Topics
- Arithmetic Progression  
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `a`, `b`, `c` ≤ 10⁸ (values of the sequence)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to make the three numbers `a`, `b`, and `c` form an **arithmetic progression (AP)** by multiplying **exactly one** of them by a positive integer.  
- Recall: In an AP, the middle element is the average of the first and last: `2*b = a + c`.  
- We check three possible cases:
  1. **Adjust `b`:** If `(a + c)` is even, then `(a + c)/2` must be divisible by `b`.  
  2. **Adjust `c`:** If `(2*b - a)` is positive and divisible by `c`, then replacing `c` makes AP.  
  3. **Adjust `a`:** If `(2*b - c)` is positive and divisible by `a`, then replacing `a` makes AP.  
- If any of these conditions hold, output `"YES"`. Otherwise, output `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a few arithmetic checks are performed.  
- **Space Complexity:** `O(1)`, as no extra storage is required beyond input variables.  
