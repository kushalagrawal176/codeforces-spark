# Problem Number - 1734C Removing Smallest Multiples  
**Problem Link:** [https://codeforces.com/problemset/problem/1734/C](https://codeforces.com/problemset/problem/1734/C)  

---

## Topics
- Greedy  
- Implementation  
- Number Theory  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁶ (length of string per test case)  
- String `s` consists of characters `'0'` and `'1'`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given a binary string of length `n`.  
- Each position `j` corresponds to an integer from 1 to `n`.  
- If `s[j] = '1'`, that position is already "removed" and cannot be considered.  
- Otherwise, we can remove it at a cost equal to the smallest divisor `k` that reaches it.  

### Steps:
1. Iterate over all possible divisors `k` from 1 to `n`.  
2. For each multiple `j` of `k`, check if `s[j-1]` is `'1'`.  
   - If yes, stop processing further multiples of `k`.  
   - If no, and if `j` has not been removed yet, assign cost `k` and mark it as removed.  
3. Accumulate the total cost.  
4. Print the result for each test case.  

This greedy approach ensures that each position is removed with the smallest possible divisor cost.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case, since each position is visited through its divisors.  
- **Space Complexity:** `O(n)`, for storing the removal state of each position.  
