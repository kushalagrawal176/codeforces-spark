# Problem Number - 2128A Recycling Center  
**Problem Link:** [https://codeforces.com/problemset/problem/2128/A](https://codeforces.com/problemset/problem/2128/A)  

---

## Topics  
- Implementation  
- Sorting  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 30 (number of items per test case)  
- 1 ≤ `aᵢ` ≤ 10⁹ (value of each item)  
- 1 ≤ `c` ≤ 10⁹ (capacity limit)  
- Sum of `n` over all test cases ≤ 2·10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given an array of `n` items with values and a capacity `c`.  
- The recycling process works as follows:  
  - Start with multiplier `m = 1`.  
  - Traverse items from largest to smallest.  
  - If `a[i] * m ≤ c`, then the item can be processed, and we double `m`.  
  - Otherwise, the item cannot be processed, and we must pay one coin.  
- The goal is to count how many items cannot be processed under these rules.  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case:  
   - Read integers `n` and `c`.  
   - Read the array `a`.  
   - Sort the array in ascending order.  
   - Initialize `m = 1` and `coins = 0`.  
   - Traverse the array from largest to smallest:  
     - If `a[i] * m ≤ c`, update `m = m * 2`.  
     - Else, increment `coins`.  
   - Print the number of coins.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)` per test case due to sorting.  
- **Space Complexity:** `O(n)` for storing the array.  
