# Problem Number - 1826B Lunatic Never Content  
**Problem Link:** [https://codeforces.com/problemset/problem/1826/B](https://codeforces.com/problemset/problem/1826/B)  

---

## Topics
- Number Theory  
- Implementation  
- GCD  

---

## Constraints
- 1 ≤ `t` ≤ 10⁵ (number of test cases)  
- 1 ≤ `n` ≤ 10⁵ (array size)  
- 0 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to determine the largest integer `k` such that the array can be made palindromic if each element is replaced by its value modulo `k`.  
- To achieve this, we compute the differences between symmetric elements: `|a[i] - a[n-1-i]|`.  
- The required `k` is the greatest common divisor (GCD) of all these differences.  
- If all symmetric pairs are equal, the differences are zero, and the GCD is zero, meaning any `k` works. In that case, the answer is `0`.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through half the array and compute GCD.  
- **Space Complexity:** `O(n)` for storing the array.  
