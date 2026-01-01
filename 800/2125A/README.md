# Problem Number - 2125A Difficult Contest  
**Problem Link:** [https://codeforces.com/problemset/problem/2125/A](https://codeforces.com/problemset/problem/2125/A)  

---

## Topics  
- Implementation  
- Strings  
- Frequency Counting  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `|s|` ≤ 2⋅10⁵ (length of string per test case)  
- Characters in `s` are uppercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem requires rearranging the characters of a given string based on specific rules.  
- We need to group the characters `'T'`, `'F'`, and `'N'` together in the order:  
  - All `'T'` first  
  - Then all `'F'`  
  - Then all `'N'`  
- Any other characters remain in their original order and are appended at the end.  
- This can be solved by:  
  1. Counting the occurrences of `'T'`, `'F'`, and `'N'`.  
  2. Constructing a new string with all `'T'`, then `'F'`, then `'N'`.  
  3. Iterating again to append all other characters in their original order.  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case, read the string `s`.  
3. Count the occurrences of `'T'`, `'F'`, and `'N'`.  
4. Build the result string:  
   - Append `'T'` repeated `ts` times.  
   - Append `'F'` repeated `f` times.  
   - Append `'N'` repeated `n` times.  
5. Append all other characters in their original order.  
6. Print the final string.  

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)` per test case, since we iterate through the string twice.  
- **Space Complexity:** `O(|s|)`, for storing the output string.  
