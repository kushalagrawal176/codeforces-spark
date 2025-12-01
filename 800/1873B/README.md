# Problem Number - 1873B Good Kid

**Problem Link:** [https://codeforces.com/problemset/problem/1873/B](https://codeforces.com/problemset/problem/1873/B)

---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10000 (number of test cases)  
- 1 ≤ `n`≤ 9 (size of the array)  
- 0 ≤ `a[i]` ≤ 9 (array elements)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to maximize the product of the array after increasing **exactly one element by 1**.  
- Key observations:  
  1. If there are multiple zeros, the product is always 0.  
  2. If there is exactly one zero, the product is formed by multiplying all non-zero elements.  
  3. If there are no zeros, the optimal strategy is to replace the **smallest element** with `(element + 1)` to maximize the product.  
- Thus, the approach is:  
  - Find the minimum element in the array.  
  - Increase it by 1.  
  - Compute the product of the modified array.  
- This ensures the maximum possible product.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array to find the minimum and compute the product.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  
