# Problem Number - 1399C Boats Competition  
**Problem Link:** [https://codeforces.com/problemset/problem/1399/C](https://codeforces.com/problemset/problem/1399/C)  

---

## Topics
- Greedy  
- Implementation  
- Frequency Counting  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 50 (number of boats per test case)  
- 1 ≤ `weight` ≤ `n` (weight of each boat)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We want to maximize the number of pairs of boats such that the sum of their weights is the same.  
- Key idea:  
  1. Count the frequency of each weight.  
  2. For each possible sum `s` (from 2 to 200), calculate how many pairs can be formed.  
     - For each weight `w`, check its complement `s - w`.  
     - Add `min(freq[w], freq[s-w])` to the count.  
  3. Track the maximum number of pairs across all sums.  
- Finally, divide by 2 because each pair is counted twice in the loop.  

This ensures we find the maximum number of valid pairs for any possible sum.

## Time and Space Complexity
- **Time Complexity:** `O(n + W²)`, where W = 100 (max weight). This is efficient since W is small.  
- **Space Complexity:** `O(W)`, storing frequency counts.  