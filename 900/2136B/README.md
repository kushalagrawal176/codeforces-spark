# Problem Number - 2136B Like the Bitset

**Problem Link:** [https://codeforces.com/problemset/problem/2136/B](https://codeforces.com/problemset/problem/2136/B)

---

## Topics
- Greedy
- Implementation
- Strings
- Permutations
- Two pointers

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2 · 10⁵ (length of string)
- 1 ≤ `k` ≤ `n`
- Sum of n across all test cases ≤ 2 · 10⁵
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- We are given a binary string `s` of length `n` and an integer `k`.  
- The task is to construct a permutation `p` of length `n` such that:
  - For every position `i` where `s[i] = 1`, in any interval `[l, r]` of length at least `k` that covers `i`, the maximum element in that interval is **not** `p[i]`.
  - No constraints apply to positions where `s[i] = 0`.

---

## Key Observations
- If there are **k consecutive `1`s** in the string, it is impossible to satisfy the condition, because one of them would **inevitably become the maximum** in a length-`k` interval.  
- Otherwise, we can construct a valid permutation:
  - Assign **small values** (starting from 1 upwards) to positions with `1`.  
  - Assign **large values** (starting from `n` downwards) to positions with `0`.  
- This ensures that any interval of length ≥ `k` containing a `1` will also contain a `0` with a larger value, preventing the `1` position from being the maximum.

### Steps
1. Check if the string contains `k` consecutive `1`s:
   - If yes → print `"NO"`.
   - If no → print `"YES"`.
2. Construct the permutation:
   - Initialize `low = 1` and `high = n`.
   - Traverse the string:
     - If `s[i] == '1'`, assign `low++`.
     - If `s[i] == '0'`, assign `high--`.

---

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` per test case (linear scan + permutation construction).   
- **Space Complexity:**  
  - `O(1)`, only counters and output storage.  