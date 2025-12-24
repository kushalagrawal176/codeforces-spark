# Problem Number - 1324C Frog Jumps  
**Problem Link:** [https://codeforces.com/problemset/problem/1324/C](https://codeforces.com/problemset/problem/1324/C)  

---

## Topics  
- Implementation  
- Strings  
- Greedy  
- Binary Search

## Constraints  
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `|s|` ≤ 2*10^5 (length of the string per test case)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The frog can only reach `n+1` by jumping on stones marked with `'R'`. Stones marked with `'L'` are not useful.  
- To determine the maximum jump length, we need to find the largest gap between consecutive `'R'` stones.  
- A neat trick is to add `'R'` at both the beginning and end of the string. This ensures that the frog’s starting and ending positions are considered safe stones.  
- Then, iterate through the string and calculate the distance between consecutive `'R'` characters.  
- The maximum of these distances is the answer, as it represents the longest jump the frog must make.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan through the string once.  
- **Space Complexity:** `O(1)`, only a few variables are used for tracking positions and maximum distance.  
