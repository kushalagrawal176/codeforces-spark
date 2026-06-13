# Problem Number - 2110B Down with Brackets  
**Problem Link:** [https://codeforces.com/problemset/problem/2110/B](https://codeforces.com/problemset/problem/2110/B)  

---

## Topics
- Strings
- Implementation
- Greedy

---

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `|s|` ≤ 2 ⋅ 10⁵ (length of each string)  
- The sum of `|s|` across all test cases ≤ 2 ⋅ 10⁵  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- The problem asks whether a given bracket sequence can be split into **two non-empty valid subsequences**.  
- A valid bracket sequence means that the number of opening brackets `(` and closing brackets `)` are balanced and properly ordered.  
- Key observation:  
  - If the sequence is balanced at some position **before the last character**, then we can split it into two valid parts.  
  - This happens when the running count of open brackets (`o`) becomes zero before the end of the string.  
- Algorithm:  
  1. Traverse the string while maintaining a counter `o` (`+1` for `(`, `-1` for `)`).  
  2. If `o == 0` at any index that is not the last index, output `"YES"`.  
  3. Otherwise, output `"NO"`.  

---

## Time and Space Complexity
- **Time Complexity:** `O(|s|)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only a counter and a string variable are used.  