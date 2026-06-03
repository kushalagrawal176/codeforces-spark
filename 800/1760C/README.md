# Problem Number - 1760C Advantage  
**Problem Link:** [https://codeforces.com/problemset/problem/1760/C](https://codeforces.com/problemset/problem/1760/C)  

---

## Topics
- Greedy  
- Implementation
- Arrays

---

## Constraints
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to compute the "advantage" of each element in the array compared to the maximum element.  
- For each test case:
  - Identify the **largest element** (`max1`) and the **second largest element** (`max2`).  
  - For each element:
    - If it is the maximum (`max1`), its advantage is `a[i] - max2`.  
    - Otherwise, its advantage is `a[i] - max1`.  
- This works because:
  - The maximum element should be compared against the second maximum (since comparing with itself yields no advantage).  
  - All other elements are compared against the maximum element.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once to find `max1` and `max2`, and once more to compute results.  
- **Space Complexity:** `O(n)` for storing the array.  