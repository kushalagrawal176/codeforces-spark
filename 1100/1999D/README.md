# Problem Number - 1999D Slavic's Exam
**Problem Link:** [https://codeforces.com/problemset/problem/1999/D](https://codeforces.com/problemset/problem/1999/D)  

---

## Topics  
- Strings  
- Greedy  
- Implementation  

## Constraints  
- 1 ≤ t ≤ 10000 (number of test cases)  
- 1 ≤ |s| ≤ 2*10^5 (length of strings)  
- 1 ≤ |t| ≤ |s| (length of strings)  
- Strings consist of lowercase English letters and `?` characters  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- You are given two strings `a` and `b`. The goal is to check if you can transform string `a` into a string that contains `b` as a subsequence.  
- Transformation rule: replace each `?` in `a` with any lowercase letter.  
- Approach:  
  - Use two pointers: one for `a` and one for `b`.  
  - Traverse both strings:  
    - If `a[i] == '?'`, replace it with `b[j]` and move both pointers forward.  
    - If `a[i] == b[j]`, keep the character and move both pointers forward.  
    - Otherwise, keep `a[i]` and move only the pointer of `a`.  
  - After traversal, replace any remaining `?` in `a` with `'a'`(or any other character).  
  - If the pointer for `b` reaches the end, it means `b` is a subsequence of the transformed `a`. Print `"YES"` and the transformed string.  
  - Otherwise, print `"NO"`.  

This greedy approach ensures that we always try to match characters of `b` as early as possible while filling `?` optimally.  

## Time and Space Complexity  
- **Time Complexity:** O(|a| + |b|) per test case, since we traverse both strings once.  
- **Space Complexity:** O(|a|), for storing the transformed string.  