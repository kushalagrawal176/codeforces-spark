# Problem Number - 25A IQ Test  

**Problem Link:** [https://codeforces.com/problemset/problem/25/A](https://codeforces.com/problemset/problem/25/A)  

---

## Topics  
- Implementation  
- Arrays  
- Parity (Even/Odd)  

## Constraints  
- 3 ≤ `n` ≤ 100  
- 1 ≤ `a[i]` ≤ 100  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem gives a sequence of integers where all but one share the same parity (either all even or all odd).  
- The task is to find the position (1-based index) of the unique number that differs in parity.  
- Approach:  
  - Traverse the array while counting how many even and odd numbers appear.  
  - Track the last index of an even number (`e`) and the last index of an odd number (`o`).  
  - At the end:  
    - If there is only one even number → print its index.  
    - Otherwise → print the index of the single odd number.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we scan the array once.  
- **Space Complexity:** `O(1)`, only a few variables are used to track counts and indices.  
