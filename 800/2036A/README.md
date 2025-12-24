# Problem Number - 2036A Quintomania  
**Problem Link:** [https://codeforces.com/problemset/problem/2036/A](https://codeforces.com/problemset/problem/2036/A)  

---

## Topics  
- Implementation  
- Arrays  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 1000
- 2 ≤ `n` ≤ 50
- 0 ≤ `a[i]` ≤ 127  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem provides a sequence of integers and asks whether it can be considered valid under specific rules.  
- Rule: For every pair of consecutive elements in the sequence, the absolute difference must be either **5** or **7**.  
- Approach:  
  - Read the sequence into an array.  
  - Iterate through consecutive pairs.  
  - For each pair `(arr[i], arr[i+1])`, check if `|arr[i+1] - arr[i]|` equals 5 or 7.  
  - If all pairs satisfy the condition, output `"YES"`. Otherwise, output `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for checking each consecutive pair in the sequence.  
- **Space Complexity:** `O(n)`, for storing the sequence.  
