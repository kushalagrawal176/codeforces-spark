# Problem Number - 939A Love Triangle  

**Problem Link:** [https://codeforces.com/problemset/problem/939/A](https://codeforces.com/problemset/problem/939/A)  

---

## Topics  
- Graphs  
- Implementation  
- Simulation  

## Constraints  
- 2 ≤ `n` ≤ 5000 (number of people)  
- Each person points to exactly one other person (array values between 1 and n)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- Each person `i` points to another person `a[i]`.  
- We need to check if there exists a **love triangle**, i.e., three distinct people `i`, `j`, `k` such that:  
  - `a[i] = j`,  
  - `a[j] = k`,  
  - `a[k] = i`.  
- This can be checked directly by iterating over all people:  
  - For each `i`, compute `a[a[a[i]]]`.  
  - If this equals `i`, then a triangle exists.  
- If such a triangle is found, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we check each person once with constant-time operations.  
- **Space Complexity:** `O(n)`, for storing the array of pointers.  
