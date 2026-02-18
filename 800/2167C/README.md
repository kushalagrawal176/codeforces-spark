# Problem Number - 2167C Isamatdin and His Magic Wand!  

**Problem Link:** [https://codeforces.com/problemset/problem/2167/C](https://codeforces.com/problemset/problem/2167/C)  

---

## Topics
- Implementation  
- Sorting  
- Arrays  

---

## Constraints
- 1 ≤ `t` ≤ 10⁴
- 1 ≤ `n` ≤ 2 ⋅ 10⁵  
- 1 ≤ `aᵢ` ≤ 10⁹
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem requires printing the array after applying Isamatdin’s magic wand.  
- The wand works as follows:
  - If the array contains **both even and odd numbers**, then the array is sorted in non-decreasing order.  
  - Otherwise (all even or all odd), the array remains unchanged.  

### Steps:
1. Read the array.  
2. Count the number of even and odd elements.  
3. If both counts are greater than zero, sort the array.  
4. Print the final array.  

This ensures the correct transformation according to the wand’s rules.  

---

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n log n)` in the worst case (when sorting is required).  
  - `O(n)` if no sorting is needed.  
- **Space Complexity:** `O(n)` for storing the array.  