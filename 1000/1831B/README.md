# Problem Number - 1831B Array Merging

**Problem Link:** [https://codeforces.com/problemset/problem/1831/B](https://codeforces.com/problemset/problem/1831/B)

---

## Topics
- Greedy
- Frequency

---

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]`, `b[i]` ≤ 2 × `n`  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks for the maximum length of a subsequence that can be formed by merging two arrays `a` and `b`.  
- The key observation is that the subsequence length depends on the **maximum consecutive occurrences** of each number in both arrays.  
- For each distinct value:
  - Count the longest consecutive streak in array `a`.
  - Count the longest consecutive streak in array `b`.
- The best merged subsequence length for that value is the sum of these two streaks.  
- The answer is the maximum of these sums across all values.  

### Steps:
1. Traverse array `a` and compute the maximum consecutive streak for each value.  
2. Traverse array `b` and compute the maximum consecutive streak for each value.  
3. For each value, take the sum of streaks from `a` and `b`.  
4. The maximum of these sums is the final answer.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse both arrays once.  
- **Space Complexity:** `O(n)`, for storing streaks of values in frequency arrays or maps.  