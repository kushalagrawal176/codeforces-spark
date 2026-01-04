# Problem Number - 2042A Greedy Monocarp  

**Problem Link:** [https://codeforces.com/problemset/problem/2042/A](https://codeforces.com/problemset/problem/2042/A)  

---

## Topics
- Greedy  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 50 (number of elements per test case)  
- 1 ≤ `k` ≤ 10⁷  
- 1 ≤ `a[i]` ≤ `k`  
- Time limit per test: 2 second  
- Memory limit: 512 megabytes  

## Intuition / Approach
- We are given an array of integers and a target sum `k`.  
- The task is to determine the minimum adjustment needed so that the sum of selected elements equals `k`.  

### Key Observations:
1. Sort the array in ascending order.  
2. Start accumulating from the largest element downwards.  
3. If the running sum equals `k`, stop.  
4. If the running sum exceeds `k`, compute the adjustment needed:  `cnt = k - sum + arr[i]`  
   This effectively reduces the excess by adjusting the last added element.  
5. If the sum is less than `k` after considering all elements, the difference `k - sum` is the adjustment needed.  

### Steps:
1. Read input values.  
2. Sort the array.  
3. Traverse from the largest element to the smallest, maintaining a running sum.  
4. Check conditions (`sum == k`, `sum > k`, `sum < k`) and compute the adjustment.  
5. Print the result.  

This greedy approach works because starting from the largest values maximizes the chance of reaching or exceeding `k` quickly, and adjustments can then be calculated directly.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case due to sorting.  
- **Space Complexity:** `O(n)` for storing the array.  