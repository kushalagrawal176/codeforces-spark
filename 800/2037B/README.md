# Problem Number - 2037B Intercepted Inputs  
**Problem Link:** [https://codeforces.com/problemset/problem/2037/B](https://codeforces.com/problemset/problem/2037/B)  

---

## Topics  
- Implementation  
- Math  
- Number Theory  
- Hashing / Frequency Counting  

## Constraints  
- 1 ≤ `t` ≤ 10⁴  
- 3 ≤ `k` ≤ 2 ⋅ 10⁵  
- 1 ≤ `a[i]` ≤ `k`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given an array of size `k` and need to find two numbers `x` and `y` such that:  
  - `x * y = k - 2`  
  - Both `x` and `y` appear in the array.  
- Approach:  
  - Count the frequency of each number in the array using a map or hash table.  
  - Iterate over possible divisors `i` of `(k - 2)`.  
  - For each divisor `i`, check if both `i` and `(k - 2)/i` exist in the array.  
  - If they do, print the pair and stop.  
- This works because the problem guarantees that such a pair exists.  

## Time and Space Complexity  
- **Time Complexity:** `O(k + √k)` per test case.  
  - `O(k)` for building the frequency map.  
  - `O(√k)` for checking divisors of `(k - 2)`.  
- **Space Complexity:** `O(k)`, for storing frequencies in the map.  
