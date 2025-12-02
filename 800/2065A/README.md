# Problem Number - 2065A Skibidus and Amog'u
**Problem Link:** [https://codeforces.com/problemset/problem/2065/A](https://codeforces.com/problemset/problem/2065/A)

---

## Topics
- Implementation
- Strings
- Simulation
- Greedy

## Constraints
- 1 ≤ `t` ≤ 100  
- 2 ≤ `|s|` ≤ 10  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem provides a string `s` representing a name and asks us to transform it according to specific rules.  
- For each test case:
  - Replace the **second last character** of the string with `'i'`.  
  - Remove the **last character** of the string.  
- This simulates the required "name change" operation.  
- Using string manipulation functions (like `setCharAt` in Java or direct indexing in C++), we can efficiently perform the transformation.

## Time and Space Complexity
- **Time Complexity:** `O(|s|)` per test case, since string operations may depend on the length of `s`.  
- **Space Complexity:** `O(1)`, aside from storing the string itself.
