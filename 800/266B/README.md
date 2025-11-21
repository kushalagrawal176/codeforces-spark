# Problem Number - 266B Queue at the School  
**Problem Link:** [https://codeforces.com/problemset/problem/266/B](https://codeforces.com/problemset/problem/266/B)  

---

## Topics  
- Strings  
- Simulation  
- Implementation  

## Constraints  
- 1 ≤ `n` ≤ 50 (length of the queue)  
- 1 ≤ `t` ≤ 50 (number of seconds)  
- Queue string consists of characters `'B'` (boy) and `'G'` (girl)  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem describes a queue of boys (`B`) and girls (`G`).  
- Each second, every boy who has a girl immediately behind him swaps positions with that girl.  
- The task is to simulate this process for `t` seconds and output the final arrangement of the queue.  

### Approach:  
- Represent the queue as a string or character array.  
- For each second (loop `t` times):  
  - Traverse the string from left to right.  
  - Whenever you find the pattern `"BG"`, swap them to `"GB"`.  
  - After swapping, skip the next index to avoid double-swapping in the same second.  
- After `t` iterations, print the final string.  

This direct simulation works efficiently because both `n` and `t` are small (≤ 50).  

## Time and Space Complexity  
- **Time Complexity:** `O(n × t)`, since we simulate each second and traverse the queue.  
- **Space Complexity:** `O(n)`, for storing the queue string.  
