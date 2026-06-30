# Problem Number - 1438B Valerii Against Everyone  
**Problem Link:** [https://codeforces.com/problemset/problem/1438/B](https://codeforces.com/problemset/problem/1438/B)  

---

## Topics
- Implementation  
- Data Structures
- Hashing 

---

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 2 ≤ `n` ≤ 1000 (size of array per test case)  
- 0 ≤ `b[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks whether there exists **two subarrays** such that their sums are equal in the given array.
- Elements are given by 2^b[i].  
- If any duplicate exists, the answer is `"YES"`. Otherwise, `"NO"`.  
- This is because if two elements are equal, then we can make them 2 subarrays and their sum are always equal.  
- To solve:
  - Use a set or hashmap to track seen elements.  
  - If an element is already present, immediately mark the flag as true.  
  - Print `"YES"` if duplicates exist, otherwise `"NO"`.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we check each element once.  
- **Space Complexity:** `O(n)`, for storing elements in a set.  
