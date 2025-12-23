# Problem Number - 1607A Linear Keyboard  
**Problem Link:** [https://codeforces.com/problemset/problem/1607/A](https://codeforces.com/problemset/problem/1607/A)  

---

## Topics  
- Strings  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 1000  
- `|a|` = 26 (a permutation of lowercase English letters)  
- 1 ≤ `|s|` ≤ 50  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem defines a custom keyboard layout `a`, which is a permutation of the 26 lowercase English letters.  
- Polycarp types a string `s` using this layout, and the "cost" of typing is defined as the sum of absolute differences between positions of consecutive characters in `s`.  
- To solve this:  
  - First, map each character in `a` to its position (1-based index).  
  - Then, iterate through the string `s`. For each consecutive pair of characters, compute the absolute difference between their positions in the layout.  
  - Accumulate this difference to get the total cost.  
- This approach ensures we directly compute the typing cost without simulating actual typing.  

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)` per test case, since we compute differences for each character in `s`.  
- **Space Complexity:** `O(26) = O(1)`, for storing the mapping of characters to positions.  