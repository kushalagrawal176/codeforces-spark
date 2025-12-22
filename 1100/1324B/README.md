# Problem Number - 1324B Yet Another Palindrome Problem  
**Problem Link:** [https://codeforces.com/problemset/problem/1324/B](https://codeforces.com/problemset/problem/1324/B)  

---

## Topics
- Strings
- Implementation
- Palindromes

## Constraints
- 1 ≤ `t` ≤ 100  
- 3 ≤ `n` ≤ 5000  
- 1 ≤ `a[i]` ≤ n  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether there exists a subsequence of length **at least 3** that forms a palindrome.  
- A palindrome of length ≥ 3 requires that some element appears at least twice **with a gap** (i.e., not adjacent).  
- Thus, the task reduces to checking if there exists indices `i` and `j` such that `a[i] == a[j]` and `j - i ≥ 2`.  
- If such a pair exists, the answer is **YES**; otherwise, **NO**.  
- This can be done efficiently by storing the first occurrence of each element and checking subsequent occurrences for a gap.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan through the array once.  
- **Space Complexity:** `O(n)`, for storing indices or frequency of elements.  