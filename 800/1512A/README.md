# Problem Number - 1512A Spy Detected!  
**Problem Link:** [https://codeforces.com/problemset/problem/1512/A](https://codeforces.com/problemset/problem/1512/A)  

---

## Topics  
- Implementation  
- Arrays  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 3 ≤ `n` ≤ 100 (number of integers in the array)  
- 1 ≤ `a[i]` ≤ 100 (array elements)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks to find the position of the "spy" element in the array.  
- In the given array, all elements are equal except one distinct element.  
- Approach:  
  - Read the array.  
  - Track the first element and count how many times it appears.  
  - If the first element appears more than once, then the spy is the element that differs from it.  
  - Otherwise, the spy is the first element itself.  
- Output the **1-based index** of the spy element.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(1)`, only a few variables are used for tracking.  
