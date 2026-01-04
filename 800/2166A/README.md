# Problem Number - 2166A Same Difference  

**Problem Link:** [https://codeforces.com/problemset/problem/2166/A](https://codeforces.com/problemset/problem/2166/A)  

---

## Topics
- Strings  
- Implementation  
- Counting  

## Constraints
- 1 ≤ `t` ≤ 20 (number of test cases)  
- 2 ≤ `n` ≤ 100 (length of string per test case)  
- Sum of n across all test cases ≤ 100  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given a string `s` of length `n`.  
- The task is to count how many characters (excluding the last one) are **different** from the last character of the string.  

### Key Observations:
1. The last character `s[n-1]` acts as a reference.  
2. Traverse the string from index `n-2` down to `0`.  
3. If `s[i] != s[n-1]`, increment the counter.  
4. Print the counter as the result.  

This works because the problem only cares about differences relative to the last character, not the entire string.  

### Steps:
1. Read the number of test cases `t`.  
2. For each test case, read `n` and the string `s`.  
3. Initialize `cnt = 0`.  
4. Loop from `n-2` down to `0`:  
   - If `s[i] != s[n-1]`, increment `cnt`.  
5. Print `cnt`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the string once.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  