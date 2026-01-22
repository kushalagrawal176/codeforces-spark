# Problem Number - 451B Sort the Array  

**Problem Link:** [https://codeforces.com/problemset/problem/451/B](https://codeforces.com/problemset/problem/451/B)  

---

## Topics  
- Implementation  
- Arrays  
- Sorting  
- Greedy  

## Constraints  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether an array can be sorted in non-decreasing order by reversing exactly one contiguous subsegment.  
- Steps to solve:  
  1. Traverse the array until the sequence stops being increasing → mark this index as `i`.  
  2. Continue traversing while the sequence is decreasing → mark the end of this segment as `j`.  
  3. Continue traversing while the sequence is increasing again → mark this as `k`.  
  4. If `k == n` (we reached the end), then check boundary conditions:  
     - If `i > 1`, ensure `a[j] >= a[i-1]`.  
     - If `j < n`, ensure `a[i] <= a[j+1]`.  
  5. If conditions hold, print `"yes"` and the segment `[i, j]`. Otherwise, print `"no"`.  
- This works because reversing one decreasing segment should restore the array to sorted order if boundaries align correctly.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we scan the array once.  
- **Space Complexity:** `O(1)`, only a few variables are used to track indices.  