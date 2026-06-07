# Problem Number - 1800B Count the Number of Pairs  
**Problem Link:** [https://codeforces.com/problemset/problem/1800/B](https://codeforces.com/problemset/problem/1800/B)  

---

## Topics
- Strings  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 ⋅ 10⁵
- 0 ≤ `k` ≤ `n`  
- Sum of `n` across all test cases ≤ 2 ⋅ 10⁵  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks us to count the maximum number of pairs that can be formed from a string containing both uppercase and lowercase English letters.  
- A valid pair consists of one lowercase and one uppercase version of the same letter (e.g., `a` and `A`).  
- First, we count the frequency of each lowercase and uppercase letter separately.  
- For each letter:
  - We can directly form `min(lowercase_count, uppercase_count)` pairs.  
  - After forming these direct pairs, some characters may remain unpaired.  
  - Using up to `k` operations, we can convert two leftover characters of the same case into one pair (since changing case allows pairing).  
- The greedy approach is:
  1. Form all direct pairs.  
  2. Use `k` operations to maximize additional pairs from leftovers.  
- This ensures the maximum number of pairs is achieved.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through the string and then through 26 letters.  
- **Space Complexity:** `O(26) = O(1)`, as we only store frequency counts for 26 letters.  