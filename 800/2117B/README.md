# Problem Number - 2117B Shrink  

**Problem Link:** [https://codeforces.com/problemset/problem/2117/B](https://codeforces.com/problemset/problem/2117/B)  

---

## Topics  
- Implementation  
- Arrays  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 3 ≤ `n` ≤ 2 × 10^5 (array size)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to construct an array of length `n` following a specific shrinking pattern.  
- We fill the array symmetrically from both ends:  
  - For each index `i` in the first half, assign `ans[i] = c` and `ans[n - i - 1] = c + 1`.  
  - Increment `c` twice after each pair assignment.  
- If `n` is odd, the middle element is set to `n`.  
- This ensures the array follows the required shrinking sequence.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we iterate through half of the array and print all elements.  
- **Space Complexity:** `O(n)`, for storing the constructed array.  
