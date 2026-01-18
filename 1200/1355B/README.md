# Problem Number - 1355B Young Explorers  

**Problem Link:** [https://codeforces.com/problemset/problem/1355/B](https://codeforces.com/problemset/problem/1355/B)  

---

## Topics  
- Greedy  
- Sorting  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 2 ⋅ 105 (number of test cases)  
- 1 ≤ `n` ≤ 2 ⋅ 10^5 (number of explorers per test case)  
- 1 ≤ `a[i]` ≤ `n` (minimum group size requirement for each explorer)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- Each explorer specifies a minimum group size requirement `a[i]`.  
- The task is to maximize the number of groups formed such that each group satisfies all its members' requirements.  
- **Greedy Strategy:**  
  - Sort the array of requirements.  
  - Traverse the sorted list while counting explorers in the current group.  
  - Once the count of explorers in the group is greater than or equal to the current explorer's requirement, a valid group can be formed.  
  - Reset the counter and continue forming new groups.  
- Sorting ensures smaller requirements are satisfied first, which maximizes the number of groups.  

## Time and Space Complexity  
- **Time Complexity:**  
  - Sorting: `O(n log n)`  
  - Traversal: `O(n)`  
  - Overall: **O(n log n)** per test case  
- **Space Complexity:**  
  - `O(n)` for storing explorers' requirements  