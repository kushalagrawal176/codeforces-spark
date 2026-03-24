# Problem Number - 2140A Shift Sort  
**Problem Link:** [https://codeforces.com/problemset/problem/2140/A](https://codeforces.com/problemset/problem/2140/A)  

---

## Topics
- Strings  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 100  
- 3 ≤ `n` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to determine the minimum number of operations required to sort a binary string (all `0`s followed by all `1`s).  
- The allowed operation is choosing three indices `(i, j, k)` and cyclically shifting their values either left or right.  
- Key observation:  
  - Sorting a binary string essentially means moving all `0`s to the front and all `1`s to the back.  
  - The only problematic positions are the first `z` characters (where `z` is the number of `0`s). If any of these positions contain a `1`, it must be moved out.  
- Therefore, the minimum number of operations equals the number of `1`s in the first `z` positions of the string.  
- This works because each misplaced `1` can be corrected using the allowed cyclic shift operations.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we count zeros and then check the first `z` positions.  
- **Space Complexity:** `O(1)`, only a few counters are used.  
