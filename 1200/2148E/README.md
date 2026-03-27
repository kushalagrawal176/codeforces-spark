# Problem Number - 2148E Split  
**Problem Link:** [https://codeforces.com/problemset/problem/2148/E](https://codeforces.com/problemset/problem/2148/E)  

---

## Topics
- Two Pointers  
- Sliding Window  
- Frequency Counting  
- Data Structures  

---

## Constraints
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `k` ≤ `n` ≤ 2 × 10^5  
- 1 ≤ `a[i]` ≤ `n`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- Farmer John wants to check if a subarray `[l, r]` can be split into **k identical multisets**.  
- For this to be possible, the **frequency of each element in the entire array must be divisible by k**. If not, the answer is immediately `0`.  
- After confirming divisibility, we reduce each frequency by dividing it by `k`. This gives the **target frequency** of each element per subarray.  
- The problem then reduces to counting the number of valid subarrays `[l, r]` such that the frequency of each element inside `[l, r]` does not exceed its target frequency.  
- This can be solved using a **two-pointer sliding window**:
  - Expand the right pointer `j` and include elements.  
  - If the frequency of an element exceeds its allowed quota, move the left pointer `i` forward until the condition is satisfied.  
  - At each step, the number of valid subarrays ending at `j` is `(j - i + 1)`.  
- Summing this over all `j` gives the final answer.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since each element is processed at most twice (once by `j`, once by `i`).  
- **Space Complexity:** `O(n)`, for storing frequency counts of elements.  