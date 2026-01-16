# Problem Number - 1266A Competitive Programmer  
**Problem Link:** [https://codeforces.com/problemset/problem/1266/A](https://codeforces.com/problemset/problem/1266/A)  

---

## Topics  
- Strings  
- Number Theory  
- Implementation  
- Divisibility Rules  

---

## Constraints  
- 1 ≤ `n` ≤ 418 (number of test cases)  
- 1 ≤ `|s|` ≤ 1000 (length of the number string)  
- Digits are between 0–9  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- You are given a number as a string and need to determine if it can be considered "red" or "cyan" based on divisibility rules.  
- **Conditions for "red":**  
  1. The number must contain at least one `0`.  
  2. The number must contain at least two even digits (including the zero).  
  3. The sum of digits must be divisible by 3.  
- If all conditions are satisfied → output `"red"`.  
- Otherwise → output `"cyan"`.  

**Reasoning:**  
- Divisibility by 3 depends on the sum of digits.  
- Presence of `0` ensures divisibility by 10 when combined with another even digit.  
- At least two even digits are required to make the number divisible by 20.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)`, scanning through the digits once.  
- **Space Complexity:** `O(1)`, only counters for zero, even digits, and sum are used.  
