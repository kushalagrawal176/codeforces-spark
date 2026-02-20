# Problem Number - 2162C Beautiful XOR  

**Problem Link:** [https://codeforces.com/problemset/problem/2162/C](https://codeforces.com/problemset/problem/2162/C)  

---

## Topics
- Bit Manipulation  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `a`, `b` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given two integers `a` and `b`. The task is to construct a sequence of numbers by performing following operations:
    - choose integer `x` such that 0 ≤ `x` ≤ `a` (current value of `a`)
    - `a` = `a` ⊕ `x`
- After a sequence of opeartions `a` should be equal to `b`.
- Find any sequence of numbers, at most 100 else `-1` if not posssible.
- Property of XOR used - **a ⊕ (a ⊕ b) = b** (This tranforms `a` to `b`)

### Key Observations:
1. **Impossible Case:**  
   - If `b > a` and `(a ^ b) > a`, then no valid sequence exists. Output `-1`.  

2. **Trivial Case:**  
   - If `a == b`, then the sequence can be empty (no numbers needed). Output `0`.  

3. **Two-element Case:**  
   - If `(a ^ b) > a`, then we can form a sequence of length 2: `[b, a]`.  

4. **One-element Case:**  
   - Otherwise, a single element `(a ^ b)` suffices. Output `1` followed by `(a ^ b)`.  

This greedy approach ensures the minimal sequence length is chosen while satisfying both XOR and sum conditions.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a few bitwise and comparison operations are performed.  
- **Space Complexity:** `O(1)`, no extra memory used.  