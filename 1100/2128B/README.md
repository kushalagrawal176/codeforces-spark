# Problem Number - 2128B Deque Process  

**Problem Link:** [https://codeforces.com/problemset/problem/2128/B](https://codeforces.com/problemset/problem/2128/B)  

---

## Topics  
- Greedy  
- String Construction  
- Implementation  
- Sorting

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 5 ≤ `n` ≤ 10⁵ (length of deque per test case)  
- 1 ≤ `a[i]` ≤ `n` (values in deque)  
- Total sum of `n` across all test cases ≤ 2 × 10⁵  
- Time limit per test: 1.5 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- We are given a deque represented by an array. The task is to construct a string of operations (`L` and `R`) based on comparing elements from both ends.  
- At each step:  
  - Compare the leftmost (`a[l]`) and rightmost (`a[r]`) elements.  
  - Depending on the parity of the step (`p % 2`), append either `"LR"` or `"RL"`.  
  - This ensures alternating behavior in the sequence construction.  
- Continue until the deque is exhausted.  
- If the deque has an odd length, append a single `'L'` at the end to handle the middle element.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since each element is processed once.  
- **Space Complexity:** `O(n)` for storing the deque and the resulting string.  