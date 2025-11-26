# Problem Number - 1399A Remove Smallest  
**Problem Link:** [https://codeforces.com/problemset/problem/1399/A](https://codeforces.com/problemset/problem/1399/A)  

---

## Topics  
- Implementation  
- Sorting  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 50 (number of integers in the array)  
- 1 ≤ `a[i]` ≤ 100 (array elements)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks whether it is possible to repeatedly remove the smallest element from the array such that the remaining elements still satisfy the condition: the difference between any two consecutive elements is at most 1.  
- Key idea:  
  - Sort the array.  
  - After sorting, check consecutive differences.  
  - If any difference between adjacent elements is greater than 1, it is impossible → **NO**.  
  - Otherwise, it is possible → **YES**.  
- Sorting ensures that we only need to check consecutive pairs instead of all possible combinations.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)` per test case, due to sorting.  
- **Space Complexity:** `O(1)`, only constant space used for flags and iteration.  
