# Problem Number - 1878C Vasilije in Čačak  
**Problem Link:** [https://codeforces.com/problemset/problem/1878/C](https://codeforces.com/problemset/problem/1878/C)  

---

## Topics
- Implementation  
- Math  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 ⋅ 10⁵  
- 1 ≤ `k` ≤ `n`  
- 1 ≤ `x` ≤ 4 ⋅ 10¹⁰  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to select `k` distinct integers from `1` to `n` such that their sum equals `x`.  
- Key observations:  
  - The **minimum possible sum** occurs when choosing the smallest `k` numbers: `minSum = 1 + 2 + ... + k = (k * (k + 1)) / 2` 
  - The **maximum possible sum** occurs when choosing the largest `k` numbers:  `maxSum = n + (n-1) + ... + (n-k+1) = (k * (n + (n-k+1))) / 2`  
  - If `x` lies within `[minSum, maxSum]`, then the answer is `"YES"`. Otherwise, `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, constant extra space used.  
