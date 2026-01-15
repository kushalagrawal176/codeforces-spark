# Problem Number - 1859B Olya and Game with Arrays  

**Problem Link:** [https://codeforces.com/problemset/problem/1859/B](https://codeforces.com/problemset/problem/1859/B)  

---

## Topics  
- Implementation  
- Greedy  
- Sorting  

## Constraints  
- 1 ≤ `t` ≤ 25000 (number of test cases)  
- 2 ≤ `n` ≤ 25000 (number of arrays)  
- 2 ≤ `length of each array` ≤ 50000  
- 1 ≤ `element values` ≤ 10⁹    
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- Each test case consists of `n` arrays.  
- For each array, sort it to easily identify the smallest and second smallest elements.  
- The strategy is:  
  - Add the second smallest element of each array to the total sum.  
  - Track the global minimum of all smallest elements (`amin`).  
  - Track the global minimum of all second smallest elements (`bmin`).  
- The answer is computed as:  
  - `ans = (sum of all second smallest elements) - bmin + amin`  
- This adjustment ensures that instead of always picking the second smallest, we optimize by replacing the smallest second element with the globally smallest first element, minimizing the total sum.  

## Time and Space Complexity  
- **Time Complexity:** `O(m log m)` per test case, where `m` is the total number of elements across all arrays (due to sorting each array).  
- **Space Complexity:** `O(m)`, for storing all arrays.  
