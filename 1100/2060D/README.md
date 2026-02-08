# Problem Number - 2060D Subtract Min Sort

**Problem Link:** [https://codeforces.com/problemset/problem/2060/D](https://codeforces.com/problemset/problem/2060/D)

---

## Topics
- Greedy
- Implementation
- Arrays

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 2 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `aᵢ` ≤ 10⁹  
- Sum of `n` over all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- You are given an array of positive integers and can repeatedly perform the operation:  
  Select index `i` (1 ≤ i < n), and subtract `min(a[i], a[i+1])` from both `a[i]` and `a[i+1]`.  

- The key observation is that after applying the operation, the smaller of the two elements becomes **0**, and the larger becomes their difference.  
  This means the operation effectively reduces the pair `(a[i], a[i+1])` to `(0, |a[i] - a[i+1]|)`.

- To make the array non-decreasing:
  - Each step ensures that the next element is reduced by the previous one.  
  - If at any point `a[i] > a[i+1]`, it is impossible to fix the order, since subtracting the minimum cannot reverse the inequality.  

- Thus, the algorithm is:
  1. Iterate through the array.  
  2. If `a[i] > a[i+1]`, output `"NO"`.  
  3. Otherwise, update `a[i+1] -= a[i]`.  
  4. If the loop completes, output `"YES"`.  

- This greedy approach works because the operation always eliminates the smaller element and reduces the larger, preserving the possibility of a non-decreasing sequence.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(n)`, for storing the array.  
