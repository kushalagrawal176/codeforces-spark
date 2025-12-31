# Problem Number - 1743A Password  

**Problem Link:** [https://codeforces.com/problemset/problem/1743/A](https://codeforces.com/problemset/problem/1743/A)  

---

## Topics  
- Combinatorics  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 200 (number of test cases)  
- 1 ≤ `n` ≤ 8 (number of digits already chosen)  
- Digits are distinct and between 0–9  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given `n` digits that are already chosen and cannot be used again.  
- The total digits available are from 0 to 9, so the remaining usable digits are `10 - n`.  
- We need to count the number of possible passwords of length 4 that can be formed using these remaining digits.  
- The formula for the number of ways is:  
$\text{Ways} = \binom{cnt}{4} \cdot 4!$
  
  where `cnt = 10 - n`.  
- Simplifying, this becomes:  
$\text{Ways} = \dfrac{6 \cdot cnt \cdot (cnt - 1)}{2}$
  
- This formula directly gives the number of valid passwords.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since the formula is computed directly.  
- **Space Complexity:** `O(1)`, only constant space is used.  
