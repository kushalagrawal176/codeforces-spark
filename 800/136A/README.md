# Problem Number - 136A Presents  
**Problem Link:** [https://codeforces.com/problemset/problem/136/A](https://codeforces.com/problemset/problem/136/A)  

---

## Topics  
- Implementation  
- Arrays  
- Simulation  

## Constraints  
- 1 ≤ `n` ≤ 100 (number of friends)  
- Each friend gives exactly one present to another friend  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem describes a scenario where `n` friends exchange presents.  
- Each friend `i` gives a present to friend `p[i]`.  
- We are asked to determine, for each friend `j`, who gave them a present.  
- Essentially, we need to invert the mapping:  
  - Input gives `giver → receiver`.  
  - Output should be `receiver → giver`.  

### Approach:  
- Read the number of friends `n`.  
- Read the array `p` of size `n`, where `p[i]` is the receiver of friend `i+1`.  
- Construct a new array `ans` of size `n`.  
- For each `i` from 1 to `n`:  
  - Set `ans[p[i] - 1] = i + 1`.  
- Print the array `ans`.  

This way, each position in `ans` tells us who gave a present to that friend.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we process each friend once.  
- **Space Complexity:** `O(n)`, for storing the inverted mapping.  
