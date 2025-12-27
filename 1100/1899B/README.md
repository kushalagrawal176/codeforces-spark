# Problem Number - 1899B 250 Thousand Tons of TNT  
**Problem Link:** [https://codeforces.com/problemset/problem/1899/B](https://codeforces.com/problemset/problem/1899/B)  

---

## Topics
- Prefix Sums  
- Divisors / Factors  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 1.5 × 10^5 (array size)  
- 1 ≤ `a[i]` ≤ 10^9 (array elements)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to divide the array into equal-sized contiguous segments (possible only when the segment size is a divisor of `n`).  
- For each valid segment size `k`, we compute the sum of all segments of length `k`.  
- The goal is to maximize the difference between the maximum segment sum and the minimum segment sum across all divisors of `n`.  
- Steps:  
  1. Compute prefix sums of the array to quickly calculate segment sums.  
  2. Find all divisors of `n` (possible segment sizes).  
  3. For each divisor `k`, iterate through the array in chunks of size `k` and compute segment sums using prefix sums.  
  4. Track the maximum and minimum segment sums for that divisor.  
  5. Update the global maximum difference (`maxi = max(maxi, maxSum - minSum)`).  
- The answer is the largest difference across all divisors.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n + d × (n/k))` where `d` is the number of divisors of `n`.  
  - In worst case, `O(n × sqrt(n))` since the number of divisors is at most O(sqrt(n)).  
- **Space Complexity:**  
  - `O(n)` for storing prefix sums.  
  - `O(1)` additional space for calculations.  
