# Problem Number - 1676B Equal Candies

**Problem Link:** [https://codeforces.com/problemset/problem/1676/B](https://codeforces.com/problemset/problem/1676/B)

---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10^3 (number of test cases)  
- 1 ≤ `n` ≤ 50 (number of children)  
- 1 ≤ `a[i]` ≤ 10^7 (candies each child has)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Each child has some candies, and we want all children to have the same number by removing candies.  
- The optimal target is the **minimum number of candies** among all children, since we can only remove candies (not add).  
- For each child, the number of candies to remove is `(a[i] - min)`.  
- Summing these values across all children gives the total number of candies to be removed.  
- This ensures all children end up with the same number of candies.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array to find the minimum and compute the sum.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  
