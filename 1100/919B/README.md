# Problem Number - 919B Perfect Number  

**Problem Link:** [https://codeforces.com/problemset/problem/919/B](https://codeforces.com/problemset/problem/919/B)  

---

## Topics  
- Implementation  
- Brute Force  
- Number Theory  
- Binary search
- DP

## Constraints  
- 1 ≤ `k` ≤ 10000  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to find the `k`-th "perfect number," where a perfect number is defined as a positive integer whose sum of digits equals 10.  
- Starting from 19 (the smallest number with digit sum 10), we can iterate through integers and check their digit sums.  
- For each number:  
  - Compute the sum of its digits.  
  - If the sum equals 10, decrement `k`.  
- Continue until we reach the k-th perfect number.  
- Finally, output the number that corresponds to the k-th occurrence.  

This brute force approach works because the constraints are small enough (k ≤ 10000), and checking digit sums is efficient.  

## Time and Space Complexity  
- **Time Complexity:** `O(n × d)`, where `n` is the number of iterations until the k-th perfect number is found, and `d` is the number of digits in each number. Since digit sum calculation is fast and k ≤ 10000, this is efficient in practice.  
- **Space Complexity:** `O(1)`, as only a few integer variables are used for iteration and digit sum calculation.  
