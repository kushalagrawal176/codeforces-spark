# Problem Number - 1703D Double Strings  
**Problem Link:** [https://codeforces.com/problemset/problem/1703/D](https://codeforces.com/problemset/problem/1703/D)  

---

## Topics
- Strings  
- Hashing / Sets  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁵ (number of strings per test case)  
- 1 ≤ `|s|` ≤ 8 (length of each string)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine, for each string, whether it can be split into two non-empty parts such that **both parts exist in the given set of strings**.  
- For each string `s`, we try every possible split position `j` (from 1 to |s|-1).  
  - Prefix = `s[0..j-1]`  
  - Suffix = `s[j..|s|-1]`  
- If both prefix and suffix are present in the set of strings, then the string qualifies as a "double string".  
- We output `1` if such a split exists, otherwise `0`.  
- This is repeated for all strings in the test case.  

## Time and Space Complexity
- **Time Complexity:**  
  - For each string of length `m`, we check up to `m-1` splits.  
  - Each lookup in a hash set is `O(1)`.  
  - So per test case: `O(n × m)`, where m ≤ 8.  
  - Overall time complexity: `O(n × m) = O(n)`.  
- **Space Complexity:**  
  - `O(n)`, for storing all strings in a hash set.  
