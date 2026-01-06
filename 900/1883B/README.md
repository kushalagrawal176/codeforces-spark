# Problem Number - 1883B Chemistry  
**Problem Link:** [https://codeforces.com/problemset/problem/1883/B](https://codeforces.com/problemset/problem/1883/B)  

---

## Topics
- Implementation  
- Greedy  
- Strings  
- Frequency Counting  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁵ (length of string)  
- 0 ≤ `k` < `n`  
- String consists of lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to rearrange the string into a palindrome after deleting at most `k` characters.  
- Key observations:  
  - A palindrome can have at most one character with an odd frequency (for odd-length strings).  
  - If more than one character has an odd frequency, we must delete some characters to reduce the number of odd frequencies.  
- Steps:  
  1. Count the frequency of each character in the string.  
  2. Count how many characters have odd frequencies.  
  3. To make the string a palindrome, we need to delete `(oddCount - 1)` characters (if oddCount > 1).  
  4. If `(oddCount - 1) ≤ k`, then it is possible → print `"YES"`.  
  5. Otherwise, print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for counting character frequencies.  
- **Space Complexity:** `O(26) = O(1)`, since only lowercase English letters are considered.  
