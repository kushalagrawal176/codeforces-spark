# Problem Number - 110A Nearly Lucky Number  
**Problem Link:** [https://codeforces.com/problemset/problem/110/A](https://codeforces.com/problemset/problem/110/A)  

---

## Topics
- Implementation
- Math

## Constraints
- Input number `n` can be up to 10^18 (fits in 64-bit integer)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- A number is called **lucky** if it consists only of digits `4` and `7`.  
- A number is called **nearly lucky** if the count of lucky digits (`4` or `7`) in it is itself a lucky number.  
- To solve:
  1. Read the number `n`.  
  2. Count how many digits are `4` or `7`.  
  3. If the count equals `4` or `7`, print `"YES"`. Otherwise, print `"NO"`.  
- This can be done either by:
  - Iterating through digits using modulo/division.  
  - Or treating the number as a string and checking each character.  

## Time and Space Complexity
- **Time Complexity:** `O(d)`, where `d` is the number of digits in `n`.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  
