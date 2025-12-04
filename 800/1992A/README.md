# Problem Number - 1992A Only Pluses  
**Problem Link:** [https://codeforces.com/problemset/problem/1992/A](https://codeforces.com/problemset/problem/1992/A)  

---

## Topics  
- Greedy  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `a`, `b`, `c` ≤ 10  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem gives three integers `a`, `b`, and `c`.  
- We are allowed to perform at most 5 operations. In each operation, we must increment the smallest among the three numbers.  
- After performing all 5 operations, we need to output the product `a × b × c`.  
- The greedy approach works because incrementing the smallest number maximizes the final product.  
- Steps:  
  1. Repeat 5 times: increment the smallest among `a`, `b`, and `c`.  
  2. After all increments, compute the product `a * b * c`.  
  3. Print the result.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since the number of operations is fixed (5).  
- **Space Complexity:** `O(1)`, only a few variables are used.  
