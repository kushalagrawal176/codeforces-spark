# Problem Number - 514A Chewbaсca and Number  
**Problem Link:** [https://codeforces.com/problemset/problem/514/A](https://codeforces.com/problemset/problem/514/A)  

---

## Topics
- Implementation  
- Greedy  
- String Manipulation  

## Constraints
- Input: A single integer `x` (1 ≤ `x` ≤ 10¹⁸)  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks to minimize the given number by applying Chewbacca’s transformation rule:  
  - For each digit `d`, if `d > 4`, replace it with `9 - d`.  
  - Exception: the first digit should not become `0`. If transformation makes it `0`, keep it as `9`.  
- This ensures the number is minimized while still being valid (no leading zeros).  
- Steps:  
  - Convert the number to a string for easy digit manipulation.  
  - Traverse each digit and apply the transformation rule.  
  - Handle the special case for the first digit separately.  
  - Print the transformed number.  

## Time and Space Complexity
- **Time Complexity:** `O(k)`, where `k` is the number of digits in the input number.  
- **Space Complexity:** `O(k)`, for storing the string representation of the number.  
