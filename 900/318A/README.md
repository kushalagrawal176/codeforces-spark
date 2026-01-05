# Problem Number - 318A Even Odds  
**Problem Link:** [https://codeforces.com/problemset/problem/318/A](https://codeforces.com/problemset/problem/318/A)  

---

## Topics  
- Math  
- Implementation  

## Constraints  
- 1 ≤ `k` ≤ `n` ≤ 10¹²  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks for the **k-th number** in a sequence formed by writing all odd numbers from 1 to `n` first, followed by all even numbers from 1 to `n`.  
- Key observations:  
  - The number of odd elements in the sequence is `(n + 1) / 2`.  
  - If `k` is less than or equal to `(n + 1) / 2`, the k-th number lies in the odd part of the sequence.  
    - In this case, the k-th number is `2 * k - 1`.  
  - Otherwise, the k-th number lies in the even part of the sequence.  
    - In this case, the k-th number is `2 * (k - (n + 1) / 2)`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since the answer is computed directly using formulas.  
- **Space Complexity:** `O(1)`, only constant space is used.  
