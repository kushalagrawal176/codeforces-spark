# Problem Number - 431A Black Square  
**Problem Link:** [https://codeforces.com/problemset/problem/431/A](https://codeforces.com/problemset/problem/431/A)  

---

## Topics  
- Implementation  
- Strings  
- Simulation  

---

## Constraints  
- Input: four integers `a, b, c, d` (calories for digits 1, 2, 3, 4)  
- 0 ≤ `a`, `b`, `c`, `d` ≤ 10000  
- String `s` length ≤ 10⁵ (sequence of digits '1' to '4')  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The problem describes Jury’s exercise routine represented by a string of digits.  
- Each digit corresponds to a strip number (1–4), and each strip has a calorie value.  
- We need to calculate the **total calories burned** by summing the calorie values for each digit in the string.  

**Steps to solve:**  
1. Read the calorie values for strips 1, 2, 3, and 4.  
2. Read the string `s` representing Jury’s moves.  
3. Initialize a sum variable.  
4. For each character in the string:  
   - If it is `'1'`, add `a` to sum.  
   - If it is `'2'`, add `b` to sum.  
   - If it is `'3'`, add `c` to sum.  
   - If it is `'4'`, add `d` to sum.  
5. Print the total sum.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where `n` is the length of the string (each character processed once).  
- **Space Complexity:** `O(1)`, only a constant amount of extra space is used.  
