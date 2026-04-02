# Problem Number - 2174A Needle in a Haystack

**Problem Link:** [https://codeforces.com/problemset/problem/2174/A](https://codeforces.com/problemset/problem/2174/A)

---

## Topics
- Strings
- Greedy
- Sorting
- Two pointers
- Implementation

## Constraints
- **1 ≤ T ≤ 10⁴** (number of test cases)
- **1 ≤ |s| ≤ 10⁵** (length of string `s`)
- **|s| ≤ |t| ≤ 10⁵** (length of string `t`)
- Both strings consist of lowercase English letters only
- **Sum of |t| across all test cases ≤ 10⁵**
- **Time limit per test:** 2 seconds  
- **Memory limit per test:** 256 megabytes  

## Intuition / Approach
- We are given two strings:  
  - `s` → the target subsequence we want to embed.  
  - `t` → the string whose letters can be shuffled.  

- The task is to **reorder the letters of `t`** so that `s` appears as a subsequence, and among all valid reorderings, we must find the **lexicographically smallest** one.

### Steps:
1. **Check feasibility:**  
   - Count the frequency of each character in `t`.  
   - Subtract the frequency of characters in `s`.  
   - If any character in `s` is missing in `t`, output `"Impossible"`.

2. **Construct the answer:**  
   - Place the characters of `s` in order, ensuring they appear as a subsequence.  
   - Distribute the remaining characters of `t` around `s` in such a way that the final string is lexicographically smallest.  
   - This is achieved by greedily inserting leftover characters before or after parts of `s` depending on their lexicographic order.

3. **Lexicographic ordering:**  
   - Iterate through characters `'a'` to `'z'`.  
   - Append leftover characters in sorted order.  
   - Insert `s` at the correct position to ensure subsequence property and minimal lexicographic value.

## Time and Space Complexity
- **Time Complexity:**  
  - `O(|t|)` per test case for frequency counting and construction.  
  - Since the sum of |t| ≤ 10⁵, this is efficient.  

- **Space Complexity:**  
  - `O(26)` for frequency array (constant space).  
  - `O(|t|)` for storing the result string.  