# Problem Number - 1777A Everybody Likes Good Arrays!  
**Problem Link:** [https://codeforces.com/problemset/problem/1777/A](https://codeforces.com/problemset/problem/1777/A)  

---

## Topics  
- Implementation  
- Arrays  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 500  
- 1 ≤ `n` ≤ 100    
- 1 ≤ `a[i]` ≤ 10^9    
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- A **good array** is defined as an array where every pair of consecutive elements has different parity.  
- The problem asks us to determine the minimum number of changes required to make the given array good; by selecting any pair of adjacent elements having same parity and replacing them by their product.  
- Key observation:   
  - To fix the array, we need to count how many such "not good pairs" exist.  
- Approach:  
  1. Iterate through the array.  
  2. For each consecutive pair `(a[i], a[i+1])`, check if their parity differs.  
  3. Count the number of mismatches.  
  4. The answer is simply the number of mismatches, since each mismatch requires one change.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for scanning the array once.  
- **Space Complexity:** `O(1)`, only counters are used.  
