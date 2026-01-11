# Problem Number - 2065C1 Skibidus and Fanum Tax (easy version)  

**Problem Link:** [https://codeforces.com/problemset/problem/2065/C1](https://codeforces.com/problemset/problem/2065/C1)  

---

## Topics  
- Implementation  
- Greedy  
- Arrays  
- Binary Search

---

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (array size)  
- 1 ≤ `m` ≤ 1 (unused in easy version but part of input format)  
- 1 ≤ `a[i]` ≤ 10⁹  
- 1 ≤ `b` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- We need to determine if the array can be transformed into a **non-decreasing sequence**.  
- For each element `a[i]`, we can choose either `a[i]` or `b - a[i]`.  
- Greedy strategy:  
  - Start by picking the smaller value (`min(a[i], b - a[i])`).  
  - If this choice breaks the non-decreasing property (i.e., `a[i] < a[i-1]`), switch to the other option (`b - a[i]`).  
- After processing all elements, check if the sequence is non-decreasing.  
- If yes → print `"YES"`, otherwise → print `"NO"`.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case (single pass through the array).  
- **Space Complexity:** `O(n)` for storing the array.  
