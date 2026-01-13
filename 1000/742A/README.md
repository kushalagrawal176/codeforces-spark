# Problem Number - 742A Arpa’s hard exam and Mehrdad’s naive cheat  
**Problem Link:** [https://codeforces.com/problemset/problem/742/A](https://codeforces.com/problemset/problem/742/A)  

---

## Topics  
- Modular Arithmetic  
- Math  
- Implementation  

## Constraints  
- 0 ≤ `n` ≤ 10⁹ (exponent)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks for the last digit of \(1378^n\).  
- Observing the pattern of last digits:  
  - \(1378^1 = 8\) → last digit 8  
  - \(1378^2 = 64\) → last digit 4  
  - \(1378^3 = 512\) → last digit 2  
  - \(1378^4 = 4096\) → last digit 6  
- The cycle of last digits repeats every 4 powers: **8, 4, 2, 6**.  
- Therefore:  
  - If \(n = 0\), the result is 1 (since any number to the power 0 is 1).  
  - Otherwise, compute \(n \mod 4\) and map it to the cycle.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since only modular arithmetic is used.  
- **Space Complexity:** `O(1)`, no extra memory required.  
