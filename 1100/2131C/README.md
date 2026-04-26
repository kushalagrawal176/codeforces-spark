# Problem Number - 2131C Make it Equal

**Problem Link:** [https://codeforces.com/problemset/problem/2131/C](https://codeforces.com/problemset/problem/2131/C)

---

## Topics
- Implementation  
- Hashing / Maps  
- Modular Arithmetic  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `k` ≤ 10⁹  
- 0 ≤ `S[i]` ≤ 10⁹  
- 0 ≤ `T[i]` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem provides two arrays of length `n` and asks whether they can be made equal under modular transformations with respect to `k`.  
- For each element `a` in the array `S` and `T`, we consider both `a % k` and `k - (a % k)` as contributing values.  
- By counting the frequency of these values for both arrays, we can determine if the arrays are equivalent under the given transformation.  
- If the frequency maps of both arrays match exactly, the answer is **YES**; otherwise, **NO**.  

### Steps:
1. Read input values for `t`, `n`, and `k`.  
2. For the first array, compute `a % k` and `k - (a % k)` for each element and store counts in a map.  
3. Repeat the same for the second array.  
4. Compare the two maps:
   - If they are equal → print "YES".  
   - Otherwise → print "NO".  

This approach leverages hashing (maps/dictionaries) to efficiently compare modular equivalence classes.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we process each element once.  
- **Space Complexity:** `O(n)`, for storing frequency counts in maps.  
