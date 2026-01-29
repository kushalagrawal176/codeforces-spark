# Problem Number - 285C Building Permutation  

**Problem Link:** [https://codeforces.com/problemset/problem/285/C](https://codeforces.com/problemset/problem/285/C)  

---

## Topics
- Greedy  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 3 · 10⁵  
- -10⁹ ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The goal is to transform the given sequence into a valid permutation of numbers from `1` to `n` with minimum cost.  
- **Cost Definition:** Changing a number `x` to `y` costs `|x - y|`.  
- To minimize the total cost, we should align the sorted sequence with the natural permutation `[1, 2, ..., n]`.  
- **Why Sorting Works:**  
  - Sorting ensures that the smallest numbers are matched with the smallest positions, avoiding large mismatches.  
  - After sorting, for each index `i`, the expected value is `(i+1)`.  
  - The cost is then the sum of absolute differences:  `cost = Σ |(i+1) - a[i]|,  i = 0..n-1`

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(n)`, for storing the input array.  
