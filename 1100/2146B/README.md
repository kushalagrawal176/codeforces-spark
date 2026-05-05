# Problem Number - 2146B Merging the Sets  
**Problem Link:** [https://codeforces.com/problemset/problem/2146/B](https://codeforces.com/problemset/problem/2146/B)

---

## Topics
- Implementation  
- Sets  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 5 ⋅ 10⁵ (number of sets)  
- 1 ≤ `m` ≤ 10⁵ (number of elements)  
- 1 ≤ `l[i]` ≤ `m` (number of elements)  
- Sum of all `l` across test cases ≤ 2 ⋅ 10⁵  
- Sum of all `n` across test cases ≤ 5 ⋅ 10⁴  
- Sum of all `m` across test cases ≤ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given `n` sets, each containing some elements from `1` to `m`.  
- The task is to check if it is possible to merge **at least two sets** such that every element from `1` to `m` is still covered.  

### Key Observations:
1. **Coverage Check:**  
   - Every element from `1` to `m` must appear in at least one set.  
   - If any element is missing, the answer is immediately **NO**.  

2. **Unique Ownership:**  
   - If an element appears in exactly one set, that set is "essential" for coverage.  
   - Removing such a set would cause that element to disappear.  

3. **Feasibility Condition:**  
   - Count how many sets are "essential" (contain uniquely owned elements).  
   - If after removing all essential sets, at least **two sets remain**, then merging is possible.  
   - Otherwise, the answer is **NO**.  

### Steps:
- Build a mapping from each element `1..m` to the sets containing it.  
- Check if all elements are covered.  
- Track sets that uniquely own elements.  
- If `n - (#essential sets) ≥ 2` and coverage is complete → **YES**, else **NO**.  

## Time and Space Complexity
- **Time Complexity:** `O(n + total elements)`, since we process each set and each element once.  
- **Space Complexity:** `O(n + m)`, for storing sets and element-to-set mappings.  
