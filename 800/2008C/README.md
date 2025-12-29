# Problem Number - 2008C Longest Good Array  
**Problem Link:** [https://codeforces.com/problemset/problem/2008/C](https://codeforces.com/problemset/problem/2008/C)  

---

## Topics  
- Implementation  
- Greedy  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 10^4
- 1 ≤ `l` ≤ `r` ≤ 10^9  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks for the maximum possible length of a "good array" starting from `l` and ending at or before `r`.  
- A "good array" is defined such that each next element is strictly greater than the previous one, and the difference increases by 1 each time.  
- Starting from `l`, we keep adding increasing differences: first `+1`, then `+2`, then `+3`, and so on.  
- We continue this process until the sum exceeds `r`.  
- The count of steps taken before exceeding `r` gives the maximum length of the good array.  
- If the sum exactly equals `r`, then the length is `cnt`. Otherwise, if it overshoots, the length is `cnt - 1`.  

## Time and Space Complexity  
- **Time Complexity:** `O(√(r - l))`, since the sum of first `k` integers grows quadratically and we stop once it exceeds `r - l`.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  
