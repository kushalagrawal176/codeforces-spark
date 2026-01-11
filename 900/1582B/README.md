# Problem Number - 1582B Luntik and Subsequences  

**Problem Link:** [https://codeforces.com/problemset/problem/1582/B](https://codeforces.com/problemset/problem/1582/B)  

---

## Topics  
- Combinatorics  
- Implementation  
- Math  

---

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 60 (array size)  
- 0 ≤ `a[i]` ≤ 10^9 (Elements of array)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- We are asked to count the number of subsequences whose sum equals the `total sum-1`.  
- Observations:  
  - If a subsequence contains only `1`s, its sum equals its length.  
  - If we add `0`s to such subsequences, the sum remains unchanged, but the count of elements increases.  
  - `2`s cannot be part of valid subsequences because they increase the sum more than the count of ones.  
- Therefore, the answer depends only on the count of `1`s and `0`s.  
- For each subsequence:  
  - Choose any subset of `1`s (there are `one` choices).  
  - Each subsequence can be extended with any combination of `0`s (there are `2^zero` choices).  
- Final formula:  `Answer = one * 2^zero`

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case (counting zeros and ones).  
- **Space Complexity:** `O(1)`, only counters are used.  
