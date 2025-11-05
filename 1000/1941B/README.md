# Problem Number - 1941B Rudolf and 121
**Problem Link:** [https://codeforces.com/problemset/problem/1941/B](https://codeforces.com/problemset/problem/1941/B)

---

## Topics

1. Implementation  
2. Greedy  
3. Simulation

## Constraints

1. Number of test cases: 1 ≤ t ≤ 10⁴  
2. Array size per test case: 3 ≤ n ≤ 2 × 10⁵  
3. Array elements: 0 ≤ aᵢ ≤ 10⁹  
4. Total sum of all `n` across test cases does not exceed 2 × 10⁵

## Intuition / Approach

1. Rudolf can perform an operation on any index `i` such that `2 ≤ i ≤ n - 1`, which modifies three elements:  
   - `a[i-1] = a[i-1] - 1`  
   - `a[i] = a[i] - 2`  
   - `a[i+1] = a[i+1] - 1`  
2. This operation reduces the total sum by 4 and redistributes values locally.  
3. The goal is to determine whether it's possible to reduce all elements of the array to zero using any number of such operations.  
4. Key insight: simulate the reverse of the operation to check if the array can be constructed from zeros using valid steps.  
5. Traverse the array from left to right, and at each step, try to apply the reverse operation greedily if possible.  
6. If at any point the required values to reverse the operation are not available, return "NO".  
7. If the entire array can be reduced to zeros, return "YES".

---

## Time and Space Complexity

- **Time Complexity:** O(n) per test case (linear scan and greedy simulation)  
- **Space Complexity:** O(1) (in-place operations or constant auxiliary space)
