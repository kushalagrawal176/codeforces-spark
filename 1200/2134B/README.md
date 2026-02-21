# Problem Number - 2134B Add 0 or K  

**Problem Link:** [https://codeforces.com/problemset/problem/2134/B](https://codeforces.com/problemset/problem/2134/B)  

---

## Topics
- Number Theory  
- Constructive Algorithms  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 10⁵ (array size per test case)  
- 1 ≤ `k` ≤ 10⁹  
- 1 ≤ `aᵢ` ≤ 10⁹  
- Sum of n across all test cases ≤ 10⁵  
- Time limit per test: 1.5 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- You are given an array and a number `k`. In each operation, you can add either `0` or `k` to each element. You can perform at most `k` operations.  
- The goal is to make the **gcd of the array greater than 1**.  
- A constructive solution is guaranteed to exist.  

### Key Idea:
- For each element `a[i]`, transform it as:  arr[i] = arr[i] + k * (arr[i] % (k + 1));  
- This ensures that all numbers in the array become divisible by `(k+1)`.  
- Hence, the gcd of the entire array will be at least `(k+1)`, which is greater than 1.  
- This transformation is efficient and works within the given constraints.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once.  
- **Space Complexity:** `O(n)`, for storing the array.  