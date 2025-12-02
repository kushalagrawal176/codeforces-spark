# Problem Number - 959A Mahmoud and Ehab and the even-odd game
**Problem Link:** [https://codeforces.com/problemset/problem/959/A](https://codeforces.com/problemset/problem/959/A)

---

## Topics
- Implementation
- Game Theory
- Math

## Constraints
- 1 ≤ `n` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The game is played with a single integer `n`.  
- Mahmoud wins if `n` is even, while Ehab wins if `n` is odd.  
- Therefore, the solution reduces to checking the parity of `n`:  
  - If `n % 2 == 0`, print `"Mahmoud"`.  
  - Otherwise, print `"Ehab"`.  
- This is a straightforward parity check problem with no complex logic required.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only a single arithmetic operation and comparison are performed.  
- **Space Complexity:** `O(1)`, only constant space is used.
