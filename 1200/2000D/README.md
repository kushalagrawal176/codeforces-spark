# Problem Number - 2000D Right Left Wrong  
**Problem Link:** [https://codeforces.com/problemset/problem/2000/D](https://codeforces.com/problemset/problem/2000/D)  

---

## Topics  
- Greedy  
- Prefix Sum  
- Implementation  
- Two-Pointers

## Constraints  
- 1 ≤ `t` ≤ 10⁴  
- 2 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `aᵢ` ≤ 10⁵  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The strip consists of **n cells**, each containing a positive integer `a[i]` and a direction `s[i]` (`L` or `R`).  
- An operation can be performed by choosing indices `l` and `r` such that `s[l] = 'L'` and `s[r] = 'R'`.  
- The score gained is the sum of all values between `l` and `r` inclusive. After the operation, all cells in `[l, r]` are marked unusable.  
- To maximize the score, we should greedily pair the **leftmost `L`** with the **rightmost `R`** while they are valid.  
- Using **prefix sums**, we can quickly compute the sum of values between any two indices.  
- The algorithm proceeds with two pointers (`l` from the left, `r` from the right):  
  - Skip positions where `s[l] = 'R'` (not usable as left boundary).  
  - Skip positions where `s[r] = 'L'` (not usable as right boundary).  
  - If `l < r`, add the segment sum `a[r+1] - a[l]` to the score.  
  - Move both pointers inward and repeat until no valid pair remains.  

This greedy approach ensures that we maximize the score by always taking the widest valid segments first.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since each pointer moves at most `n` steps.  
- **Space Complexity:** `O(n)`, for storing prefix sums.  
