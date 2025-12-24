# Problem Number - 1931A Recovering a Small String  
**Problem Link:** [https://codeforces.com/problemset/problem/1931/A](https://codeforces.com/problemset/problem/1931/A)  

---

## Topics  
- Implementation  
- Strings  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 100  
- 3 ≤ `n` ≤ 78  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to construct a lexicographically smallest string of length 3 using lowercase English letters such that the sum of their positions in the alphabet equals `n`.  
  - For example, `'a'` = 1, `'b'` = 2, ..., `'z'` = 26.  
- Since the string length is fixed at 3, we need to distribute the value `n` across three characters.  
- A simple greedy construction works:  
  - If `n ≤ 28`: use `"aa"` followed by the character `(n - 2)` in the alphabet.  
  - If `29 ≤ n ≤ 53`: use `"a"`, then a middle character, and `"z"`.  
  - If `54 ≤ n ≤ 78`: use a starting character followed by `"zz"`.  
- This ensures the sum of positions equals `n` while keeping the string length exactly 3.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only arithmetic and string construction are performed.  
- **Space Complexity:** `O(1)`, no extra storage required.  
