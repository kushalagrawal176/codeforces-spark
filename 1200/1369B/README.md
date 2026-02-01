# Problem Number - 1369B AccurateLee  
**Problem Link:** [https://codeforces.com/problemset/problem/1369/B](https://codeforces.com/problemset/problem/1369/B)  

---

## Topics
- Strings  
- Implementation  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁵ (length of string per test case)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to transform a binary string into a "clean" string, where no substring `"10"` exists.  
- Observing the structure:
  - All leading zeros can remain untouched.  
  - All trailing ones can remain untouched.  
  - If there exists at least one `"10"` in the middle, we must insert a single `"0"` between the prefix of zeros and the suffix of ones to ensure no `"10"` substring remains.  
- Steps:
  1. Traverse from the start and collect all leading zeros.  
  2. Traverse from the end and collect all trailing ones.  
  3. If there exists a `"10"` pattern in between, add one `"0"` between the prefix and suffix.  
  4. Concatenate the prefix and suffix to form the final string.  

This greedy approach works because:
- Adding more than one `"0"` is unnecessary.  
- The minimal transformation ensures the string is lexicographically smallest while avoiding `"10"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string from both ends.  
- **Space Complexity:** `O(n)`, for storing the resulting string (though only linear in size of input).  
