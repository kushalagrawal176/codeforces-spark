# Problem Number - 122A Lucky Division  
**Problem Link:** [https://codeforces.com/problemset/problem/122/A](https://codeforces.com/problemset/problem/122/A)  

---

## Topics  
- Implementation  
- Math  
- Divisibility  

## Constraints  
- 1 ≤ `n` ≤ 1000  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- A number is considered **lucky** if it consists only of digits `4` and `7`.  
- The problem asks whether the given number `n` is divisible by any lucky number.  
- Approach:  
  1. Identify the relevant lucky numbers within the constraint range (e.g., 4, 7, 47, 74, 447, 474, 477, etc.).  
  2. Check if `n` is divisible by any of these lucky numbers.  
  3. If divisible, print `"YES"`. Otherwise, print `"NO"`.  
- In the simplified solution, only a few lucky numbers (4, 7, 47, 477) are checked directly, which is sufficient for the problem constraints.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since only a fixed set of divisibility checks are performed.  
- **Space Complexity:** `O(1)`, no extra space required.  
