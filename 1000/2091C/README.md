# Problem Number - 2091C Combination Lock  
**Problem Link:** [https://codeforces.com/problemset/problem/2091/C](https://codeforces.com/problemset/problem/2091/C)  

---

## Topics  
- Implementation  
- Math  
- Simulation  

---

## Constraints  
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 1 ≤ `n` ≤ 2 ⋅ 10⁵ (lock size)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The problem asks you to construct a sequence for the lock based on the given integer `n`.  
- **Key observation:**  
  - If `n` is even, it is impossible to construct the required sequence → output `-1`.  
  - If `n` is odd, simply print the numbers from `n` down to `1`.  
- This works because the lock requires a descending sequence only when `n` is odd.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for printing the sequence.  
- **Space Complexity:** `O(1)`, only constant space used.  
