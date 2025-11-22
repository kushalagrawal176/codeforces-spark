# Problem Number - 520A Pangram  
**Problem Link:** [https://codeforces.com/problemset/problem/520/A](https://codeforces.com/problemset/problem/520/A)  

---

## Topics  
- Strings  
- Implementation  
- Sets / HashMap

## Constraints  
- 1 ≤ `n` ≤ 100  
- Input string length = n  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- A pangram is a string that contains every letter of the English alphabet at least once.  
- If the string length `n` is less than 26, it cannot be a pangram → output `"NO"`.  
- Otherwise, convert the string to lowercase and collect all distinct characters using a `set`.  
- If the size of the set is 26, then the string contains all letters → output `"YES"`.  
- Otherwise, output `"NO"`.  

### Example  
- Input: `n = 12, s = "toosmallword"`  
  - Distinct letters = 8  
  - Output: `"NO"`  

- Input: `n = 35, s = "TheQuickBrownFoxJumpsOverTheLazyDog"`  
  - Distinct letters = 26  
  - Output: `"YES"`  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we iterate through the string once.  
- **Space Complexity:** `O(1)`, because at most 26 distinct characters are stored.  
