# Problem Number - 2130A Submission is All You Need  
**Problem Link:** [https://codeforces.com/problemset/problem/2130/A](https://codeforces.com/problemset/problem/2130/A)  

---

## Topics  
- Implementation  
- Arrays  
- Counting  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 50 (number of elements per test case)  
- 0 ≤ `aᵢ` ≤ 50 (array values)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- For each test case, we are given an array of integers.  
- We need to compute the sum of all elements, but with a twist:  
  - Every zero (`0`) in the array contributes `1` instead of `0`.  
- This can be achieved by:  
  1. Counting the number of zeros in the array.  
  2. Calculating the sum of all elements.  
  3. Adding the zero count to the sum.  
- Final result = `sum + zero_count`.  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case:  
   - Read integer `n`.  
   - Initialize `sum = 0` and `zero = 0`.  
   - For each element `a[i]`:  
     - If `a[i] == 0`, increment `zero`.  
     - Add `a[i]` to `sum`.  
   - Print `sum + zero`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we iterate through all elements.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  
