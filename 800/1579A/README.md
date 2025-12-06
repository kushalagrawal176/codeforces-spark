# Problem Number - 1579A Casimir's String Solitaire

**Problem Link:** [https://codeforces.com/problemset/problem/1579/A](https://codeforces.com/problemset/problem/1579/A)

---

## Topics
- Implementation  
- Strings  
- Counting  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `|s|` ≤ 50  
- String consists only of characters 'A', 'B', 'C'  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether the given string can be reduced to empty using Casimir’s solitaire rules.  
- Rule: You can remove one `'A'` and one `'B'` together, or one `'B'` and one `'C'` together.  
- Key observation:
  - For the string to be reducible, the number of 'B's must equal the sum of the number of 'A's and 'C's.  
  - This is because every removal operation consumes exactly one 'B' and one of either 'A' or 'C'.  
- Steps:
  1. Count the number of `'A'`, `'B'`, and `'C'` in the string.  
  2. If `count(B) == count(A) + count(C)`, print `"YES"`.  
  3. Otherwise, print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(|s|)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only constant space is used for counters.  
