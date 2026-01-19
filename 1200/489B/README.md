# Problem Number - 489B BerSU Ball  
**Problem Link:** [https://codeforces.com/problemset/problem/489/B](https://codeforces.com/problemset/problem/489/B)  

---

## Topics
- Implementation  
- Greedy  
- Sorting  
- Two Pointers  

## Constraints
- 1 ≤ `n`, `m` ≤ 100 (number of boys and girls)  
- 1 ≤ `skill leve`l ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We need to maximize the number of pairs formed between boys and girls such that the absolute difference in their skill levels is at most 1.  
- Approach:  
  - Sort both arrays of skill levels (boys and girls).  
  - Use two pointers to traverse both arrays simultaneously.  
  - If the current boy and girl can form a pair (`|boy - girl| ≤ 1`), increment the count and move both pointers forward.  
  - If the boy’s skill is greater, move the girl pointer forward; otherwise, move the boy pointer forward.  
- This greedy approach ensures we always form valid pairs whenever possible while maintaining maximum count.  

## Time and Space Complexity
- **Time Complexity:** `O(m log m + n log n)`, due to sorting both arrays.  
- **Space Complexity:** `O(1)`, aside from input storage.  
