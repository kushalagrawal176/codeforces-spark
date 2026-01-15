# Problem Number - 1691B Shoe Shuffling  

**Problem Link:** [https://codeforces.com/problemset/problem/1691/B](https://codeforces.com/problemset/problem/1691/B)  

---

## Topics  
- Implementation  
- Simulation  
- Arrays  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 10⁵ (number of shoes)  
- 1 ≤ `arr[i]` ≤ 10⁹ (shoe sizes)  
- Sum of all `n` across test cases ≤ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given `n` shoes with sizes. The task is to shuffle them so that no shoe remains in its original position, but shoes of the same size must stay together.  
- Key observation:  
  - If any shoe size occurs only once, it is **impossible** to shuffle (output `-1`).  
  - Otherwise, for each group of identical sizes, we can rotate their positions within the group.  
- Approach:  
  1. Read the shoe sizes.  
  2. Traverse the array, grouping consecutive identical sizes.  
  3. For each group:  
     - Rotate indices within the group (e.g., `[i, i+1, ..., j]` → `[i+1, ..., j, i]`).  
  4. If any group has size 1, print `-1`. Otherwise, print the shuffled indices.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we traverse the array once.  
- **Space Complexity:** `O(n)`, for storing the answer array.  
