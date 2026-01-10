# Problem Number - 1471A Strange Partition  
**Problem Link:** [https://codeforces.com/problemset/problem/1471/A](https://codeforces.com/problemset/problem/1471/A)  
---

## Topics
- Greedy  
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 10⁵ 
- 1 ≤ `x` ≤ 10⁹  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given an array of integers and a divisor `x`.  
- The task is to compute two values:  
  1. **Minimum possible number of groups** if we partition the sum of all elements by `x`.  
     - This is essentially `ceil(total_sum / x)`.  
  2. **Maximum possible number of groups** if each element is divided individually by `x`.  
     - For each element `a[i]`, the contribution is `ceil(a[i] / x)`.  
     - Summing these values gives the maximum possible number of groups.  
- The difference arises because grouping elements together can reduce the total number of partitions compared to splitting them individually.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through all elements once.  
- **Space Complexity:** `O(1)`, only constant space used for accumulation.  
