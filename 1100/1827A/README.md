# Problem Number - 1827A Counting Orders  
**Problem Link:** [https://codeforces.com/problemset/problem/1827/A](https://codeforces.com/problemset/problem/1827/A)  

---

## Topics
- Sorting  
- Combinatorics  
- Modular Arithmetic  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵ (sum of all n across test cases ≤ 2 × 10⁵)  
- 1 ≤ `a[i]`, `b[i]` ≤ 10⁹  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to count the number of valid ways to assign elements of array `a` to array `b` under the condition that each chosen `b[j]` must be strictly less than the corresponding `a[i]`.  
- **Step 1:** Sort both arrays `a` and `b`.  
- **Step 2:** For each `a[i]`, count how many elements in `b` are strictly less than `a[i]`.  
- **Step 3:** If `j` is the number of elements in `b` less than `a[i]`, then the number of choices for `a[i]` is `(j - i)` (since `i` elements of `a` have already been assigned).  
- **Step 4:** Multiply all these values together modulo `10^9+7`.  
- **Step 5:** If at any point `(j - i) ≤ 0`, the answer becomes `0`.  

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting: `O(n log n)`.  
  - Counting with two pointers: `O(n)`.  
  - Total per test case: `O(n log n)`.  
- **Space Complexity:** `O(n)`, for storing the arrays.  
