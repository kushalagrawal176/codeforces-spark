# Problem Number - 1790A Polycarp and the Day of Pi  
**Problem Link:** [https://codeforces.com/problemset/problem/1790/A](https://codeforces.com/problemset/problem/1790/A)  

---

## Topics  
- Strings  
- Math
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `|s|` ≤ 30  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The task is to find how many initial digits of the given string `s` match the digits of π (pi).  
- We are provided with multiple test cases. For each string `s`, compare it with the first 30 digits of π: `"314159265358979323846264338327"`.  
- Start from the first character and compare each digit of `s` with the corresponding digit of π.  
- Stop at the first mismatch and count how many digits matched before the mismatch.  
- This count is the answer for that test case.  

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)` per test case, since we compare each character of `s` with `π` until a mismatch.  
- **Space Complexity:** `O(1)`, as we only store the π string and a counter.  