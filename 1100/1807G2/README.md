# Problem Number - 1807G2 Subsequence Addition (Hard Version)  
**Problem Link:** [https://codeforces.com/problemset/problem/1807/G2](https://codeforces.com/problemset/problem/1807/G2)  

---

## Topics
- Greedy  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 2 × 10⁵ 
- 1 ≤ `a[i]` ≤ 2 × 10⁵  
- Sum of `n` over all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to build the entire array using a subsequence addition process.  
- Key idea:  
  - Sort the array so we can process elements in ascending order.  
  - Start with a running sum initialized to `1`.  
  - The first element must be `1` for the construction to be valid.  
  - For each subsequent element `a[i]`:  
    - If `a[i] ≤ sum`, then it can be added to the subsequence, and we update `sum += a[i]`.  
    - If `a[i] > sum`, then it is impossible to construct the sequence, since we cannot reach this value with the available sum.  
- If all elements satisfy the condition, the answer is `"YES"`. Otherwise, `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(1)`, aside from storing the input array.  
