# Problem Number - 1703C Cypher  
**Problem Link:** [https://codeforces.com/problemset/problem/1703/C](https://codeforces.com/problemset/problem/1703/C)  

---

## Topics  
- Strings  
- Implementation  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n` ≤ 100  
- Each digit of the cypher is between 0 and 9  
- Each operation string length ≤ 10  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem describes a cypher with `n` digits, each initially given.  
- For each digit, we are provided with a sequence of operations:  
  - `'U'` means decrease the digit by 1 (moving up).  
  - `'D'` means increase the digit by 1 (moving down).  
- Digits wrap around modulo 10, so after 9 comes 0, and before 0 comes 9.  
- To solve:  
  - Read the initial digits.  
  - For each digit, read the operation string and calculate the net effect (`+1` for `'D'`, `-1` for `'U'`).  
  - Apply the net effect to the digit using modulo 10 arithmetic to ensure wrapping.  
- Finally, print the resulting digits after all operations.  

## Time and Space Complexity  
- **Time Complexity:** `O(n × m)`, where `m` is the length of the operation string for each digit. Since both are small (≤ 100), this is efficient.  
- **Space Complexity:** `O(n)`, for storing the digits.  