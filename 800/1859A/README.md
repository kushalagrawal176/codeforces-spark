# Problem Number - 1859A United We Stand  
**Problem Link:** [https://codeforces.com/problemset/problem/1859/A](https://codeforces.com/problemset/problem/1859/A)  

---

## Topics  
- Arrays  
- Implementation  
- Math  
- Number Theory  

## Constraints  
- 1 ≤ `t` ≤ 500  
- 2 ≤ `n` ≤ 100  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem provides an array `a` of size `n`.  
- We need to split the array into two non-empty subsequences `b` and `c` such that:  
  - All elements in `b` are equal to the minimum element of the array.  
  - All elements in `c` are strictly greater than the minimum element.  
- If all elements are equal (i.e., the entire array consists of the minimum value), then it is impossible to split into valid subsequences, and the answer is `-1`.  
- Otherwise:  
  1. Find the minimum element in the array.  
  2. Count how many times it appears.  
  3. Place all occurrences of the minimum element into subsequence `b`.  
  4. Place all other elements into subsequence `c`.  
- Finally, output the sizes of `b` and `c`, followed by their elements.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the array to find the minimum and split it.  
- **Space Complexity:** `O(n)`, for storing subsequences `b` and `c`.  
