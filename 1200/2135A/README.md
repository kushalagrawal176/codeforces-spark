# Problem Number - 2135A Against the Difference  

**Problem Link:** [https://codeforces.com/problemset/problem/2135/A](https://codeforces.com/problemset/problem/2135/A)  

---

## Topics
- Dynamic Programming  
- Data Structures (Hash Map / Frequency Tracking)  
- Implementation  

---

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (array length per test case)  
- 1 ≤ `a[i]` ≤ `n`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem defines a **block** as an array where all elements equal the length of the array.  
  - Examples: `[3, 3, 3]`, `[1]`, `[4, 4, 4, 4]`.  
  - Non-examples: `[1, 1, 1]`, `[2, 3, 3]`.  
- A **neat array** is formed by concatenating any number of blocks.  
- The task: find the **longest neat subsequence** of the given array.

### Key Observations:
- To form a block of size `v`, we need exactly `v` occurrences of the number `v`.  
- The subsequence must be chosen carefully so that each block is valid and contributes to the total length.  
- This naturally suggests a **dynamic programming (DP)** approach:
  - Let `dp[i]` = maximum length of neat subsequence considering the first `i` elements.  
  - Maintain a map from value `v` → list of positions where `v` occurs.  
  - If at least `v` occurrences of `v` exist up to position `i`, we can form a block of length `v`.  
  - Transition:  **dp[i] = max(dp[i-1], dp[pos-1] + v)**  
    where `pos` is the starting index of the block formed by the last `v` occurrences of `v`.

---

## Time and Space Complexity
- **Time Complexity:**  
  - Each element is processed once, and each occurrence is stored in a map.  
  - Overall complexity: **O(n)** per test case.  
- **Space Complexity:**  
  - `O(n)` for DP array and occurrence tracking.  