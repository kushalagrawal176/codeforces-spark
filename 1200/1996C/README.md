# Problem Number - 1996C Sort  
**Problem Link:** [https://codeforces.com/problemset/problem/1996/C](https://codeforces.com/problemset/problem/1996/C)  

---

## Topics  
- Strings  
- Sorting  
- Prefix/Suffix Frequency Analysis  
- Implementation  

---

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n`, `q` ≤ 2 × 10⁵ (string length and number of queries)  
- 1 ≤ `l` ≤ `r` ≤ `n` (query range)  
- Sum of n and q across all test cases ≤ 2 × 10⁵  
- Time limit per test: 5 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- You are given two strings `a` and `b` of equal length `n`. For each query `(l, r)`, you want the minimum number of operations to make `sorted(a[l..r]) = sorted(b[l..r])`.  
- **Key observation:** Sorting a substring only depends on the *frequency of characters*, not their positions.  
- Therefore, the problem reduces to comparing the frequency counts of characters in `a[l..r]` and `b[l..r]`.  
- The minimum number of operations required is the sum of positive differences in character counts between the two substrings.  
  - Example: If `a[l..r]` has 3 `'a'`s and `b[l..r]` has 1 `'a'`, then 2 operations are needed to reduce `'a'` count in `a`.  
- To answer queries efficiently:  
  - Precompute **prefix frequency arrays** for both strings.  
  - For each query `(l, r)`, compute character counts in O(26) = O(1).  
  - Compare counts and sum differences.  

---

## Time and Space Complexity  
- **Preprocessing:** `O(n × 26)` for prefix frequency arrays.  
- **Query Answering:** `O(26)` per query (constant time).  
- **Total Time Complexity:** `O(n + q × 26) ≈ O(n + q)`.  
- **Space Complexity:** `O(n × 26)`, for storing prefix counts of both strings.  
