# Problem Number - 363B Fence  
**Problem Link:** [https://codeforces.com/problemset/problem/363/B](https://codeforces.com/problemset/problem/363/B)  

---

## Topics  
- Sliding Window  
- Prefix Sum  
- Arrays  
- Implementation  

---

## Constraints  
- 1 ≤ `k` ≤ `n` ≤ 150000  
- 1 ≤ `a[i]` ≤ 100 (height of each fence plank)  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- You are given `n` fence planks with heights `a[i]`.  
- You need to find the starting position of the segment of length `k` with the minimum total height.  
- **Naive approach:** Compute sum of every segment of length `k` → O(n·k), too slow.  
- **Optimized approach (Sliding Window):**  
  1. Compute the sum of the first `k` planks.  
  2. Slide the window across the array:  
     - Add the next plank height.  
     - Subtract the plank that goes out of the window.  
  3. Track the minimum sum and its starting index.  
- This reduces the complexity to O(n).  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, scanning through the array once with sliding window.  
- **Space Complexity:** `O(1)`, only variables for sum, minimum, and index are used.  
