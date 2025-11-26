# Problem Number - 1363A Odd Selection  
**Problem Link:** [https://codeforces.com/problemset/problem/1363/A](https://codeforces.com/problemset/problem/1363/A)  

---

## Topics  
- Implementation  
- Brute Force  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 1000 (number of integers in the array)  
- 1 ≤ x ≤ n (number of integers to select)  
- 1 ≤ `a[i]` ≤ 1000 (array elements)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- We need to check if it is possible to select exactly `x` integers such that their sum is odd.  
- The sum of integers is odd **iff** the count of odd numbers in the selection is odd.  
- Key cases:  
  - If there are no odd numbers → **NO**.  
  - If all numbers are odd and `x` is even → **NO**.  
  - If all numbers are odd and `x` is odd → **YES**.  
  - If all numbers are even → **NO**.  
  - Otherwise, as long as at least one odd exists and selection size allows mixing odds and evens properly → **YES**.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we count odd numbers.  
- **Space Complexity:** `O(1)`, only counters for odd/even numbers are needed.  
