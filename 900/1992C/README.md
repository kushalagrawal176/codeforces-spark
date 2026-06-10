# Problem Number - 1992C Gorilla and Permutation  

**Problem Link:** [https://codeforces.com/problemset/problem/1992/C](https://codeforces.com/problemset/problem/1992/C)  

---

## Topics  
- Implementation
- Constructive Algorithms 
- Permutations

---

## Constraints  
- 1 ≤ `t` ≤ 10⁴ 
- 2 ≤ `n` ≤ 10⁵ 
- 1 ≤ `m` < `k` ≤ `n`  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The problem asks us to construct a permutation of numbers from `1` to `n` such that the maximum element among the first `m` numbers is exactly `k`.  
- To achieve this, we need to carefully order the numbers so that:  
  - The first `m` elements contain `k` as their maximum.  
  - The rest of the elements can be arranged freely, as long as the permutation remains valid.  
- A constructive way to do this is:  
  - Place numbers from `n` down to `m+1` first. These are larger than `m` and ensure that the maximum in the first `m` elements is controlled.  
  - Then place numbers from `1` to `m`. This guarantees that the maximum in the first `m` elements is exactly `m`, which equals `k` in the problem’s setup.  
- This construction satisfies the condition and produces a valid permutation for each test case.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we print the permutation directly.  
- **Space Complexity:** `O(1)`, as no extra data structures are required beyond simple iteration.  
