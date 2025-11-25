# Problem Number - 1676A Lucky?  
**Problem Link:** [https://codeforces.com/problemset/problem/1676/A](https://codeforces.com/problemset/problem/1676/A)  

---

## Topics
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- Each string `s` has exactly 6 characters (digits from '0' to '9')  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine if a 6-digit ticket number is "lucky".  
- A ticket is considered lucky if the **sum of the first three digits** equals the **sum of the last three digits**.  
- Approach:  
  1. Read the string `s` of length 6.  
  2. Compute the sum of digits at positions 0, 1, 2.  
  3. Compute the sum of digits at positions 3, 4, 5.  
  4. Compare the two sums.  
  5. If they are equal, print `"YES"`, otherwise print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only 6 digits are processed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
