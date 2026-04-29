# Problem Number - 2134C Even Larger  
**Problem Link:** [https://codeforces.com/problemset/problem/2134/C](https://codeforces.com/problemset/problem/2134/C)  

---

## Topics
- Greedy
- Implementation
- Arrays

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (array size)  
- 0 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem requires transforming the array so that for every odd index `i` (1-based), the condition `a[i] ≥ a[i-1] + a[i+1]` holds.  
- If the condition is not satisfied, we need to "increase" `a[i]` indirectly by reducing its neighbors (`a[i-1]` and `a[i+1]`) to make the inequality valid.  
- The minimum cost to fix each violation is the difference `(a[i-1] + a[i+1]) - a[i]`.  
- We greedily adjust neighbors to absorb this difference, ensuring the condition holds while accumulating the total cost.  
- At the end, if `n` is even, we check the last two elements (`a[n-2]` and `a[n-1]`) to ensure the condition still holds, adding the necessary adjustment if required.  
- This greedy approach works because each violation can be fixed locally without affecting future conditions.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once.  
- **Space Complexity:** `O(n)`, for storing the array.  
