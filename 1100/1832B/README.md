# Problem Number - 1832B Maximum Sum  
**Problem Link:** [https://codeforces.com/problemset/problem/1832/B](https://codeforces.com/problemset/problem/1832/B)  

---

## Topics
- Greedy  
- Prefix Sum  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10^4  
- 3 ≤ `n` ≤ 2 × 10^5  
- 1 ≤ `k` ≤ 99999  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to maximize the sum of the remaining array after performing exactly `k` operations, where each removal can either be:
  - Two smallest elements, or  
  - One largest element.  
- To solve this efficiently:
  - Sort the array.  
  - Compute prefix sums to quickly calculate sums of subarrays.  
  - Try all possible splits: remove `2*i` smallest elements and `(k-i)` largest elements for `i` ranging from `0` to `k`.  
  - For each split, calculate the remaining sum using prefix sums.  
  - Take the maximum over all possible splits.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n log n)` for sorting.  
  - `O(n)` for prefix sum computation.  
  - `O(k)` for checking all removal combinations.  
  - Overall: `O(n log n)`.  

- **Space Complexity:**  
  - `O(n)` for storing prefix sums.  
