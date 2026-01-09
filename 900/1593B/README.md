# Problem Number - 1593B Make it Divisible by 25  
**Problem Link:** [https://codeforces.com/problemset/problem/1593/B](https://codeforces.com/problemset/problem/1593/B)  

---

## Topics  
- Implementation  
- Strings  
- Math  
- Brute Force  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 25 ≤ `n` ≤ 10¹⁸  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- A number is divisible by 25 if its last two digits are one of: **00, 25, 50, 75**.  
- The task is to determine the minimum number of deletions required to rearrange digits (by removing some) so that the remaining number ends with one of these pairs.  
- Strategy:  
  1. Iterate over all pairs of digits `(j, i)` with `j < i`.  
  2. Form the two-digit number using `s[j]` and `s[i]`.  
  3. If this two-digit number is divisible by 25, calculate how many deletions are needed to bring these digits to the end.  
     - The formula is: `deletions = length - j - 2`.  
  4. Track the minimum deletions across all valid pairs.  
- This brute force approach works because the string length is small (≤ 18), so checking all pairs is efficient.  

## Time and Space Complexity  
- **Time Complexity:** `O(n²)` per test case, since we check all pairs of digits. 
- **Space Complexity:** `O(1)`, only a few variables are used for tracking counts.  
