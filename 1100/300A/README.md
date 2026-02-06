# Problem Number - 300A Array  
**Problem Link:** [https://codeforces.com/problemset/problem/300/A](https://codeforces.com/problemset/problem/300/A)  
---

## Topics
- Greedy
- Implementation
- Arrays

## Constraints
- 3 ≤ `n` ≤ 100  
- -1000 ≤ `a[i]` ≤ 1000  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to divide the given array into **three non-empty sets** such that:
  1. The product of the first set is **negative**.  
  2. The product of the second set is **positive**.  
  3. The product of the third set is **zero**.  

- To achieve this:
  - We must ensure the **first set** contains exactly **one negative number** (to guarantee negativity).  
  - The **second set** should contain either:
    - One positive number, or  
    - Two negative numbers (since their product is positive).  
  - The **third set** will contain all remaining numbers (zeros, leftover positives, and leftover negatives).  

- This greedy partitioning ensures all three sets are non-empty and satisfy the product conditions.  

### Step-by-step:
1. Pick one negative number → first set.  
2. If there exists a positive number, put one in the second set. Otherwise, take two negatives.  
3. Put all remaining numbers (including zeros) into the third set.  

This guarantees the required conditions are met.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through the array once.  
- **Space Complexity:** `O(n)`, for storing positives, negatives, and zeros separately.  
