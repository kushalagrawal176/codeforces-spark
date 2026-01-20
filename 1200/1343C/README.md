# Problem Number - 1343C Alternating Subsequence  
**Problem Link:** [https://codeforces.com/problemset/problem/1343/C](https://codeforces.com/problemset/problem/1343/C)  

---

## Topics
- Greedy  
- Implementation  
- Arrays  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (length of sequence)  
- -10⁹ ≤ `a[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We need to maximize the sum of an alternating subsequence (positive, negative, positive, … or negative, positive, negative, …).  
- Key observation:  
  - Within each contiguous block of numbers with the same sign, only the **maximum element** contributes to the optimal subsequence.  
  - This is because choosing smaller elements of the same sign would reduce the total sum without changing the alternating pattern.  
- Approach:  
  1. Traverse the array while grouping consecutive elements of the same sign.  
  2. Track the maximum element in each group.  
  3. When the sign changes, add the maximum of the previous group to the answer.  
  4. At the end, add the last group’s maximum.  
- This greedy strategy ensures the subsequence alternates correctly and yields the maximum possible sum.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (single pass through the array).  
- **Space Complexity:** `O(1)`, only a few variables are needed to track current maximum and total sum.  
