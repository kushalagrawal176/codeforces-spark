# Problem Number - 1520D Same Differences  
**Problem Link:** [https://codeforces.com/problemset/problem/1520/D](https://codeforces.com/problemset/problem/1520/D)  

---

## Topics
- Implementation  
- Hashing / Maps  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (array size per test case)  
- 1 ≤ `a[i]` ≤ `n` (array elements)  
- Sum of `n` over all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We need to count pairs `(i, j)` such that `i < j` and `a[j] - a[i] = j - i`.  
- Rearranging gives: `i - a[i] = j - a[j]`.  
- This means that for each index `i`, the value `(i - a[i])` must match with another index’s `(j - a[j])`.  
- Approach:  
  - Traverse the array and compute `(i - a[i])` for each element.  
  - Store frequencies of these values in a hash map.  
  - For each frequency `f`, the number of valid pairs is `f choose 2 = f * (f - 1) / 2`.  
  - Sum over all frequencies to get the final answer.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the array once and compute frequencies.  
- **Space Complexity:** `O(n)`, for storing the hash map of differences.  
