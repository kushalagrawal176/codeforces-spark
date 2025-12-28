# Problem Number - 1805A We Need the Zero  
**Problem Link:** [https://codeforces.com/problemset/problem/1805/A](https://codeforces.com/problemset/problem/1805/A)  
---

## Topics
- Implementation  
- Bit Manipulation  
- XOR  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 10^3 (number of elements in the array)  
- 0 ≤ `a[i]` ≤ 2^8 (array values)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to find a value `x` such that after replacing each element `a[i]` with `(a[i] ^ x)`, the XOR of the entire array becomes `0`.  
- Key observations:  
  1. Let `val = XOR of all elements in the array`.  
  2. If we choose `x = val`, then each element becomes `(a[i] ^ val)`.  
  3. Compute the XOR of this transformed array. If it equals `0`, then `val` is the answer.  
  4. Otherwise, no such `x` exists, and the answer is `-1`.  
- This works because XOR has the property of cancellation and symmetry, making `val` the only possible candidate.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we compute XOR twice over the array.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
