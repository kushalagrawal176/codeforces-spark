# Problem Number - 227B Effective Approach  
**Problem Link:** [https://codeforces.com/problemset/problem/227/B](https://codeforces.com/problemset/problem/227/B)  

---

## Topics  
- Implementation  
- Arrays  
- Simulation  

## Constraints  
- 1 ≤ `n` ≤ 100000  
- 1 ≤ `m` ≤ 100000  
- Elements are distinct integers between 1 and n  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem gives a permutation of integers from 1 to `n`.  
- For each query element, we need to calculate two values:  
  - **Vasya’s approach:** The position of the element when searching from the beginning.  
  - **Petya’s approach:** The position of the element when searching from the end.  
- To solve efficiently:  
  - Precompute the position of each element in the permutation using an array `pos[]` where `pos[value] = index`.  
  - For each query element `x`:  
    - Vasya’s count increases by `pos[x]`.  
    - Petya’s count increases by `(n - pos[x] + 1)`.  
- This avoids scanning the array for each query, reducing time complexity significantly.  

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(n)` to build the position array.  
  - `O(m)` to process all queries.  
  - Overall: `O(n + m)`.  
- **Space Complexity:**  
  - `O(n)` for storing positions.  