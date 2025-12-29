# Problem Number - 2055A Two Frogs  
**Problem Link:** [https://codeforces.com/problemset/problem/2055/A](https://codeforces.com/problemset/problem/2055/A)  

---

## Topics  
- Implementation  
- Math  
- Games
- Parity Check  

## Constraints  
- 1 ≤ `t` ≤ 500  
- 2 ≤ `n` ≤ 100  
- 1 ≤ `a`, `b` ≤ `n`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether two frogs starting at positions `a` and `b` on a line of length `n` can meet at the same position after making jumps.  
- Each frog jumps alternately, and the parity (odd/even nature) of their distance determines if they can meet.  
- If the absolute difference between `a` and `b` is **odd**, then they will never meet because their positions will always differ by an odd number.  
- If the difference is **even**, then they can meet at some point.  
- Thus, the solution is simply checking:  `|a-b| mod 2 == 0` => **YES**
- Otherwise, the answer is **NO**.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since only a single parity check is required.  
- **Space Complexity:** `O(1)`, no extra space used.  
