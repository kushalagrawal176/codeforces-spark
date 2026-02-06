# Problem Number - 2193B Reverse a Permutation  
**Problem Link:** [https://codeforces.com/problemset/problem/2193/B](https://codeforces.com/problemset/problem/2193/B)  

---

## Topics
- Arrays  
- Implementation  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- Sum of `n` across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given a permutation of size `n`. The task is to reverse exactly one contiguous subsegment of the permutation to make it lexicographically largest.  
- Start with `ptr = n` and traverse the array from the beginning.  
  - Print elements while they match the decreasing sequence from `n`.  
- Once mismatch occurs, identify the segment `[l, i]` where the element equals `ptr`.  
- Reverse this segment and print it.  
- Finally, print the remaining elements in order.  
- This greedy approach ensures the lexicographically largest permutation is achieved by reversing the smallest possible segment containing `n`.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` per test case for scanning and printing.  
- **Space Complexity:**  
  - `O(n)` for storing the permutation.  
  - No extra space beyond input storage.  
