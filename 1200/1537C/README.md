# Problem Number - 1537C Challenging Cliffs  
**Problem Link:** [https://codeforces.com/problemset/problem/1537/C](https://codeforces.com/problemset/problem/1537/C)  

---

## Topics  
- Greedy  
- Sorting  
- Implementation  
- Math

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (array size per test case)  
- 1 ≤ `h[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The task is to rearrange the array such that the **number of mountains where `h[i]` ≤ `h[i+1]` is maximized and `|h[1]` - `h[n]|` is minimized**.  
- Key observation:  
  - After sorting the array, the smallest difference will always be between two consecutive elements.  
  - To minimize the maximum difference, we should start the sequence with this closest pair.  
- Steps:  
  1. Sort the array.  
  2. Find the pair of consecutive elements with the smallest difference.  
  3. Print the sequence starting with the first element of this pair, then all elements after it, followed by all elements before it, and finally the second element of the pair.  
- This ensures that the largest gap between consecutive elements is minimized.  

## Time and Space Complexity  
- **Time Complexity:**  
  - Sorting the array: `O(n log n)`  
  - Finding the minimum difference: `O(n)`  
  - Printing the sequence: `O(n)`  
  - Overall per test case: **`O(n log n)`**  
- **Space Complexity:**  
  - `O(n)` for storing the array.  
