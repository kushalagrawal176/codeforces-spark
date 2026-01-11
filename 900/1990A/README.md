# Problem Number - 1990A Submission Bait  
**Problem Link:** [https://codeforces.com/problemset/problem/1990/A](https://codeforces.com/problemset/problem/1990/A)  

---

## Topics
- Implementation  
- Frequency Counting  
- Greedy  
- Games

## Constraints
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `n` ≤ 50  
- Elements are integers in the range `[1, n]`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given `n` integers (each between 1 and 50).  
- The task is to determine whether there exists at least one integer with **odd frequency**.  
- Key observation:  
  - If all numbers appear an even number of times, then no "bait" exists.  
  - If any number appears an odd number of times, the answer is `"YES"`.  
- Implementation steps:  
  1. Initialize a frequency array of size 51 (to cover numbers 1–50).  
  2. Count occurrences of each number.  
  3. Traverse from the largest number downwards until finding one with odd frequency.  
  4. If found, print `"YES"`, otherwise `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for counting frequencies.  
- **Space Complexity:** `O(1)`, fixed-size array of length 51.  