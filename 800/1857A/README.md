# Problem Number - 1857A Array Coloring  
**Problem Link:** [https://codeforces.com/problemset/problem/1857/A](https://codeforces.com/problemset/problem/1857/A)  

---

## Topics  
- Implementation  
- Math  
- Parity Check  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 2 ≤ `n` ≤ 50 (size of array)  
- 1 ≤ `a[i]` ≤ 50 (array elements)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks whether it is possible to color the array such that the sum of elements in both groups is even or odd.  
- Key observation:  
  - The sum of all elements must be even for this to be possible.  
  - Since even numbers do not affect parity, only the count of odd numbers matters.  
  - If the total number of odd elements is even, then the sum of all elements is even, and the answer is `"YES"`.  
  - Otherwise, the sum is odd, and the answer is `"NO"`.  

### Steps:  
1. Read the number of test cases `t`.  
2. For each test case, read the array size `n` and its elements.  
3. Count the number of odd elements.  
4. If the count of odd elements is even, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we iterate through the array.  
- **Space Complexity:** `O(1)`, only constant space used for counting.  
